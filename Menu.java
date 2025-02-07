import java.util.Random;
import java.util.Scanner;

public class Menu {

    Scanner sc = new Scanner(System.in);
    Pessoa pessoa1 = new Pessoa(" ", 0.0, 0, 0);

    public static String menu(Scanner sc) {

        String meuMenu;
        do {
            System.out.println("1. Cadastrar cliente\n2. Depositar\n3. Sacar");
            meuMenu = sc.nextLine();

            if(!meuMenu.equals("1") && !meuMenu.equals("2") && !meuMenu.equals("3")){
                System.out.println("ERRO PVT");
            }

        } while (!meuMenu.equals("1") && !meuMenu.equals("2") && !meuMenu.equals("3"));

        return meuMenu;
    }

    public static void cadastrarCliente(Pessoa pessoa, Scanner sc) {
        pessoa.setNome(sc);
        pessoa.setIdade(sc);
        pessoa.setCpf(sc);
    }

    public static void depositarCliente(Pessoa pessoa){

    }
}