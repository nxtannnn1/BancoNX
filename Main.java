import java.util.Scanner; //Serve para leitura de dados
import java.util.ArrayList; //Serve para utilizar ArrayList, onde consigo usar vetores dinâmicos

/*Comandos ArrayList

ArrayList<Tipo> Nome = new ArrayList<>();
ArrayList<String> pecas = new ArrayList<>();

System.out.print(pecas.get(1)) => Teclado
pecas.add()=(1,"Teclado") Adiciona teclado na posição 1
pecas.add()=(2,"Mouse") Adiciona mouse na posição 2
pecas.remove(2) Remove mouse da lista
boolean possui = pecas.contains("Teclado) => Verifica se há teclado e retorna true, caso sim
pecas.set(1,"Headset") => Substitui a posição 1 para Headset
pecas.size() => Retorna 2, pois há 2 itens na lista
pecas.clear() => Exclui todos os registros da lista
pecas.isEmpty() => Verifica se está vazio e retorna true, caso sim

.get Retorna o elemento de uma posição
.add Adicionar elementos
.remove Remover elementos dado uma posição
.contains Verifica se há itens específicos na arraylist
.set Altera o valor do objeto
.size Tamanho do vetor
.clear Limpa todos os objetos
.isEmpty Verifica se é vazio
 */

public class Main {
    public static void main(String[] args) {

        ArrayList<Pessoa> clientes = new ArrayList<>(); //Inicializo um objeto ArrayList, de nome "clientes"
        Scanner sc = new Scanner(System.in); //Inicializo o objeto Scanner, como "sc", será responsável por captar a entrada do usuário
        String repetir; //Utilizo p/ repetições de minha Main

        do {

            String option = Opcoes.exibirMenu(sc); /*A partir de uma chamada de função, tenho acesso as opções que o banco oferece, como
            cadastro de clientes, saques e depósitos*/

            if (option.equals("1")) { //.equals serve para comparar valores de String
                Pessoa pessoa = new Pessoa("", 500.0, 0, ""); //Inicialização do objeto Pessoa e seus atributos
                clientes.add(pessoa); //Adição de pessoas na ArrayList para cadastro, começa em 0 e vai ao além
                Opcoes.cadastrarCliente(pessoa, sc);//Finalizo o Cadastro
            }

            else if (option.equals("2")) {
                Opcoes.mostrarCliente(clientes); //Recebe como parâmetro a lista de clientes já cadastrados
            }

            else if (option.equals("3")) {
                Dinheiro.investirDinheiro(clientes);
            }

            else if (option.equals("4")) {
                Dinheiro.sacarDinheiro(clientes, sc);
            }

            System.out.println("\nDeseja continuar?\n");


            repetir = sc.nextLine().toLowerCase(); //Transforma em minúsculo

        } while (repetir.equals("s"));

    }
}