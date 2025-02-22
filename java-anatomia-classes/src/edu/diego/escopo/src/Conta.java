public class Conta {
    double saldo = 1000.0;

    public void sacar(double valor) {
        //variavel local 
        double novoSaldo = saldo - valor; 
        saldo = novoSaldo;
    }

    public void imprimirSaldo() {
        //variavel disponivel para toda a classe
        System.out.println("Saldo: " + saldo);

        //somente e metodo sacar pode acessar a variavel novoSaldo
        //System.out.println("Novo Saldo: " + novoSaldo);
    }

    public double calcularDividaExponencial(){
        //variavel local do metodo
        double valorParcela = 50.0;
        double valorMontante = 0.0;
        for(int x=1;x<=5;x++){
            double valorCalculado = valorParcela *x	;
            valorMontante = valorMontante + valorCalculado;
        }
        //variavel local do metodo
        return valorMontante;

    }

    public static void main(String[] args) throws Exception {
        Conta conta = new Conta();
        conta.saldo = 1000.0;
        conta.sacar(100.0);
    }
}
