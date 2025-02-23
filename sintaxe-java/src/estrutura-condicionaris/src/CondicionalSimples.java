public class CondicionalSimples {
    public static void main(String[] args) throws Exception {
        //caixa eletronico
        double saldo = 25.0;
        double valorSolicitado = 17.0;

        if(valorSolicitado < saldo){
            saldo = saldo -valorSolicitado;
            //salod esta sendo atualizado

            System.out.println(saldo);
        }
    }
}
