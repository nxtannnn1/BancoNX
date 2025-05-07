import com.sistema.banco.domain.validation.CpfValidator;
import java.util.Scanner;

public class TesteCpfValidator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CpfValidator validator = new CpfValidator();

        System.out.print("Digite um CPF (somente números): ");
        String inputCpf = sc.nextLine();

        if (validator.validate(inputCpf)) {
            System.out.println("✅ CPF válido!");
        } else {
            System.out.println("❌ " + validator.getMessage());
        }

        sc.close();
    }
}
