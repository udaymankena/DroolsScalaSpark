
spark-submit \
--master yarn-client \
--driver-memory 12g \
--executor-memory 8g \
--executor-cores 5 \
--num-executors 20 \
--queue deventerprise \
--class com.scalayadu.App.Launcher \
--jars  $(echo /users/a088062/Spark-Scala/DroolsScalaSpark/jars/*.jar | tr ' ' ',') \
--files /users/a088062/Spark-Scala/DroolsScalaSpark/fraud_rules.drl \
/users/a088062/Spark-Scala/DroolsScalaSpark/drools-scala-spark.jar






spark-submit \
--master yarn-client \
--driver-memory 12g \
--class com.scalayadu.dao.SparkHive \
/users/a088062/Spark-Scala/DroolsScalaSpark/drools-scala-spark.jar