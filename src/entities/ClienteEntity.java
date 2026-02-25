package entities;

public class ClienteEntity extends UsuarioEntity{
    private String cpf;
    private String telefone;
    public ClienteEntity() {
        super();
        cpf = new String();
        telefone = new String();
    }
    public ClienteEntity(int id, String nome, String email, String senha, StatusEntity status, String cpf,
            String telefone) {
        super(id, nome, email, senha, status);
        this.cpf = cpf;
        this.telefone = telefone;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    
}
