package services

import org.json4s.NoTypeHints
import org.json4s.jackson.JsonMethods._
import org.json4s.jackson.Serialization

/**
  * Created by mu
  */
trait Json {

  /**
    * Accept any data type and convert to Json String
    * @param value
    * @return String
    */
  def toJson(value:AnyRef): String = {
    implicit val formats = Serialization.formats(NoTypeHints)
    Serialization.write(value)
  }


  /**
    * Accept JSON String and convert according to expected type
    * @param jsonString
    * @param value
    * @return
    */
  def toAny(jsonString: String): Any = {
    implicit val formats = org.json4s.DefaultFormats
    parse(jsonString).extract[Any]
  }



}
