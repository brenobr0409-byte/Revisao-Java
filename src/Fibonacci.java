
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int n;
        int a = 0;
        int b = 1;
        int proximo;

        System.out.print("Digite um número: ");
        n = entrada.nextInt();

        for (int i = 1; i <= n; i++) {

            System.out.print(a + " ");

            proximo = a + b;
            a = b;
            b = proximo;
        }
    }
}
