import java.util.Scanner;

public class Pessoa {
    protected String nome;
    protected int cpf;
    protected double saldo;
    protected int idade;

    public Pessoa(String nome, double saldo, int idade, int cpf) {
        this.nome = nome;
        this.idade = idade;
        this.saldo = saldo;
        this.cpf = cpf;
    }

    public String setNome(Scanner sc) {
        do {
            System.out.print("Informe o nome do cliente: ");
            this.nome = sc.nextLine();

            if (this.nome.length() > 20 || !this.nome.matches("[a-zA-ZÀ\\s]+")) {
                System.out.print("Quantidade de caracteres inválidos e/ou caracteres indesejados!");
                System.out.print("\nTente novamente!");
                sc.nextLine();
            }
        } while (this.nome.length() > 100 || !this.nome.matches("[a-zA-ZÀ\\s]+"));

        return this.nome;
    }

    public int setIdade(Scanner sc) {

        do {
            System.out.print("Informe a idade do cliente: ");
            this.idade=sc.nextInt();
            if(this.idade<=0 || this.idade >=120){
                System.out.print("Idade inválida!");
                System.out.print("\nTente novamente!");
                sc.nextLine();
            }
        }while(this.idade<=0 || this.idade >=120);
        return this.idade;
    }

    public int setCpf(Scanner sc) {
        System.out.print("Informe o cpf do cliente: ");
        return this.cpf = sc.nextInt();
    }

    public String getNome() {
        return this.nome.substring(0,1).toUpperCase().concat(nome.substring(1));
    }

    public int getIdade() {
        return this.idade;
    }

    public int getCpf() {
        return this.cpf;
    }

}

