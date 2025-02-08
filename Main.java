import java.util.Scanner; //Serve para leitura de dados
import java.util.ArrayList; //Serve para utilizar ArrayList, onde consigo usar vetores dinâmicos

public class Main {
    public static void main(String[] args) {


        ArrayList<Pessoa> clientes = new ArrayList<>(); //Inicializo um objeto ArrayList, de nome "clientes"
        Scanner sc = new Scanner(System.in); //Inicializo o objeto Scanner, como "sc", será responsável por captar a entrada do usuário
        String repetir = ""; //Utilizo p/ iterações/repetições

        do { //Laço primário, estou usando de testes

            String option = Menu.menu(sc); /*A partir de uma chamada de função, tenho acesso as opções que o banco oferece, como
            cadastro de clientes, saques e depósitos*/

            if (option.equals("1")) { //.equals serve para comparar valores de String
                Pessoa novaPessoa = new Pessoa("", 0.0, 0, ""); //Inicialização do objeto Pessoa e seus atributos
                clientes.add(novaPessoa); //Adição de pessoas na ArrayList para cadastro, começa em 0 e vai ao além
                Menu.cadastrarCliente(novaPessoa, sc);//Finalizo o Cadastro
            }

            System.out.println("Deseja continuar?");
            sc.nextLine();
            repetir = sc.nextLine().toLowerCase();

        } while (repetir.equals("s")); //Fim do Laço

        System.out.print("Clientes cadastrados:\n");


    }
}