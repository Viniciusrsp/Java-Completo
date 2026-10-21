import java.util.Locale;
import java.util.Scanner;

public class temperatura {
    static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String repetir;

        do {
            System.out.print("Digite a temperatura em Celsius: ");
            double C = sc.nextDouble();
            double F = (C * 9/5) + 32;
            System.out.printf("Temperatura em Fahrenheit: %.1f\n", F);
            System.out.print("Deseja repetir (s/n)? ");
            repetir = sc.next();
        } while (repetir.equalsIgnoreCase("s"));
    }
}
