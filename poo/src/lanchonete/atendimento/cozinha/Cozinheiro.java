package lanchonete.atendimento.cozinha;

import lanchonete.atendimento.Atendente;

public class Cozinheiro {
    public void pedirParaTrocarGas(Almoxerife meuAmigo) {
        meuAmigo.trocarGas();
    }

    public void pedirParaTrocarGas(Atendente meuAmigo) {
        // meuAmigo.trocarGas();
        //o método trocarGas() não é visível
    }

    private void lavaringredientes() {
        System.out.println("Lavando ingredientes");
    }
    public void prepararLanche() {
        lavaringredientes();
        System.out.println("Preparando lanche");
    }
    private void fritarBatata() {
        System.out.println("Fritando batata");
    }

    public void adicionarSucoBalcao() {
        System.out.println("Adicionando suco ao balcão");
    }

    private void pedirIngrediente(Almoxerife almoxerife) {
        almoxerife.entregarIngredientes();
    }



}
