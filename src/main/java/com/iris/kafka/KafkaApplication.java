package com.iris.kafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KafkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaApplication.class, args);
	}

}



// curl "http://localhost:8080/api/kafka/publish?message=hello siriiiiiiiii2"

///to view messages
// container name =kafka
// docker exec -it kafka /bin/bash



//topic name = javaguider
//kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic javaguides --from-beginning