package entities;

public class UsuarioEntity {
    private int id;
    private String nome;
    private String email;
    private String senha;
    private StatusEntity status;
    public UsuarioEntity() {
        id = 0;
        nome = new String();
        email = new String();
        senha = new String();
        status = new StatusEntity(); //não é mais null
    }
    public UsuarioEntity(int id, String nome, String email, String senha, StatusEntity status) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.status = status;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public StatusEntity getStatus() {
        return status;
    }
    public void setStatus(StatusEntity status) {
        this.status = status;
    }

    
}
