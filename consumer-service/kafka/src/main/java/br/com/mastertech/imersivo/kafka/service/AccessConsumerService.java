package br.com.mastertech.imersivo.kafka.service;

import br.com.mastertech.imersivo.kafka.model.Acesso;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;

@Service
public class AccessConsumerService {

    public void EscreverLogDeAcessoEmCSV(String allowedFile, String notAllowedFile, Acesso acesso) {
        try {
            String registro = String.format("%s,%s,%s\n", acesso.getClienteId(), acesso.getPortaId(), LocalDateTime.now());
            if (acesso.getAccessStatus()) {
                Files.write(Paths.get(allowedFile), registro.getBytes(), StandardOpenOption.CREATE, StandardOpenOption.APPEND);
            } else {
                Files.write(Paths.get(notAllowedFile), registro.getBytes(), StandardOpenOption.CREATE, StandardOpenOption.APPEND);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
