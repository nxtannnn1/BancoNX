import java.util.Scanner;//Serve para leitura de dados

public class Pessoa { //Atributos da classe Pessoa
    protected String nome;
    protected String cpf;
    protected double saldo;
    protected int idade;

    public Pessoa(String nome, double saldo, int idade, String cpf) { //Construtor para inicializar atributos
        this.nome = nome;
        this.saldo = saldo;
        this.cpf = cpf;
    }

    public String setNome(Scanner sc) { //Setter, recebe o scanner como parâmetro, retorna o valor do nome digitado

        do {//Repete o laço enquanto a condição não for aceita
            System.out.print("\nInforme o nome do cliente: ");
            this.nome = sc.nextLine();

            if (this.nome.length() > 20 || !this.nome.matches("[a-zA-Z]+")) { //Não aceita mais de 20 caracteres ou números
                System.out.print("Nome inválido!\n\n");
            }

        } while (this.nome.length() > 20 || !this.nome.matches("[a-zA-Z]+")); //Enquanto tiver mais de 20 caracteres ou possuir numeros, repete o laço

        return this.nome.substring(0, 1).toUpperCase().concat(this.nome.substring(1)); //Serve para deixar a primeira letra do nome maiúscula;
    }

    public int setIdade(Scanner sc) {
        do {
            System.out.print("Informe a idade do cliente: ");
            this.idade = sc.nextInt();
            if (this.idade > 120 || this.idade < 0) {
                System.out.print("Informar uma idade válida!\n\n");
            }

        } while (this.idade > 120 || this.idade < 0);
        return this.idade;
    }

    public String setCpf(Scanner sc) {
        do {
            System.out.print("Informe o cpf do cliente: ");
            this.cpf = sc.nextLine();
            if (this.cpf.length() != 11) { //Aceita apenas quando a quantia de caracteres para um CPF é válida no formato xxx.xxx.xxx-zy
                System.out.print("Quantidade de caracteres inválidos!\n\n");
            }
        } while (this.cpf.length() > 11);
        return this.cpf.substring(0, 3) + "." + cpf.substring(3, 6) + "." + cpf.substring(6, 9) + "-" + cpf.substring(9, 11); //Serve para formatar e concatenar no formato de CPF

    }

    public String getNome() { //Getter
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public String getCpf() {
        return this.cpf;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldoFinal) {
        this.saldo = saldoFinal;
    }

    public void verificarInvalidez() { //Em desenvolvimento

    }
}
