package factories

//import play.db.Database
import slick.jdbc.MySQLProfile.api._
import util.Conf

object LocalSlick {

  lazy val mysqlDb = createConnectionMysql(getDefaultEnvironment + ".mysql")

//  lazy val oracleDb = createConnectionOracle(getDefaultEnvironment + ".oracle")

  def createConnectionMysql(confName:String) : slick.jdbc.MySQLProfile.backend.Database = Database.forConfig(confName)

//  def createConnectionOracle(confName:String) : slick.jdbc.OracleProfile.backend.Database = OracleDatabase.forConfig(confName)

  def getDefaultEnvironment:String = s"${Conf.environment}.db"


}
