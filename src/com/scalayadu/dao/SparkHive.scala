
import org.apache.spark.SparkContext
import org.apache.spark.sql.hive
import org.apache.spark.sql.Row
import scala.io.Source
import com.scalayadu.fact._

object SparkHive {
  
  def main(args:Array[String]) = {
  
    /*
  val sc = new SparkContext("yarn-client","SparkHive")
  val hc = new org.apache.spark.sql.hive.HiveContext(sc)
  val query_str = get_query_str()
  //System.out.println("Query: ") 
  //System.out.print(get_query_str())
  val query_res = hc.sql(query_str)
  
  /*
  System.out.println(query_res.count());
  
  System.out.println(query_res.first());
  
  System.out.println(query_res.columns); */
  
  val res_rdd = query_res.rdd
  
  val claim_rdd = res_rdd.map(row => rdd_map(row))
  
  System.out.println("count: " + claim_rdd.count())
  
  System.out.println("first: " + claim_rdd.first())
  
  */
    System.out.print("lets see if this fixes the jar issue!")

  }
  
  /* This method maps each row of COB data from hive to the Scala Cob object
   * and creates a tuple of Cob Objects*/
  def tuple_cob_map(tup: (String,String,String,String)) = {
    val cob_obj = new Cob(tup._1,tup._2,tup._3,tup._4)
    cob_obj
  }
  
  /*def tuple_claim_map(tup: (String,String,String,String,String,String,String,String,
                            String,String,String,String,String,String,String,String,
                            Float,Float,Float,Float,Float,Float,Float,Float,
                            Float,Float,Float,Float,Float,Float,Float,Float,
                            Float,Float,Int,String,String,Boolean)) = {
    /*val cob_obj = new Cob(tup._1,tup._2,tup._3,tup._4)
    cob_obj*/
  }*/
  
  def rdd_map(row:Row) = {
    val claim = new Claim()
    claim.setClaim_id(row.getString(0))
    claim.setBatch_id(row.getString(1))
    claim.setProv_pin(row.getString(2))
    claim.setConcat_prod_code(row.getString(3))
    //diag codes
    claim.setDx_code_1(row.getString(4))
    claim.setDx_code_2(row.getString(5))
    claim.setDx_code_3(row.getString(6))
    claim.setDx_code_4(row.getString(7))
    claim.setDx_code_5(row.getString(8))
    claim.setDx_code_6(row.getString(9))
    claim.setDx_code_7(row.getString(10))
    claim.setDx_code_8(row.getString(12))
    claim.setDx_code_9(row.getString(13))
    claim.setDx_code_10(row.getString(14))
    claim.setDx_code_11(row.getString(15))
    claim.setDx_code_12(row.getString(16))
    //unit_counts
    claim.setUnit_count_1(row.getFloat(17))
    claim.setUnit_count_2(row.getFloat(18))
    claim.setUnit_count_3(row.getFloat(19))
    claim.setUnit_count_4(row.getFloat(20))
    claim.setUnit_count_5(row.getFloat(21))
    claim.setUnit_count_6(row.getFloat(22))
    claim.setUnit_count_7(row.getFloat(23))
    claim.setUnit_count_8(row.getFloat(24))
    claim.setUnit_count_9(row.getFloat(25))
    claim.setUnit_count_10(row.getFloat(26))
    claim.setUnit_count_11(row.getFloat(27))
    claim.setUnit_count_12(row.getFloat(28))
    claim.setUnit_count_13(row.getFloat(29))
    claim.setUnit_count_14(row.getFloat(30))
    claim.setUnit_count_15(row.getFloat(31))
    claim.setUnit_count_16(row.getFloat(32))
    claim.setUnit_count_17(row.getFloat(33))
    claim.setUnit_count_18(row.getFloat(34))
    
    claim.setFraud_exclusion_code(row.getString(35))
    
  }
  
  /*This method reads the query.hql file and returns a string with all the content of the file 
   * as a String */
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