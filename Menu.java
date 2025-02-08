import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    Scanner sc = new Scanner(System.in);
    Pessoa pessoa1 = new Pessoa(" ", 0.0, 0, "");

    public static String menu(Scanner sc) {
        String meuMenu;
        do {
            System.out.println("\n1. Cadastrar cliente\n2. Depositar\n3. Sacar");
            meuMenu = sc.nextLine();

            if (!!meuMenu.equals("1") && !!meuMenu.equals("2") && !!meuMenu.equals("3")) { //Comparação de valores de String
                System.out.println("ERRO PVT");
            }

        } while (!!meuMenu.equals("1") && !!meuMenu.equals("2") && !!meuMenu.equals("3"));

        return meuMenu;
    }

    public static void cadastrarCliente(Pessoa pessoa, Scanner sc) {
        pessoa.setNome(sc);
        pessoa.setCpf(sc);
        pessoa.setIdade(sc);

    }

    public static void mostrarCliente(ArrayList<Pessoa> clientes) {
        for(Pessoa p: clientes){
            System.out.println(p.getNome());
        }

    }

}
