
public class BreakEContinue {
    public static void main(String [] args){


        for (int numero = 1; numero <=5 ; numero++){
            if (numero == 3){
                break;
            }
            if (numero == 4) {
                continue; // pula a execução do código e vai para a próxima iteração
                
            }
            System.out.println(numero);
        }
        System.out.println("Fim do loop");
      
    }
}
