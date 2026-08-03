import java.util.Scanner;

public class JogoAdiv {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 
 // Sorteia um número aleatório entre 1 e 50 usando Math.random()
 int numeroSorteado = (int) (Math.random() * 50) + 1;
 int palpite = 0;
 
 System.out.println("--- Jogo de Adivinhação ---");
 System.out.println("Tente adivinhar o número entre 1 e 50!");
 
 while (palpite != numeroSorteado) {
 System.out.print("Digite seu palpite: ");
 palpite = scanner.nextInt();
 
 if (palpite > numeroSorteado) {
 System.out.println("Muito alto");
 } else if (palpite < numeroSorteado) {
 System.out.println("Muito baixo");
 } else {
 System.out.println("Acertou!");
 }
 }
 
 scanner.close();
 }
}

