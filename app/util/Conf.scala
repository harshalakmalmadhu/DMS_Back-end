package util

import com.typesafe.config.{Config, ConfigFactory}

object Conf {

//  val conf:Config =  ConfigFactory.load()
  val conf:Config =  ConfigFactory.parseResources("application.conf").resolve()
  val environment:String = sys.env.getOrElse("Ash","mu")

  /* Akka configs */
  val akkaConfig = conf.getConfig(s"$environment")

  //val documentManagementEngineBaseURL:String = conf.getString(s"$environment.documentManagementEngineBaseURL")

  val mongoConnectionString:String = conf.getString(s"$environment.db.mongo.connectionString")

  val mongoDBName:String = conf.getString(s"$environment.db.mongo.dbName")

  val mongoCollectionName:String = conf.getString(s"$environment.db.mongo.collectionName")

}
