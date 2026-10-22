import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {
    static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            double a = sc.nextDouble();
            double b = sc.nextDouble();

            if (b == 0) {
                System.out.printf("Divisão Impossivel\n");
            }
            else {
                double div = a / b;
                System.out.printf("%.1f\n", div);
            }
        }

        sc.close();
    }
}
