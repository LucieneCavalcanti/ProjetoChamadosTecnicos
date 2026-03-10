<<<<<<< HEAD
package entities;

import java.time.LocalDateTime;

public class EncaminhamentoEntity {
private AdministradorEntity administrador;
private LocalDateTime dataEncaminhamento;
private LocalDateTime dataRecebimento;
private TecnicoEntity tecnico;
private AtendimentoEntity atendimento;
public EncaminhamentoEntity() {
    administrador = new AdministradorEntity();
    dataEncaminhamento = LocalDateTime.now();
    dataRecebimento = LocalDateTime.now();
    tecnico = new TecnicoEntity();
    atendimento = new AtendimentoEntity();
}
public EncaminhamentoEntity(AdministradorEntity administrador, LocalDateTime dataEncaminhamento,
        LocalDateTime dataRecebimento, TecnicoEntity tecnico, AtendimentoEntity atendimento) {
    this.administrador = administrador;
    this.dataEncaminhamento = dataEncaminhamento;
    this.dataRecebimento = dataRecebimento;
    this.tecnico = tecnico;
    this.atendimento = atendimento;
        }
public AdministradorEntity getAdministrador() {
    return administrador;  } 
public LocalDateTime getDataEncaminhamento() {
    return dataEncaminhamento;  } 
public LocalDateTime getDataRecebimento() {
    return dataRecebimento;  } 
public TecnicoEntity getTecnico() {
    return tecnico;  } 
public AtendimentoEntity getAtendimento() {
    return atendimento;  } 

=======
package entities;

import java.time.LocalDateTime;

public class EncaminhamentoEntity {
private AdministradorEntity administrador;
private LocalDateTime dataEncaminhamento;
private LocalDateTime dataRecebimento;
private TecnicoEntity tecnico;
private AtendimentoEntity atendimento;
public EncaminhamentoEntity() {
    administrador = new AdministradorEntity();
    dataEncaminhamento = LocalDateTime.now();
    dataRecebimento = LocalDateTime.now();
    tecnico = new TecnicoEntity();
    atendimento = new AtendimentoEntity();
}
public EncaminhamentoEntity(AdministradorEntity administrador, LocalDateTime dataEncaminhamento,
        LocalDateTime dataRecebimento, TecnicoEntity tecnico, AtendimentoEntity atendimento) {
    this.administrador = administrador;
    this.dataEncaminhamento = dataEncaminhamento;
    this.dataRecebimento = dataRecebimento;
    this.tecnico = tecnico;
    this.atendimento = atendimento;
        }
public AdministradorEntity getAdministrador() {
    return administrador;  } 
public LocalDateTime getDataEncaminhamento() {
    return dataEncaminhamento;  } 
public LocalDateTime getDataRecebimento() {
    return dataRecebimento;  } 
public TecnicoEntity getTecnico() {
    return tecnico;  } 
public AtendimentoEntity getAtendimento() {
    return atendimento;  } 

>>>>>>> 37ec78a439c202c3725c7e000f2fb37ba35e7212
}