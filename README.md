Before Running the code follow these steps.
Download Kafka:

Go to the Apache Kafka website and download the Kafka binaries.
Extract Files:

Extract the downloaded files to a desired location on your system.
Start ZooKeeper:

Open a terminal and navigate to the Kafka directory.(This is for windows)


Start ZooKeeper, which is required for Kafka to manage cluster metadata:
CMD:bin/zookeeper-server-start.sh config/zookeeper.properties


Start Kafka Broker:
In another terminal, navigate to the Kafka directory.
CMD:bin/kafka-server-start.sh config/server.properties


Create a Topic:
Create a topic to hold your messages:
CMD: bin/kafka-topics.sh --create --topic my-topic --bootstrap-server localhost:9092 --partitions 1 --		replication-factor 1


Producer and Consumer:
Open two separate terminals for the producer and consumer.
In the producer terminal, start a console producer to send messages:
CMD:bin/kafka-console-producer.sh --topic my-topic --bootstrap-server localhost:9092

In the consumer terminal, start a console consumer to receive messages:
CMD:bin/kafka-console-consumer.sh --topic my-topic --bootstrap-server localhost:9092 --from-beginning


Send and Receive Messages:

In the producer terminal, type and send messages.
In the consumer terminal, you'll see the messages being received.
