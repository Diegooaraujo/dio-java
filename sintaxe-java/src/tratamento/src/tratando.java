import java.text.NumberFormat;
import java.text.ParseException;

public class tratando {
    public static void main(String [] args){
        Number valor;
        try {
            //tentei converter uma string para um numero
            valor = NumberFormat.getInstance().parse("a1.75");
            System.out.println(valor);
        } catch (ParseException e) {
           //parse exception é lançada quando a string não pode ser convertida para um número
            e.printStackTrace();
        }
        
    }
}
