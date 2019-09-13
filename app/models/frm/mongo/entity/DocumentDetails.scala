package models.frm.mongo.entity

import factories.LocalMongo
import org.mongodb.scala.{Completed, Document}
import services.Json
import util.Conf

import scala.concurrent.Future

class DocumentDetails extends Json {

  val db = LocalMongo.getDB.getCollection(Conf.mongoCollectionName)

  def insertDocument(data:Map[String,Any]): Future[Completed] = {

    val replacementDoc: Document = Document(toJson(data))

    db.insertOne(replacementDoc).toFuture()

  }
  def getFirstDoc(data:Map[String,Any]):  Future[Document] ={

    val id : Document =Document(toJson(data))

    db.find().first().toFuture()

  }
  def getAllDocs(data:Map[String,Any]):  Future[Seq[Document]] ={

    val id : Document =Document(toJson(data))



    //db.find().toFuture()
    db.find().collect().toFuture()

  }





}
