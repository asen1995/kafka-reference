START THE KAFKA ENVIRONMENT

1.
# Start the ZooKeeper service
# Note: Soon, ZooKeeper will no longer be required by Apache Kafka.
$ bin/zookeeper-server-start.sh config/zookeeper.properties


2. 
# Start the Kafka broker service
$ bin/kafka-server-start.sh config/server.properties


3. setup spring-boot version which is compatible with spring-kafka version.

https://spring.io/projects/spring-kafka

in this case 2.3.6.RELEASE is compatible with spring-kafka 2.7.1


4. swagger-ui url 

http://localhost:7078/swagger-ui.html