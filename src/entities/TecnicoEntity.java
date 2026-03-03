package entities;

public class TecnicoEntity extends UsuarioEntity{
    private float salario;
    private float comissao;
    public TecnicoEntity() {
        super();
        salario = 0;
        comissao = 0;
    }
    public TecnicoEntity(int id, String nome, String email, String senha, StatusEntity status, float salario,
            float comissao) {
        super(id, nome, email, senha, status);
        this.salario = salario;
        this.comissao = comissao;
    }
    public float getSalario() {
        return salario;
    }
    public void setSalario(float salario) {
        this.salario = salario;
    }
    public float getComissao() {
        return comissao;
    }
    public void setComissao(float comissao) {
        this.comissao = comissao;
    }
    
}
