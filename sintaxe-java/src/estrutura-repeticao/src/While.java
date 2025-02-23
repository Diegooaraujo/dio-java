
import java.util.concurrent.ThreadLocalRandom;
public class While {
    public static void main(String [] args){
        double mesada = 0;
       
        while (mesada >0){
            Double valorDoce = valorAleatorio();
            if (valorDoce>mesada){
                valorDoce = mesada;
            }
            System.out.println("Doce do valor " + valorDoce + "adicionado ao carrinho");
            mesada = mesada - valorDoce;
        }
        System.out.println("mesada"+ mesada);
        System.out.println("Fim do loop");
    }
    private static double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }
    
}
