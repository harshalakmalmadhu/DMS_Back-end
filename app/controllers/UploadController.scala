package controllers

import javax.inject.Inject
import models.frm.mongo.entity.{DocumentDetails, UserReg}
import org.apache.logging.log4j.LogManager
import org.joda.time.DateTime
import org.json4s.NoTypeHints
import org.json4s.jackson.Serialization
import play.api.libs.json.{JsValue, Json}
import play.api.mvc.{AbstractController, ControllerComponents}
import services.Json


import scala.concurrent.duration._
import scala.concurrent.{Await, ExecutionContext, Future}


class UploadController  @Inject()(cc: ControllerComponents)(implicit exec: ExecutionContext) extends AbstractController(cc) with Json {
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

      val ss = (new DocumentDetails getAllDocs())

      val i = Await.result(ss, 4 second)


      //println(i)



      val f=i.map(
        res => {  res.toJson()
              //println(toJson(res1._2))
            }

      ).toSeq


      println(f.toString())



      implicit val formats = Serialization.formats(NoTypeHints)

      //println(toJson(f))
      Future(Ok(toJson(f)))
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

      val UserName = (request.body \ "UserName").as[String]      val Email = (request.body \ "Email").as[String]
      val ServiceType = (request.body \ "servicetype").as[String]
      val MobileNo = (request.body \ "MobileNo").as[String]
      val VehicleNo = (request.body \ "VehicleNo").as[String]
      val SelectedDate = (request.body \ "SelectedDate").as[String]
      val SelectedSC = (request.body \ "SelectedSC").as[String]
      val SelectedTime = (request.body \ "SelectedTime").as[String]
      val created_date_time =  DateTime.now().toString()

      val ss = (new UserReg insertDocument (Map(
        "UserName" -> UserName,
        "Email" -> Email,
        "ServiceType" -> ServiceType,
        "MobileNo" ->  MobileNo,
        "VehicleNo" ->  VehicleNo,
        "SelectedDate" ->  SelectedDate,
        "SelectedSC" ->  SelectedSC,
        "SelectedTime" ->  SelectedTime,
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


