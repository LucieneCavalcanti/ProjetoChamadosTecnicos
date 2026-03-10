<<<<<<< HEAD
package entities;

import java.time.LocalDateTime;

public class AtendimentoEntity {
    private int id;
    private LocalDateTime dataRecebimento;
    private LocalDateTime dataFinalizacao;
    private String descricao;
    private ChamadoEntity chamado;
    private TecnicoEntity tecnico;
    public AtendimentoEntity() {
        id = 0;
        dataRecebimento = LocalDateTime.now();
        dataFinalizacao = null;
        descricao = new String();
        chamado = new ChamadoEntity();
        tecnico = new TecnicoEntity();
    }
    public AtendimentoEntity(int id, LocalDateTime dataRecebimento, LocalDateTime dataFinalizacao, String descricao,
            ChamadoEntity chamado, TecnicoEntity tecnico) {
        this.id = id;
        this.dataRecebimento = dataRecebimento;
        this.dataFinalizacao = dataFinalizacao;
        this.descricao = descricao;
        this.chamado = chamado;
        this.tecnico = tecnico;
    }
    public int getId() {
        return id;
    }
    public LocalDateTime getDataRecebimento() {
        return dataRecebimento;
    }
    public LocalDateTime getDataFinalizacao() {
        return dataFinalizacao;
    }
    public String getDescricao() {
        return descricao;
    }
    public ChamadoEntity getChamado() {
        return chamado;
    }
    public TecnicoEntity getTecnico() {
        return tecnico;
    }
=======
package entities;

import java.time.LocalDateTime;

public class AtendimentoEntity {
    private int id;
    private LocalDateTime dataRecebimento;
    private LocalDateTime dataFinalizacao;
    private String descricao;
    private ChamadoEntity chamado;
    private TecnicoEntity tecnico;
    public AtendimentoEntity() {
        id = 0;
        dataRecebimento = LocalDateTime.now();
        dataFinalizacao = null;
        descricao = new String();
        chamado = new ChamadoEntity();
        tecnico = new TecnicoEntity();
    }
    public AtendimentoEntity(int id, LocalDateTime dataRecebimento, LocalDateTime dataFinalizacao, String descricao,
            ChamadoEntity chamado, TecnicoEntity tecnico) {
        this.id = id;
        this.dataRecebimento = dataRecebimento;
        this.dataFinalizacao = dataFinalizacao;
        this.descricao = descricao;
        this.chamado = chamado;
        this.tecnico = tecnico;
    }
    public int getId() {
        return id;
    }
    public LocalDateTime getDataRecebimento() {
        return dataRecebimento;
    }
    public LocalDateTime getDataFinalizacao() {
        return dataFinalizacao;
    }
    public String getDescricao() {
        return descricao;
    }
    public ChamadoEntity getChamado() {
        return chamado;
    }
    public TecnicoEntity getTecnico() {
        return tecnico;
    }
>>>>>>> 37ec78a439c202c3725c7e000f2fb37ba35e7212
}