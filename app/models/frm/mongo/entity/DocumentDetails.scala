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
  def getAllDocs():  Future[Seq[Document]] ={
    //db.find().toFuture()
    db.find().toFuture()

  }
  /*def insertDocumentbody(data:JsValue): Future[Either[Int,String]] = {

    val id =data("_id").as[Int]
    val document_id =data("").as[Int]
    val patient_id =data("").as[Int]
    val tenant =data("").as[String]




    val result = (
      "_id" -> id,
      "document_id" -> document_id,
      "patient_id" -> patient_id,
      "tenant" -> tenant
    )

    val replacementDoc: Document = Document(toJson(result))

    db.insertOne(replacementDoc)

  }*/






}
