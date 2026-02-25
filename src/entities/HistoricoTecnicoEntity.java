package entities;

import java.time.LocalDate;

public class HistoricoTecnicoEntity {
    private int id;
    private TecnicoEntity tecnico;
    private DepartamentoEntity departamento;
    private LocalDate dataInicial;
    private LocalDate dataFinal;
}
