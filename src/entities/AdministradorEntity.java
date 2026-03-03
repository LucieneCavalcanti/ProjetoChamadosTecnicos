package entities;

public class AdministradorEntity extends UsuarioEntity{
    public AdministradorEntity() {
        super();
    }
    public AdministradorEntity(int id, String nome, String email, String senha, StatusEntity status) {
        super(id, nome, email, senha, status);
    }

}
