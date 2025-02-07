import java.util.Collection;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        ArrayList<Pessoa> clientes = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String repetir = "";

        do {

            String option = Menu.menu(sc);

            if (option.equals("1")) {
                Pessoa novaPessoa = new Pessoa("", 0.0, 0, "");
                Menu.cadastrarCliente(novaPessoa, sc);
                clientes.add(novaPessoa);

            }

            System.out.println("Deseja continuar?");
            sc.nextLine();
            repetir = sc.nextLine().toLowerCase();

        } while (repetir.equals("s"));

        System.out.print("Clientes cadastrados:\n");
        
    }
}