package factories

import org.mongodb.scala._
import util.Conf

import scala.concurrent.ExecutionContext.Implicits.global
import scala.util.{Failure, Success}

object LocalMongo {

  private val mongoClient: MongoClient = MongoClient(Conf.mongoConnectionString)
  private val database: MongoDatabase = mongoClient.getDatabase(Conf.mongoDBName)

  def getDB = database

  def close = mongoClient.close()


//  mongoClient.startSession()

//  val database: MongoDatabase = mongoClient.getDatabase("dmm")



  def getData(): Unit = {

    println("came to get data ------")

    val replacementDoc: Document = Document("_document_id" -> 2, "x" -> 2, "y" -> 3)

//    Document(Map("a" -> "bb"))


//
    val collection = database.getCollection("document_details")


    database.listCollectionNames()

//    val fff = database.createCollection("sample_mu",
//      CreateCollectionOptions()
//        .capped(true)
//        .sizeInBytes(0x100000)).toFuture()
//
//
//    fff onComplete {
//      case Success(value) => println(value)
//
//      case Failure(exception) => exception.printStackTrace()
//    }


//    Await.result(fff, 5000 millis)

//    val textSearch: Bson = text("textual content -irrelevant", TextSearchOptions().language("english"))

//    collection.createIndex().printResults("Created an index named: ")



    import com.mongodb.client.model.IndexOptions
    val indexOptions = new IndexOptions().unique(true)

//    val ppp = collection.createIndex(Indexes.ascending("stars"), indexOptions).toFuture()
//val ppp =  collection.dropIndex("stars").toFuture()





//    ppp onComplete {
//      case Success(value) => println(value)
//
//      case Failure(exception) => exception.printStackTrace()
//    }
//
//    Await.result(ppp, 5000 millis)


//    collection.createIndex(
//      Seq(
//        IndexModel(
//          Indexes.ascending("name"),
//          IndexOptions().background(false).unique(true)
//        )
//      )
//    )

//
//    val insertObservable: Observable[Completed] = collection.insertOne(replacementDoc)
//
//    insertObservable.subscribe(new Observer[Completed] {
//      override def onNext(result: Completed): Unit = println(s"onNext: $result")
//      override def onError(e: Throwable): Unit = println(s"onError: $e")
//      override def onComplete(): Unit = println("onComplete")
//    })


//    val collection: MongoCollection[BsonDocument] = database.getCollection("document_details")

//    val document: BsonDocument = new BsonDocument("_id", new BsonInt32(2)).append("x", new BsonInt32(1))

    val future  = collection.insertOne(replacementDoc).toFuture()
//
//
    future onComplete {
      case Success(value) => println(value)

      case Failure(exception) => exception.printStackTrace()
    }

//
//    Await.result(future, 5000 millis)

//    println()


//    collection.insertOne(document).subscribe (
//      new Observer[Completed] {
//        override def onNext(result: Completed): Unit = println(s"onNext: $result")
//        override def onError(e: Throwable): Unit = println(s"onError: $e")
//        override def onComplete(): Unit = println("onComplete")
//      }
//    )



//    mongoClient.close()

  }





}
