package repositories;
import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {
    private Connection con;
    public Conexao() throws Exception {
        String url = "jdbc:sqlserver://PROF-LAB05\\SQLEXPRESS:1433;databaseName=bdChamadosTecnicos;encrypt=false;trustServerCertificate=true;";
        String user = "aluno";
        String password = "dba";
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        con = DriverManager.getConnection(url, user, password);
    }
    public Connection getConexao() {
        return con;
    }
}
