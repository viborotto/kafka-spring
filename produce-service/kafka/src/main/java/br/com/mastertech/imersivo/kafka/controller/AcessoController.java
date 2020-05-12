package br.com.mastertech.imersivo.kafka.controller;


import br.com.mastertech.imersivo.kafka.model.Acesso;
import br.com.mastertech.imersivo.kafka.service.AcessoPublisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/acesso")
public class AcessoController {

    @Autowired
    private AcessoPublisher acessoPublisher;

    @PostMapping("/{clienteId}/{portaId}")
    private void postAccess(@PathVariable Long clienteId,@PathVariable Long portaId) {
        acessoPublisher.sendRandomAccess(clienteId,portaId);
    }

}
