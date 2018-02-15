package com.scalayadu.Drools

import org.apache.spark._

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
import scala.io.Source

class Drools extends java.io.Serializable{
  
   def getKnowledgeSession() : StatefulKnowledgeSession = {
		  var kbuilder : KnowledgeBuilder  = KnowledgeBuilderFactory.newKnowledgeBuilder()
		  ////Code//Eclipse_Workspaces//Scala_Workspace//DroolsTest//src//main//resources//
		  kbuilder.add(ResourceFactory.newFileResource("fraud_rules.drl"), ResourceType.DRL)
 		  System.out.println("kbuilder.getErrors.size()" + kbuilder.getErrors.size())
		  if(kbuilder.getErrors.size() > 0){
  		  val err_iter = kbuilder.getErrors.iterator()
  		  while(err_iter.hasNext())
  		  System.out.println(err_iter.next())
		  }
		  var kbase : KnowledgeBase = KnowledgeBaseFactory.newKnowledgeBase()
		  kbase.addKnowledgePackages(kbuilder.getKnowledgePackages())
		  var ksession : StatefulKnowledgeSession = kbase.newStatefulKnowledgeSession()
		  //var logger : KnowledgeRuntimeLogger = KnowledgeRuntimeLoggerFactory.newConsoleLogger(ksession)
		  ksession
	  }	
}
//ResourceFactory.newFileResource("fraud_rules.drl")