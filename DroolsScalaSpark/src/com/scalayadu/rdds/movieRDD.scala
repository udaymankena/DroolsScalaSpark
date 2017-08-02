package com.scalayadu.rdds

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

object movieRDD {
  
  var ksession : StatefulKnowledgeSession = GetKnowledgeSession()
  
  def map_movieObjToRdd(line:String):Movie = {
    val line_arr = line.split(" \"")
    val movie_obj = new Movie()
    movie_obj.setMovieId(line_arr(0))
    movie_obj.setMovieName(line_arr(1))
    return movie_obj
  }
  
  def main(args: Array[String]) = {
    
    val sc = new SparkContext("local[*]","movieRDD")
    
    val file_rdd = sc.textFile("Marvel-names.txt")
    
    val movieObj_rdd = file_rdd.map { x => map_movieObjToRdd(x) } // this should give me movie rdd
    
    //var ksession : StatefulKnowledgeSession = GetKnowledgeSession()
    
    //movieObj_rdd.foreach { x => println(x.getMovieId() + " : " + x.getMovieName()) }
    
    movieObj_rdd.foreach { movie => fireRulesOnMovie(movie) }
    
  }
  
  def fireRulesOnMovie(movie: Movie) = {
    //var ksession : StatefulKnowledgeSession = GetKnowledgeSession()
    ksession.insert(movie)
    ksession.fireAllRules()
  }
  
   def GetKnowledgeSession() : StatefulKnowledgeSession = {
		  var kbuilder : KnowledgeBuilder  = KnowledgeBuilderFactory.newKnowledgeBuilder()
		  ////Code//Eclipse_Workspaces//Scala_Workspace//DroolsTest//src//main//resources//
		  kbuilder.add(ResourceFactory.newFileResource("movie_rules.drl"), ResourceType.DRL)
		  var kbase : KnowledgeBase = KnowledgeBaseFactory.newKnowledgeBase()
		  kbase.addKnowledgePackages(kbuilder.getKnowledgePackages())
		  var ksession : StatefulKnowledgeSession = kbase.newStatefulKnowledgeSession()
		  //var logger : KnowledgeRuntimeLogger = KnowledgeRuntimeLoggerFactory.newConsoleLogger(ksession)
		  ksession
	  }	
}