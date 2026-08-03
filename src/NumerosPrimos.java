// Breno
import java.util.Scanner;

public class NumerosPrimos {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero;
        int divisores = 0;

        System.out.print("Digite um número: ");
        numero = entrada.nextInt();

        for (int i = 1; i <= numero; i++) {

            if (numero % i == 0) {
                divisores++;
            }
        }

        if (divisores == 2) {
            System.out.println("É um número primo!");
        } else {
            System.out.println("Não é um número primo!");
        }
    }
}
