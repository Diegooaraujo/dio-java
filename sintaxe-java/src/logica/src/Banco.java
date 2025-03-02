import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
         // Entrada do saldo inicial
         Scanner scanner = new Scanner(System.in);
         double saldoInicial = scanner.nextDouble();

         // TODO: Na linha abaixo, implemente a entrada das três transações:
            System.out.println("Digite o valor da primeira transação: ");
            double transacao1 = scanner.nextDouble();
            System.out.println("Digite o valor da segunda transação: ");
            double transacao2 = scanner.nextDouble();
            System.out.println("Digite o valor da terceira transação: ");
            double transacao3 = scanner.nextDouble();

 
         // TODO: Na linha abaixo, realize o cálculo do saldo final:
         double saldoFinal = saldoInicial + transacao1 + transacao2 + transacao3;
        
         // Saldo final
         System.out.printf("%.2f\n", saldoFinal);
 
         scanner.close();
    }
}
