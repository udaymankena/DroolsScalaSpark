package com.scalayadu.App

import org.apache.spark._
import com.scalayadu.Drools.Drools
import com.scalayadu.fact.Claim
import org.drools.runtime.StatefulKnowledgeSession
import com.scalayadu.dao.SparkHive

import org.apache.spark.SparkContext._
import org.apache.log4j._
import org.drools.KnowledgeBase
import org.drools.KnowledgeBaseFactory
import org.drools.builder.KnowledgeBuilder
import org.drools.builder.KnowledgeBuilderFactory
import org.drools.builder.ResourceType
import org.drools.io.ResourceFactory
import org.drools.runtime.StatefulKnowledgeSession
import com.scalayadu.fact._

object Launcher {
  
   val drools_obj = new Drools()
   var ksession : StatefulKnowledgeSession = drools_obj.getKnowledgeSession()
   
   def main(args: Array[String]) = {
    
    val sc = new SparkContext("yarn-client","Launcher")
    val sparkHive = new SparkHive()

    val claim_rdd = sparkHive.getClaimRdd(sc)
    
    System.out.println("firing rulesss....")
    claim_rdd.collect().foreach { claim => fireRules(claim) }
    System.out.println("......rules execution done....")
  }
   
   def fireRules(claim: Claim) = {
    //var ksession : StatefulKnowledgeSession = drools_obj.getKnowledgeSession()
    System.out.println(claim.claim_id)
    ksession.insert(claim)
    ksession.fireAllRules()
  }

}