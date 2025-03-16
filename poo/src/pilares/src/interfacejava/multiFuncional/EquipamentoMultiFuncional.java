package interfacejava.multiFuncional;

import interfacejava.copiadora.Copiadora;
import interfacejava.impressora.Impressora;
import interfacejava.digitalizadora.Digitalizadora;

public class EquipamentoMultiFuncional implements  Digitalizadora, Impressora, Copiadora {

    @Override
    public void copiar() {
        System.out.println("Copiando com Equipamento Multi Funcional");
    }

    @Override
    public void digitalizar() {
        System.out.println("Digitalizando com Equipamento Multi Funcional");
    }

    @Override
    public void imprimir() {
        System.out.println("Imprimindo com Equipamento Multi Funcional");
    }
    
}
