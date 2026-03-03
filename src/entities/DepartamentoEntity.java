package entities;

public class DepartamentoEntity {
    private int id;
    private String descricao;
    //construtores
    public DepartamentoEntity() {
        id = 0;
        descricao = new String();
    }
    public DepartamentoEntity(int id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    

}
