// Ana Carolina Bomfim Bandeira
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int totalPares = 0;
        int totalImpares = 0;
        
        System.out.println("Por favor, insira 10 números inteiros:");
        
        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int numero = scanner.nextInt();
            
            if (numero % 2 == 0) {
                totalPares++;
            } else {
                totalImpares++;
            }
        }
        
        System.out.println("\n--- Resultado Final ---");
        System.out.println("Quantidade de números pares: " + totalPares);
        System.out.println("Quantidade de números ímpares: " + totalImpares);
        
        scanner.close();
    }
}