
import org.apache.spark.SparkContext
import org.apache.spark.sql.hive
import scala.io.Source
import com.scalayadu.fact._

object SparkHive {
  
  def main(args:Array[String]) = {
    
  val sc = new SparkContext("yarn-client","SparkHive")
  val hc = new org.apache.spark.sql.hive.HiveContext(sc)
  /*
  hc.sql("use dev_pi_enc")
  val query = "SELECT iid,mbr_cumb_id_no,CAST(cob_eff_dt AS string),CAST(add_cob_term_dt AS string) from dev_pi_enc.cob_td_ukm limit 200"
  val hive_tables = hc.sql(query)
  
  System.out.println(hive_tables.count());
  
  System.out.println(hive_tables.first());
  
  System.out.println(hive_tables.columns);
  
  val res_rdd = hive_tables.rdd
  
  val tuple_map =  res_rdd.map(row => (row.getString(0),row.getString(1),row.getString(2),row.getString(3)))
  
  val cob_map = tuple_map.map(f => tuple_cob_map(f))
  
  cob_map.foreach(cob_obj => System.out.println((cob_obj.getIid(),cob_obj.getMbr_cumb_id_no(),cob_obj.getCob_eff_dt(),cob_obj.getCob_exp_dt())))
  */
    val query_str = get_query_str()
    System.out.println("Query: ") 
      System.out.print(get_query_str())
     
   val query_res = hc.sql(query_str)
   query_res.show()
  
  }
  
  def tuple_cob_map(tup: (String,String,String,String)) = {
    val cob_obj = new Cob(tup._1,tup._2,tup._3,tup._4)
    cob_obj
  }
  
  def get_query_str() = {
    //val query_file = "/users/a088062/Spark-Scala/Spark_Hive/query.hql"
    val query_file = "query.hql"
    var query_str = ""
    val url = getClass.getResource(query_file)
    for(line <- Source.fromFile(query_file).getLines()){
      query_str = query_str + line
      //System.out.println(line)
    }
    query_str
  }
}