package repositories;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import entities.StatusEntity;

public class StatusRepository extends Conexao {
    public StatusRepository() throws Exception {
        super();
    }
    public boolean inserir(StatusEntity status) throws Exception {
        String sql = "INSERT INTO tbstatus (descricao) VALUES (?)";
        PreparedStatement stmt = getConexao().
        prepareStatement(sql);
        stmt.setString(1, status.getDescricao());
        return stmt.executeUpdate() > 0;
    }
    public boolean excluir(int id) throws Exception {
        String sql = "DELETE FROM tbstatus WHERE id = ?";
        PreparedStatement stmt = getConexao().
        prepareStatement(sql);
        stmt.setInt(1, id);
        return stmt.executeUpdate() > 0;
    }
    public boolean editar(StatusEntity status) throws Exception {
        String sql = "UPDATE tbstatus SET descricao = ? WHERE id = ?";
        PreparedStatement stmt = getConexao().
        prepareStatement(sql);
        stmt.setString(1, status.getDescricao());
        stmt.setInt(2, status.getId());
        return stmt.executeUpdate() > 0;
    }
    public ArrayList<StatusEntity> listar() throws Exception {
        String sql = "SELECT * FROM tbstatus order by descricao";
        PreparedStatement stmt = getConexao().prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        ArrayList<StatusEntity> statusList = new ArrayList<>();
        while (rs.next()) 
            statusList.add(new StatusEntity(
                rs.getInt("id"), rs.getString("descricao")));
        return statusList;
    }

}
