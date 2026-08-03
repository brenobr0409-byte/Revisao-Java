import java.util.Scanner;

public class Media {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 
 double somaNotas = 0.0;
 int quantidadeNotas = 0;
 
 System.out.println("--- Sistema de Cálculo de Média ---");
 System.out.println("Digite as notas do aluno (digite um valor negativo para encerrar):");
 
 while (true) {
 System.out.print("Digite a nota: ");
 double nota = scanner.nextDouble();
 
 if (nota < 0) {
 break; // Condição de parada: valor negativo encerra o laço
 }
 
 somaNotas += nota;
 quantidadeNotas++;
 }
 
 if (quantidadeNotas > 0) {
 double media = somaNotas / quantidadeNotas;
 
 System.out.println("\n--- Resultado Final ---");
 System.out.println("Total de notas válidas: " + quantidadeNotas);
 System.out.printf("Média das notas: %.2f\n", media);
 
 if (media >= 7.0) {
 System.out.println("Status: Aprovado");
 } else {
 System.out.println("Status: Reprovado");
 }
 } else {
 System.out.println("\nNenhuma nota válida foi informada.");
 }
 
 scanner.close();
 }
}
