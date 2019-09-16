package controllers

import javax.inject.Inject
import models.frm.mongo.entity.{DocumentDetails, UserReg}
import org.apache.logging.log4j.LogManager
import org.joda.time.DateTime
import play.api.libs.json.{JsValue, Json}
import play.api.mvc.{AbstractController, ControllerComponents}

import scala.concurrent.{ExecutionContext, Future}
import scala.util.parsing.json


class UploadController  @Inject()(cc: ControllerComponents)(implicit exec: ExecutionContext) extends AbstractController(cc) {
  val appLogger = LogManager.getLogger("app")

  def insertDoc = Action.async {

    request => {

      appLogger.info("logging here ")

      val ss = (new DocumentDetails insertDocument (Map(
        "_id" -> 300,
        "document_id" -> "100",
        "patient_id" -> "20",
        "tenant" -> "KSA"
      )))

      ss.map(
        success => {

          println(success.toString())

          Ok("Successful")
        }
      ).recover {
        case _ => Ok("failed")

      }

    }

  }

  def getFirstDoc = Action.async {

    request => {

      appLogger.info("logging here ")

      val aa = (new DocumentDetails getFirstDoc (Map(

      )))

      aa.map(
        success => {

          println(success.toJson())

          Ok(success.toJson())
        }
      ).recover {
        case _ => Ok("failed")

      }

    }

  }

  def getAllDocs = Action.async {

    request => {


      appLogger.info("logging here ")

      val ss = (new DocumentDetails getAllDocs (Map(

      )))

      ss.map(
        success => {

          println(success.toString())

          Ok(success.toString())
        }
      ).recover {
        case _ => Ok("failed")

      }

    }

  }

  def insertDocParam(id: Int, document_id: String, patient_id: String, tenant: String) = Action.async {

    request => {


      appLogger.info("logging here ")

      val result = (new DocumentDetails insertDocument (Map(
        "_id" -> id,
        "document_id" -> document_id,
        "patient_id" -> patient_id,
        "tenant" -> tenant
      )))

      result.map(
        success => {

          println(success.toString())

          Ok(success.toString())
        }
      ).recover {
        case _ => Ok("failed")

      }

    }

  }

  def insertBody = Action.async(parse.json) {
    request => {
      val body: JsValue = request.body
      println(body)
      val UserName = (request.body \ "UserName").as[String]
      val Email = (request.body \ "Email").as[String]
      val FullName = (request.body \ "FullName").as[String]
      val Password = (request.body \ "Password").as[String]
      val VehicleNumber = (request.body \ "VehicleNo").as[String]
      val MobileNo = (request.body \ "MobileNo").as[String]
      val created_date_time =  DateTime.now().toString()

      val ss = (new UserReg insertDocument (Map(
        "UserName" -> UserName,
        "Email" -> Email,
        "FullName" -> FullName,
        "Password" ->  Password,
        "VehicleNumber" ->  VehicleNumber,
        "MobileNo" ->  MobileNo,
        "created_date_time"  ->  created_date_time
      )))

      ss.map(
        success => {

          println(success.toString())

          Ok(Json.toJson(Map("Successful"->"true")))
        }
      ).recover {
        case _ => Ok(Json.toJson(Map("Successful"->"false")))

      }

    }


    }

  //==============================================================================================================



}


