// Ana Carolina Bomfim Bandeira
import java.util.Scanner;

public class Validacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String senhaCorreta = "BrenoAna";
        String senhaDigitada;
        
        System.out.println("--- Sistema de Validação de Senha ---");
        
        do {
            System.out.print("Digite a senha: ");
            senhaDigitada = scanner.next();
            
            if (!senhaDigitada.equals(senhaCorreta)) {
                System.out.println("Senha inválida, tente novamente");
            }
            
        } while (!senhaDigitada.equals(senhaCorreta));
        
        System.out.println("Acesso concedido");
        
        scanner.close();
    }
}