package controllers

import javax.inject.Inject
import models.frm.mongo.entity.DocumentDetails
import org.apache.logging.log4j.LogManager
import play.api.mvc.{AbstractController, ControllerComponents}

import scala.concurrent.ExecutionContext


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


}