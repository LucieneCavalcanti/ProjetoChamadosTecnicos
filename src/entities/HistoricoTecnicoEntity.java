package entities;

import java.time.LocalDate;

public class HistoricoTecnicoEntity {
    private int id;
    private TecnicoEntity tecnico;
    private DepartamentoEntity departamento;
    private LocalDate dataInicial;
    private LocalDate dataFinal;
    public HistoricoTecnicoEntity() {
        id = 0;
        tecnico = new TecnicoEntity();
        departamento = new DepartamentoEntity();
        dataInicial = LocalDate.now();
        dataFinal = LocalDate.now();
    }
    public HistoricoTecnicoEntity(int id, TecnicoEntity tecnico, DepartamentoEntity departamento, LocalDate dataInicial,
            LocalDate dataFinal) {
        this.id = id;
        this.tecnico = tecnico;
        this.departamento = departamento;
        this.dataInicial = dataInicial;
        this.dataFinal = dataFinal;
    }
    public int getId() {
        return id;
    }    public void setId(int id) {
        this.id = id;
    }
    public TecnicoEntity getTecnico() {
        return tecnico;
    }    public void setTecnico(TecnicoEntity tecnico) {
        this.tecnico = tecnico;
    }
    public DepartamentoEntity getDepartamento() {
        return departamento;
    }    public void setDepartamento(DepartamentoEntity departamento) {
        this.departamento = departamento;
    }
    public LocalDate getDataInicial() {
        return dataInicial;
    }    public void setDataInicial(LocalDate dataInicial) {
        this.dataInicial = dataInicial;
    }
    public LocalDate getDataFinal() {
        return dataFinal;
    }    public void setDataFinal(LocalDate dataFinal) {
        this.dataFinal = dataFinal;
    }
    
}
