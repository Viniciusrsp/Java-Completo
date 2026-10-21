import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {
    static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int func;
        double salario_hrs, hrs;

        func = sc.nextInt();
        salario_hrs = sc.nextDouble();
        hrs = sc.nextDouble();

        System.out.println("NUMBER = " + func);
        System.out.printf("SALARY = U$ %.2f",  salario_hrs * hrs );

        sc.close();
    }
}
