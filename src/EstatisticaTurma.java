
import java.util.Scanner;

public class EstatisticaTurma {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int n;
        int idade;
        int maior = 0;
        int menor = 0;
        int soma = 0;

        System.out.print("Quantos alunos? ");
        n = entrada.nextInt();

        for (int i = 1; i <= n; i++) {

            System.out.print("Digite a idade do aluno " + i + ": ");
            idade = entrada.nextInt();

            soma = soma + idade;

            if (i == 1) {
                maior = idade;
                menor = idade;
            }

            if (idade > maior) {
                maior = idade;
            }

            if (idade < menor) {
                menor = idade;
            }
        }

        double media = (double) soma / n;

        System.out.println("Maior idade: " + maior);
        System.out.println("Menor idade: " + menor);
        System.out.println("Média: " + media);
    }
}