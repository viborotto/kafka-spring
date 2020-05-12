package br.com.mastertech.imersivo.kafka.controller;

import br.com.mastertech.imersivo.kafka.model.Acesso;
import br.com.mastertech.imersivo.kafka.service.AccessConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {

    @Autowired
    private AccessConsumerService accessConsumerService;

    @KafkaListener(topics = "vittoria", groupId = "taouvindo")
    public void recebe(@Payload Acesso acesso){
        accessConsumerService.EscreverLogDeAcessoEmCSV("/home/a2/Documentos/allowAcess.csv", "/Users/mobile/Desktop/denyAcess.csv", acesso);
        System.out.println("Status de aesso: "+ acesso.getAccessStatus());
    }

}
