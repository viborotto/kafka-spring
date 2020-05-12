package br.com.mastertech.imersivo.kafka.model;

public class Acesso {

        private Boolean accessStatus;

    private Long clienteId;

    private Long portaId;

    public Boolean getAccessStatus() {
        return accessStatus;
    }

    public void setAccessStatus(Boolean accessStatus) {
        this.accessStatus = accessStatus;
    }

    public Long getClienteId() {
        return clienteId;
    }

    public void setClienteId(Long clienteId) {
        this.clienteId = clienteId;
    }

    public Long getPortaId() {
        return portaId;
    }

    public void setPortaId(Long portaId) {
        this.portaId = portaId;
    }
}
