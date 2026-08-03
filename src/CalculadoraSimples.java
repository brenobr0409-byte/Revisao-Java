 // Breno 
	import java.util.Scanner;

	public class CalculadoraSimples {
	    public static void main(String[] args) {

	        Scanner entrada = new Scanner(System.in);

	        int opcao;
	        double num1, num2;

	        do {
	            System.out.println("1 - Somar");
	            System.out.println("2 - Subtrair");
	            System.out.println("3 - Multiplicar");
	            System.out.println("4 - Dividir");
	            System.out.println("5 - Sair");
	            System.out.print("Escolha: ");

	            opcao = entrada.nextInt();

	            if (opcao != 5) {

	                System.out.print("Digite o primeiro número: ");
	                num1 = entrada.nextDouble();

	                System.out.print("Digite o segundo número: ");
	                num2 = entrada.nextDouble();

	                switch (opcao) {

	                    case 1:
	                        System.out.println("Resultado: " + (num1 + num2));
	                        break;

	                    case 2:
	                        System.out.println("Resultado: " + (num1 - num2));
	                        break;

	                    case 3:
	                        System.out.println("Resultado: " + (num1 * num2));
	                        break;

	                    case 4:
	                        if (num2 == 0) {
	                            System.out.println("Não pode dividir por zero!");
	                        } else {
	                            System.out.println("Resultado: " + (num1 / num2));
	                        }
	                        break;

	                    default:
	                        System.out.println("Opção inválida!");
	                }
	            }

	        } while (opcao != 5);

	        System.out.println("Programa encerrado!");

	    }
	}

