package entities;

import java.time.LocalDateTime;

public class ChamadoEntity {
    private LocalDateTime dataAbertura;
    private String descricao;
    private LocalDateTime dataEncerramento;
    private String conclusao;
    private int id;
    private StatusEntity status;
    private ClienteEntity cliente;
        public ChamadoEntity() {
            id = 0;
            dataAbertura = LocalDateTime.now();
            descricao = new String();
            dataEncerramento = null;
            conclusao = new String();
            status = new StatusEntity();
            cliente = new ClienteEntity();
        }
        public ChamadoEntity(int id, LocalDateTime dataAbertura, String descricao, LocalDateTime dataEncerramento,
                String conclusao, StatusEntity status, ClienteEntity cliente) {
            this.id = id;
            this.dataAbertura = dataAbertura;
            this.descricao = descricao;
            this.dataEncerramento = dataEncerramento;
            this.conclusao = conclusao;
            this.status = status;
            this.cliente = cliente;
        }
        public LocalDateTime getDataAbertura() {
            return dataAbertura;
        }
        public String getDescricao() {
            return descricao;
        }
        public LocalDateTime getDataEncerramento() {
            return dataEncerramento;
        }
        public String getConclusao() {
            return conclusao;
        }
        public int getId() {
            return id;
        }
        public StatusEntity getStatus() {
            return status;
        }
        public ClienteEntity getCliente() {
            return cliente;
        }
}