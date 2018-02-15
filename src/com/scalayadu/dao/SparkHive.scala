
package com.scalayadu.dao
import org.apache.spark.SparkContext
import org.apache.spark.SparkContext
import org.apache.spark.sql.hive
import org.apache.spark.sql.Row
import scala.io.Source
import com.scalayadu.fact._

class SparkHive extends java.io.Serializable {
  
  def getClaimRdd(sc:SparkContext) = {
  
  val hc = new org.apache.spark.sql.hive.HiveContext(sc)
  val query_str = get_query_str()
  val query_res = hc.sql(query_str)
  
  val res_rdd = query_res.rdd
  
  val claim_rdd = res_rdd.map(row => rdd_map(row))
  
  claim_rdd
  }
  
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
    claim.setDx_code_8(row.getString(11))
    claim.setDx_code_9(row.getString(12))
    claim.setDx_code_10(row.getString(13))
    claim.setDx_code_11(row.getString(14))
    claim.setDx_code_12(row.getString(15))
    //unit_counts
    claim.setUnit_count_1(row.getDecimal(16))
    claim.setUnit_count_2(row.getDecimal(17))
    claim.setUnit_count_3(row.getDecimal(18))
    claim.setUnit_count_4(row.getDecimal(19))
    claim.setUnit_count_5(row.getDecimal(20))
    claim.setUnit_count_6(row.getDecimal(21))
    claim.setUnit_count_7(row.getDecimal(22))
    claim.setUnit_count_8(row.getDecimal(23))
    claim.setUnit_count_9(row.getDecimal(24))
    claim.setUnit_count_10(row.getDecimal(25))
    claim.setUnit_count_11(row.getDecimal(26))
    claim.setUnit_count_12(row.getDecimal(27))
    claim.setUnit_count_13(row.getDecimal(28))
    claim.setUnit_count_14(row.getDecimal(29))
    claim.setUnit_count_15(row.getDecimal(30))
    claim.setUnit_count_16(row.getDecimal(31))
    claim.setUnit_count_17(row.getDecimal(32))
    claim.setUnit_count_18(row.getDecimal(33))
    
    claim.setFraud_exclusion_code(row.getString(34))
    
    claim
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