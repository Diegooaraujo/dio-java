package lanchonete.atendimento;

public class Atendente {
    void trocarGas() {
        System.out.println("Trocar gas");
    }   
    public void receberPagamento() {
        System.out.println("Recebendo pagamento");
    }
    private void pegarLanche() {
        System.out.println("Pegando lanche");
    }
    public void servirMesas() {
        pegarLanche();
        System.out.println("Servindo mesas");
    }
}
