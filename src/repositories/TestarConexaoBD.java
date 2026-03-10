package repositories;

public class TestarConexaoBD {
    public static void main(String[] args) {
        try {
            Conexao conexao = new Conexao();
            System.out.println("Conexão bem-sucedida!");
        } catch (Exception e) {
            System.out.println("Erro ao conectar ao banco de dados: " + e.getMessage());
        }
    }
}
