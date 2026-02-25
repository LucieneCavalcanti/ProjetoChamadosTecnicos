package entities;

public class StatusEntity {
    private int id;
    private String descricao;
    //construtores
    public StatusEntity() {
        id = 0;
        descricao = new String();
    }
    public StatusEntity(int id, String descricao) {
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
    
    //setters/getters

}
