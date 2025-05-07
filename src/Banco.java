import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        String nome = "Clark Kent";
        String tipoConta = "Corrente";
        double saldo = 1599.99;
        int opcao = 0;

        System.out.println("*********************");
        System.out.println("\nNome do Cliente: " + nome);
        System.out.println("Tipo da Conta: " + tipoConta);
        System.out.println("Saldo: " + saldo);
        System.out.println("\n*********************");

        String menu = """
                ** Digite sua Opção **
                1 - Consultar Saldo
                2 - Transferir Valor
                3 - Recebeer Valor
                4 - Sair
                """;

        Scanner leitura = new Scanner(System.in);

        while (opcao != 4){
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1 ){
                System.out.println("Saldo: " + saldo);

            }else if (opcao == 2){
                System.out.println("Qual valor você deseja transferir?");
                double valor = leitura.nextDouble();
                if (valor > saldo){
                    System.out.println("Não há Saldo para realizar a transferência");
                }else { saldo -= valor;
                    System.out.println("Novo Saldo " + saldo);
                }
            }else if (opcao == 3){
                System.out.println("Valor recebido: ");
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("Novo Saldo" + saldo);
            }else if(opcao != 4){
                System.out.println("Opção Inválida");
            }
        }

    }
}