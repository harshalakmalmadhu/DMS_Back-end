package models.frm.mongo

import factories.LocalMongo
import org.apache.logging.log4j.LogManager
import org.mongodb.scala.Completed
import util.Conf

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future

class Entry {

  val db = LocalMongo.getDB

  val mongoLogger = LogManager.getLogger("mongo")

  def init(): Unit = {

    checkTheDocumentExistsDocuments().map(
      isExists => if(!isExists) {
        mongoLogger.info(s"The collection ${Conf.mongoCollectionName} not exists and creating new one")
          createDocument()
            .map(
              _ => mongoLogger.info(s"Successfully created the document ${Conf.mongoCollectionName}")
            ).recover {

            case exception => mongoLogger.error("Error while creating the Document", exception)
          }
      } else {
        mongoLogger.info(s"The collection ${Conf.mongoCollectionName} already exists and skipping the creation part")
      }
    )

  }

  def checkTheDocumentExistsDocuments(): Future[Boolean] = {

    db.listCollectionNames().toFuture().map(
      list => {

        list.contains(Conf.mongoCollectionName)
      }
    ).recover {
      case exception => mongoLogger.error("Error while get the list of Document", exception)
        false
    }

  }


  def createDocument(): Future[Completed] = {
    db.createCollection(Conf.mongoCollectionName).toFuture()
  }

}
