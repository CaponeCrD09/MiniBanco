import java.util.Scanner;

public class MiniBanco {


    // constantes

    static final double LIMITE_SAQUE = 1000.00;
    static final double TAXA_SAQUE = 0.02;


    static double calcularTotalSaque(double valor)
    {
        return valor + (valor * TAXA_SAQUE);
    }

    static boolean dentroDoLimite(double valor)
    {
        return valor <= LIMITE_SAQUE;
    }

    static boolean saldoSuficiente(double saldo,double valor)
    {
        return saldo >= calcularTotalSaque(valor);
    }

    static double sacar(double saldo,double valor)
    {
        return saldo - calcularTotalSaque(valor);
    }


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

    static double deposita(double saldo,double valor)
    {
        return saldo + valor;
    }

    static void exibirSaldo(double saldo)
    {
        System.out.printf(" Saldo atual : R$ %.2f%n", saldo);
    }

    static boolean valorEhValido(double valor)
    {
        return valor > 0;
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

                System.out.print(" Valor a depositar : R$ ");
                double valor = scanner.nextDouble();

                if(!valorEhValido(valor))
                {
                    System.out.println(" Atencao valor invalido. Valor deve ser maior que zero .");
                }
                else{

                    saldo = deposita(saldo, valor);
                    System.out.println(" Deposito realizado ! ");
                    exibirSaldo(saldo);
                }
                //System.out.println(" [Depositar - em  breve]");
            }
            else if(opcao == 2 )
            {
                System.out.println(" Valor a sacar :");
                double valorSaque = scanner.nextDouble();

                if(!valorEhValido(valorSaque))
                {
                    System.out.println(" Valor nao é valido !");
                }
                else if(!dentroDoLimite(valorSaque))
                {
                    System.out.printf(" Limite exedido . Maximo : R$ %.2f%n", LIMITE_SAQUE);
                }
                else if(!saldoSuficiente(saldo, valorSaque))
                {

                    System.out.printf(" Saldo insufuciente. Necessario : R$ %.2f%n", calcularTotalSaque(valorSaque));
                } 
                else{
                    double taxa = valorSaque * TAXA_SAQUE;
                    saldo = sacar(saldo,valorSaque);
                    System.out.printf(" Saque realizado . Taxa cobrada : R$ %.2f%n", taxa);
                }
                //System.out.println(" [Sacar - em breve]");
            }
            else if( opcao == 3 )
            {
                exibirSaldo(saldo);
                //System.out.println(" [Consultar Saldo]");
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
