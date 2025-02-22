public class App {
    public static void main(String[] args) throws Exception {
        String nomeCompleto ="Diego"+"Araújo";
        System.out.println(nomeCompleto);

        String concatenacao = "?";
        System.out.println(concatenacao);
        concatenacao = 1+1+1+"1"; // 2+1+"1" = 3+"1" = 31
        System.out.println(concatenacao);
        concatenacao = 1+"1"+1+1; // "1"+1+1 = "11"+1 = "111"
        System.out.println(concatenacao);
        concatenacao = "1"+1+1+1;  // "1"+1+1 = "11"+1 = "111"
        System.out.println(concatenacao);
        concatenacao = "1"+(1+1+1);  // "1"+3 = "13"
        System.out.println(concatenacao);

        //unarios 

        int numero = 10; //positivo
        System.out.println(- numero); //negativo
        numero = - numero; //negativo
        numero =numero*-1; //positivo

        //incremento e decremento
        int numero2 = 10;
        // numero2++;
        
        System.out.println(numero2++); //10
        System.out.println(++ numero2); //11 

        System.out.println(numero2) ; //11

        boolean verdade = true;
        System.out.println(!verdade); //false
        verdade = !verdade; //false
        verdade = !verdade; //true

        //operadores ternario

        //condicao ? valor se verdadeiro : valor se falso
        int idade = 18;
        String resultado = idade >= 18 ? "Maior de idade" : "Menor de idade";
        String resultado2 = idade == 18 ? "verdadeiro" : "falso";
        System.out.println(resultado);

        if(idade >= 18){
            resultado = "Maior de idade";
        }else{
            resultado = "Menor de idade";
        }
        System.out.println(resultado);

        //operadores relacionais

        String nome = "Diego";
        String nome2 = new String("Diego");

        System.out.println(nome == nome2); //false //compara a referencia de memoria steack e heap
        System.out.println(nome.equals(nome2)); //true //compara o conteudo da string

        int numero3 = 10;
        int numero4 = 20;
        boolean simNao = numero3 == numero4;
        System.out.println(simNao); //false
        System.out.println(numero3 == numero4); //false
        System.out.println(numero3 != numero4); //true
        System.out.println(numero3 > numero4); //false
        System.out.println(numero3 < numero4); //true
        System.out.println(numero3 >= numero4); //false
        System.out.println(numero3 <= numero4); //true

        //operadores logicos
        boolean verdade2 = true;
        boolean falso = false;

        if(verdade2 && falso){
            System.out.println("Verdadeiro");
        }else{
            System.out.println("Falso");
        } //falso as duas condições precisam ser verdadeiras

        if(verdade2 || falso){
            System.out.println("Verdadeiro");
        }else{
            System.out.println("Falso");
        } //verdadeiro uma das condições precisa ser verdadeira

        

     

    }
}
