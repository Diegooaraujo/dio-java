public class SwitchCase {
    public static void main (String []args){
        String sigla = "M";

        switch (sigla){
        case "M":{
            System.out.println("Médio");
            break;
        }
        case "P":{
            System.out.println("Pequeno");
            break;
        }
        case "G":{
            System.out.println("Grande");
            break;
        }
        default:{
            System.out.println("Tamanho não encontrado");
            break;}
    
        }

        // este exemplo não possui instruções break, o que significa que, uma vez que um caso é correspondido, todos os casos subsequentes também serão executados até o final do switch.
        String plano = "T";

        switch(plano){
            case "T":{
                System.out.println("5gb youtube");
            }
            case "M":{
                System.out.println("Whatsapp ilimitado");
            }
            case "B":{
                System.out.println("100 minutos de ligação");
            }
           
        }
    }
    
}
