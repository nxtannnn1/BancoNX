import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa(" ", 0.0, 0, 0);
        Scanner sc = new Scanner(System.in);
        Random random1 = new Random();
        String option = Menu.menu(sc);

        if (option.equals("1")) {
            Menu.cadastrarCliente(pessoa1, sc);
        }

        System.out.print("Nome: " + pessoa1.getNome() + "\nCPF: " + pessoa1.getCpf() + "\nIdade: " + pessoa1.getIdade());
        System.out.println("\nNumero aleatorio gerado: "+random1.nextInt(5));


    }
}