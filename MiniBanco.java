import java.util.Scanner;

public class MiniBanco {

    static void exibirMenu()
    {
        System.out.println("\n=== MiniBanco ===");
        System.out.println("1 - Depositar");
        System.out.println("2 - Sacar");
        System.out.println("3 - Consultar Saldo");
        System.out.println("4 - Ver Extrato");
        System.out.println("0 - Sair");
        System.out.println("Escolha: ");
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // variaveis principais

        double saldo = 0;
        int    opcao = -1;
        
        // boas vindas

        System.out.print("Digite o seu nome : ");
        String nome = scanner.next();
        System.out.printf("Ola ,%s! saldo inicial : R$ %.2f\n", nome , saldo);


        while (opcao !=0) {
            exibirMenu();
            opcao = scanner.nextInt();

            if(opcao == 1 )
            {
                System.out.println(" [Depositar - em  breve]");
            }
            else if(opcao == 2 )
            {
                System.out.println(" [Sacar - em breve]");
            }
            else if( opcao == 3 )
            {
                System.out.println(" [Consultar Saldo]");
            }
            else if(opcao == 4)
            {
                System.out.println(" [Extrato em breve]");
            }
            else if(opcao == 0 )
            {
                System.out.println(" [Ate Logo, "+ nome + "!]");
            }
            else{

                System.out.println(" [Opção invalida]");
            }
        }



        scanner.close();

    }
}
