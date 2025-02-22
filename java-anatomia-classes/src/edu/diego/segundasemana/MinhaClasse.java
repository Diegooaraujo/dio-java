package edu.diego.segundasemana;
public class MinhaClasse {
    public static void main(String[] args){
        System.out.println("ola, mundo!");

        String primeiroNome = "Diego";
        String segundoNome = "Araújo";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome){
        return primeiroNome + " " + segundoNome;
    }
}
