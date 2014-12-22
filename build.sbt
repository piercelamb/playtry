name := "playtry"

version := "1.0"

scalaVersion := "2.10.4"

libraryDependencies += "org.apache.spark" %% "spark-core" % "1.2.0"

libraryDependencies += "com.datastax.spark" %% "spark-cassandra-connector" % "1.1.0"

libraryDependencies += "org.apache.spark" %% "spark-streaming" % "1.2.0"

libraryDependencies += "org.apache.spark" %% "spark-streaming-kafka" % "1.2.0"

libraryDependencies += "com.typesafe.akka" %% "akka-actor" % "2.2.3"

libraryDependencies += "com.typesafe.akka" %% "akka-slf4j" % "2.2.3"