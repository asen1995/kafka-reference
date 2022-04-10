START THE KAFKA ENVIRONMENT

1.
# Start the ZooKeeper service
# Note: Soon, ZooKeeper will no longer be required by Apache Kafka.
$ bin/zookeeper-server-start.sh config/zookeeper.properties


2. 
# Start the Kafka broker service
$ bin/kafka-server-start.sh config/server.properties