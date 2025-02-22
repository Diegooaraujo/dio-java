public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
         double salarioMinimo = 2500; // double é um tipo de variável que aceita números decimais//
        System.out.println(salarioMinimo);
         short numeroCurto = 1;
         int numeroNormal = numeroCurto;
         short numeroCurto2 = (short) numeroNormal; // casting
         System.out.println(numeroCurto2);

         final double valor_de_pi = 3.14; // final é uma constante
         System.out.println(valor_de_pi);
    }
}
