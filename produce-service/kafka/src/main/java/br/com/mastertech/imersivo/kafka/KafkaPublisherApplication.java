package br.com.mastertech.imersivo.kafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class KafkaPublisherApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaPublisherApplication.class, args);
	}

}
