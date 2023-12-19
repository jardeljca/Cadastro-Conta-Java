package Principal;
import java.util.Locale;
import java.util.Scanner;
import Entidades.Conta;

public class Principal {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Conta conta;

        System.out.println("Digite o número da conta:");
        int numConta = sc.nextInt();
        System.out.println("Digite o nome do titular:");
        sc.nextLine();
        String nomeTitular = sc.nextLine();
        System.out.println("Será feito algum depósito inicial? (s/n):");
        char resposta = sc.next().charAt(0);

        if(resposta == 's'){
            System.out.println("Digite o valor do depósito inicial");
            double depositoInicial = sc.nextDouble();
            conta = new Conta(numConta, nomeTitular, depositoInicial);
        }
        else{
            conta = new Conta(numConta, nomeTitular);
        }

        System.out.println();
        System.out.println("Dados da conta");
        System.out.println(conta);

        char resposta1;
        do{
            System.out.println("Deseja fazer alguma operação de depósito ou saque? (s/n)");
            resposta1 = sc.next().charAt(0);

            if(resposta1 == 's') {
                System.out.println("Você deseja fazer saque ou depósito? (s/d)");
                char resposta2 = sc.next().charAt(0);
                if (resposta2 == 'd') {
                    System.out.println("Digite o valor a ser depositado");
                    double deposito = sc.nextDouble();
                    conta.deposito(deposito);
                    System.out.println("Dados da conta atualizado:");
                    System.out.println(conta);
                } else {
                    System.out.println("Digite o valor do saque");
                    double saque = sc.nextDouble();
                    conta.saque(saque);
                    System.out.println("Dados da conta atualizado:");
                    System.out.println(conta);
                }
            }
        }   while(resposta1 == 's');
        sc.close();
    }
}
