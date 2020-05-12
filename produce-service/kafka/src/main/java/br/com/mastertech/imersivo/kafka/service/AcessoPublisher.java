package br.com.mastertech.imersivo.kafka.service;

import br.com.mastertech.imersivo.kafka.model.Acesso;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class AcessoPublisher {


    @Autowired
    private KafkaTemplate<String, Acesso> sender;

    public void sendRandomAccess(Long clienteId, Long portaId) {
        Random random = new Random();
        Acesso acesso = new Acesso();
        acesso.setPortaId(portaId);
        acesso.setClienteId(clienteId);
        acesso.setAccessStatus(random.nextBoolean());
        sender.send("vittoria", "key"+portaId, acesso);
    }

}
