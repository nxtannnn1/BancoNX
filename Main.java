import java.util.Scanner; //Serve para leitura de dados
import java.util.ArrayList; //Serve para utilizar ArrayList, onde consigo usar vetores dinâmicos

public class Main {
    public static void main(String[] args) {

        ArrayList<Pessoa> clientes = new ArrayList<>(); //Inicializo um objeto ArrayList, de nome "clientes"
        Scanner sc = new Scanner(System.in); //Inicializo o objeto Scanner, como "sc", será responsável por captar a entrada do usuário
        String repetir; //Utilizo p/ repetições

        do {

            String option = Opcoes.menu(sc); /*A partir de uma chamada de função, tenho acesso as opções que o banco oferece, como
            cadastro de clientes, saques e depósitos*/

            if (option.equals("1")) { //.equals serve para comparar valores de String
                Pessoa novaPessoa = new Pessoa("", 500.0, 0, ""); //Inicialização do objeto Pessoa e seus atributos
                clientes.add(novaPessoa); //Adição de pessoas na ArrayList para cadastro, começa em 0 e vai ao além
                Opcoes.cadastrarCliente(novaPessoa, sc);//Finalizo o Cadastro

            } else if (option.equals("2")) {
                System.out.print("\nClientes cadastrados:\n\n");
                Opcoes.mostrarCliente(clientes);
            } else if (option.equals("3")) {
                Dinheiro.investir(clientes);
            }

            System.out.println("\nFinal dos testes!!!Deseja continuar?"+clientes.get(0).getSaldo());
            //sc.nextLine(); //Anti-bug
            repetir = sc.nextLine().toLowerCase(); //Transforma em minúsculo

        } while (repetir.equals("s"));

    }
}