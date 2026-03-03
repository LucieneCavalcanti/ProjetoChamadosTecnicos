import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String menu1=new String(),menu2=new String();
        Scanner ler = new Scanner(System.in);
        do {
            try {
                //exibir o menu 1
                System.out.println("===== MENU 1=====");
                System.out.println("1 - Administrador");
                System.out.println("2 - Técnico");
                System.out.println("3 - Cliente");
                System.out.println("----------------------");
                System.out.println("4 - Departamento");
                System.out.println("5 - Status");
                System.out.println("----------------------");
                System.out.println("6 - Chamado");
                System.out.println("7 - Atendimento");
                System.out.println("8 - Encaminhamento");
                System.out.println("----------------------");
                System.out.println("0 - Sair");
                //ler a opção do menu 1
                System.out.println("\nDigite a opção do menu 1:");
                menu1 = ler.next();
                if(menu1.equals("0")) {
                    System.out.println("Saindo do sistema...");
                    break;
                }else{
                    //exibir o menu 2
                    System.out.println("===== MENU 2=====");
                    System.out.println("1 - Cadastrar");
                    System.out.println("2 - Listar");   
                    System.out.println("3 - Atualizar");
                    System.out.println("4 - Excluir");
                    System.out.println("----------------------");
                    System.out.println("0 - Voltar");
                    System.out.println("\nDigite a opção do menu 2:");
                    menu2 = ler.next();
                    if(menu2.equals("0")) {
                        System.out.println("Voltando ao menu 1...");
                        continue;
                    }
                    String opcao = menu1.trim()+menu2.trim();
                    switch (opcao) {
                        case "11":
                            System.out.println("Cadastrando Administrador...");
                            break;
                        case "12":
                            System.out.println("Listando Administradores...");
                            break;
                        case "13":
                            System.out.println("Atualizando Administrador...");
                            break;
                        case "14":
                            System.out.println("Excluindo Administrador...");
                            break;
                        case "21":
                            System.out.println("Cadastrando Técnico...");
                            break;
                        case "22":
                            System.out.println("Listando Técnicos...");
                            break;
                        case "23":
                            System.out.println("Atualizando Técnico...");
                            break;
                        case "24":
                            System.out.println("Excluindo Técnico...");
                            break;
                        case "31":
                            System.out.println("Cadastrando Cliente...");
                            break;
                        case "32":
                            System.out.println("Listando Clientes...");
                            break;
                        case "33":
                            System.out.println("Atualizando Cliente...");
                            break;
                        case "34":
                            System.out.println("Excluindo Cliente...");
                            break;
                        case "41":
                            System.out.println("Cadastrando Departamento...");
                            break;  
                        case "42":
                            System.out.println("Listando Departamentos...");
                            break;
                        case "43":
                            System.out.println("Atualizando Departamento...");
                            break;
                        case "44":
                            System.out.println("Excluindo Departamento...");
                            break;
                        case "51":
                            System.out.println("Cadastrando Status...");
                            break;
                        case "52":
                            System.out.println("Listando Status...");
                            break;
                        case "53":
                            System.out.println("Atualizando Status...");
                            break;
                        case "54":
                            System.out.println("Excluindo Status...");
                            break;
                        case "61":
                            System.out.println("Cadastrando Chamado...");
                            break;
                        case "62":
                            System.out.println("Listando Chamados...");
                            break;
                        case "63":
                            System.out.println("Atualizando Chamado...");
                            break;
                        case "64":
                            System.out.println("Excluindo Chamado...");
                            break;
                        case "71":
                            System.out.println("Cadastrando Atendimento...");
                            break;
                        case "72":
                            System.out.println("Listando Atendimentos...");
                            break;
                        case "73":
                            System.out.println("Atualizando Atendimento...");
                            break;
                        case "74":
                            System.out.println("Excluindo Atendimento...");
                            break;
                        case "81":
                            System.out.println("Cadastrando Encaminhamento...");
                            break;
                        case "82":
                            System.out.println("Listando Encaminhamentos...");
                            break;
                        case "83":
                            System.out.println("Atualizando Encaminhamento...");
                            break;
                        case "84":
                            System.out.println("Excluindo Encaminhamento...");
                            break;  
                        default:
                            System.out.println("Opção inválida!");
                    }
                }
            } catch (Exception e) {
                System.out.println("ERRO:"+e.getMessage());
            }
        } while (!menu1.equals("0"));
    }
}
