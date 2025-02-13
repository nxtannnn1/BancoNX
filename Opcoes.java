import java.util.ArrayList;
import java.util.Scanner;

public class Opcoes {

    Scanner sc = new Scanner(System.in);
    Pessoa pessoa1 = new Pessoa("", 0.0, 0, "");

    public static String exibirMenu(Scanner sc) {
        String meuMenu;

        do {
            System.out.println("\n1. Cadastrar clientes\n2. Visualizar clientes\n3. Investir dinheiro\n4. Sacar dinheiro");
            meuMenu = sc.nextLine();

            if (!meuMenu.equals("1") && !meuMenu.equals("2") && !meuMenu.equals("3") && !meuMenu.equals("4")) { //Comparação de valores de String
                System.out.print("\nOpção inválida!\nAperte ENTER");
                sc.nextLine();
            }

        } while (!meuMenu.equals("1") && !meuMenu.equals("2") && !meuMenu.equals("3") && !meuMenu.equals("4"));

        return meuMenu;
    }

    public static void cadastrarCliente(Pessoa pessoa, Scanner sc) {
        pessoa.setNome(sc);
        pessoa.setCpf(sc);
        pessoa.setIdade(sc);
        sc.nextLine(); //Anti-bug
    }

    public static void mostrarCliente(ArrayList<Pessoa> clientes) {

        try {
            int i = 0;
            Pessoa p = clientes.get(i);

            System.out.println("\nClientes cadastrados:\n\n");

            for (i = 0; i < clientes.size(); i++) {
                System.out.println("ID: " + (i + 1) + "\nNome: " + p.getNome() + "\nIdade: " + p.getIdade() + "\nCPF: " + p.getCpf());
            }

        } catch (Exception e) {
            System.out.println("\nNão foram cadastrados clientes! Retornando...");
        }
    }

}
