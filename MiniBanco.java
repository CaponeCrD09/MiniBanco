import java.util.Scanner;

public class MiniBanco {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // variaveis principais

        double saldo = 0;
        int    opcao = -1;
        
        // boas vindas

        System.out.print("Digite o seu nome : ");
        String nome = scanner.next();
        System.out.printf("Ola ,%s! saldo inicial : R$ %.2f\n", nome , saldo);

        scanner.close();

    }
}
