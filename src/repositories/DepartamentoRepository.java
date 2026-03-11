package repositories;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import entities.DepartamentoEntity;

public class DepartamentoRepository extends Conexao {
    public DepartamentoRepository() throws Exception {
        super();
    }
    public boolean inserir(DepartamentoEntity Departamento) throws Exception {
        String sql = "INSERT INTO tbDepartamento (descricao) VALUES (?)";
        PreparedStatement stmt = getConexao().
        prepareStatement(sql);
        stmt.setString(1, Departamento.getDescricao());
        return stmt.executeUpdate() > 0;
    }
    public boolean excluir(int id) throws Exception {
        String sql = "DELETE FROM tbDepartamento WHERE id = ?";
        PreparedStatement stmt = getConexao().
        prepareStatement(sql);
        stmt.setInt(1, id);
        return stmt.executeUpdate() > 0;
    }
    public boolean editar(DepartamentoEntity Departamento) throws Exception {
        String sql = "UPDATE tbDepartamento SET descricao = ? WHERE id = ?";
        PreparedStatement stmt = getConexao().
        prepareStatement(sql);
        stmt.setString(1, Departamento.getDescricao());
        stmt.setInt(2, Departamento.getId());
        return stmt.executeUpdate() > 0;
    }
    public ArrayList<DepartamentoEntity> listar() throws Exception {
        String sql = "SELECT * FROM tbDepartamento order by descricao";
        PreparedStatement stmt = getConexao().prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        ArrayList<DepartamentoEntity> DepartamentoList = new ArrayList<>();
        while (rs.next()) 
            DepartamentoList.add(new DepartamentoEntity(
                rs.getInt("id"), rs.getString("descricao")));
        return DepartamentoList;
    }

}
