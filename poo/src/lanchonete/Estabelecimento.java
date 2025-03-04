package lanchonete;

import lanchonete.atendimento.Atendente;
import lanchonete.atendimento.cozinha.Almoxerife;
import lanchonete.atendimento.cozinha.Cozinheiro;

public class Estabelecimento {
    public static void main(String[] args) {
        
        Cozinheiro cozinheiro = new Cozinheiro();
        cozinheiro.adicionarSucoBalcao();

        Atendente atendente = new Atendente();
        atendente.receberPagamento();
        atendente.servirMesas();

        Almoxerife almoxerife = new Almoxerife();
        // almoxerife.trocarGas();
        // almoxerife.entregarIngredientes();
    }
}
