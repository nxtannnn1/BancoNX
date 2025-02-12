import java.util.ArrayList; //Utilizar a classe ArrayList
import java.util.Scanner;
import java.util.Random;

public class Dinheiro {

    public static double investir(ArrayList<Pessoa> clientes) { //Passo como parâmetro meus clientes que estão na lista

        Random gerador = new Random();
        Scanner sc = new Scanner(System.in);
        int acertarNumero, numeroAleatorio, tentativas;
        double taxa = 0.0;

        System.out.print("\nInforme o ID do cliente: ");
        int idCliente = sc.nextInt();
        sc.nextLine();

        String aplicacaoTaxa = taxaInvestimento(sc);

        if (idCliente < 1 || idCliente > clientes.size()) { //Avalia se o Cliente está devidamente cadastrado, .size() serve para calcular quantos itens estão na instancia clientes
            System.out.print("ID inválido! Retornando...");
            return 1;
        }

        Pessoa cliente = clientes.get(idCliente - 1);
        double saldoAtual = cliente.getSaldo();

        System.out.println("\nSaldo atual: R$ " + saldoAtual);

        if (saldoAtual <= 0) {
            System.out.println("Saldo insuficiente para investir!");
            return 1;
        }

        System.out.print("Quanto deseja investir em reais?\n");
        double valorInvestido = sc.nextDouble();
        sc.nextLine();

        if (valorInvestido <= 0 || valorInvestido > saldoAtual) {
            System.out.println("Valor inválido para investir!");
            return 1;
        }

        if (aplicacaoTaxa.equals("1")) {

            tentativas = 3;
            while (tentativas > 0) {
                numeroAleatorio = gerador.nextInt(3);

                System.out.println("\nInforme o número sorteado (0-2): ");
                acertarNumero = sc.nextInt();

                if (acertarNumero != numeroAleatorio) {
                    System.out.println("\nVocê errou! Tente novamente.");
                    tentativas--;
                } else {
                    System.out.print("\nParabéns por acertar o jogo e ganhar um 1% de retorno!");
                    taxa = 0.01;
                    break;
                }
            }
        }

        if (aplicacaoTaxa.equals("2")) {

            tentativas = 3;
            while (tentativas > 0) {
                numeroAleatorio = gerador.nextInt(5);

                System.out.println("\nInforme o número sorteado (0-6): ");
                acertarNumero = sc.nextInt();

                if (acertarNumero != numeroAleatorio) {
                    System.out.println("\nVocê errou! Tente novamente.");
                    tentativas--;
                } else {
                    System.out.print("\nParabéns por acertar o jogo e ganhar 6% de retorno!");
                    taxa = 0.06;
                    break;
                }
            }
        }

        double saldoFinal = valorInvestido * (1 + taxa);
        cliente.setSaldo(saldoAtual - valorInvestido + saldoFinal);
        System.out.println("\nInvestimento realizado com sucesso!");
        System.out.println("Novo saldo de " + cliente.getNome() + ": R$ " + cliente.getSaldo());

        return cliente.getSaldo();
    }

    public static String taxaInvestimento(Scanner sc) {
        System.out.println("\nEscolha uma opção:\n1. Rentabilidade baixa\t2. Rentabilidade média\t3. Rentabilidade alta");
        String escolherTaxa = sc.nextLine();

        if (!escolherTaxa.equals("1") && !escolherTaxa.equals("2") && !escolherTaxa.equals("3")) {
            System.out.println("\nOpção inválida!\nAperte ENTER");
            sc.nextLine();
        }

        return escolherTaxa;
    }

}
