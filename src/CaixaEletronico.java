import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double saldo = 1000;
        double saque;

        do {
            System.out.println("Saldo: R$ " + saldo);
            System.out.print("Digite o valor do saque (0 para sair): ");
            saque = entrada.nextDouble();

            if (saque == 0) {
                System.out.println("Programa encerrado.");

            } else if (saque > saldo) {
                System.out.println("Saldo insuficiente.");

            } else {
                saldo = saldo - saque;
                System.out.println("Novo saldo: R$ " + saldo);
            }

        } while (saldo > 0 && saque != 0);

    }
}
