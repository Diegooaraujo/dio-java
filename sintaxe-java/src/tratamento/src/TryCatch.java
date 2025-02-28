import java.util.Locale;
import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) throws Exception {
        try{
            Scanner scanner = new Scanner (System.in).useLocale(Locale.US);

            System.out.println("DIgite se nome");
            String nome = scanner.next();
    
            System.out.println("Digite seu sobrenome:");
            String sobrenome = scanner.next();
    
            System.out.println("digite sua altura");
            double altura = scanner.nextDouble();
            scanner.close();
    
            System.out.println("Ola, mechamo " + nome.toUpperCase() + " " + "meu sobrenome é " +sobrenome+ " " + "minha altura é " + altura);
        }catch(Exception e){
            System.out.println("Erro: " + e);
            System.out.println("os campos precisa ser preenchidos corretamente");
        }
       
    }
}
