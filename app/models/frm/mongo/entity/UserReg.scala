package models.frm.mongo.entity

import factories.LocalMongo
import org.bson.BsonDocument
import org.mongodb.scala.{Completed, Document}
import play.api.libs.json.JsValue
import services.Json
import util.Conf

import scala.concurrent.Future

class UserReg extends Json {

  val db = LocalMongo.getDB.getCollection("User_registration")

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

