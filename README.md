# kafka-consumer
Contains Basic Java SpringBoot Application as Kafka Consumer

- @KafkaListener is used to listen to specific topic
- Group-Id is mandatory to consume from a Topic

## Consuming JSON Object
- Below properties to be added in the application.properties file in-order to read the JSON Object from Kafka Topic
- spring.kafka.consumer.key-deserializer=org.apache.kafka.common.serialization.StringDeserializer
- spring.kafka.consumer.value-deserializer=org.springframework.kafka.support.serializer.JsonDeserializer
- spring.kafka.consumer.properties.spring.json.trusted.packages=com.training.model
- The configuration can also be done via Java Class files. its given in config\EventConsumerConfig class file.