package repository;

import java.util.Scanner;

import entities.StatusEntity;

public class TesteConexao {
public static void main(String[] args) {
    try {
        // Conexao conexao = new Conexao();
        // System.out.println("Conexão bem-sucedida!");
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite o nome do status: ");
        String descricao = ler.nextLine();
        StatusEntity status = new StatusEntity(1, descricao);
        StatusRepository statusRepo = new StatusRepository();
        if(statusRepo.inserir(status))
            System.out.println("Status inserido com sucesso!");
        else
            System.out.println("Falha ao inserir status.");
    } catch (Exception e) {
        System.out.println("Erro ao conectar ao banco de dados: " + e.getMessage());
    }
    }
}
