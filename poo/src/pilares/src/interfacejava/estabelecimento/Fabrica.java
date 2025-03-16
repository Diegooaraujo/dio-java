package interfacejava.estabelecimento;

import interfacejava.copiadora.Copiadora;
import interfacejava.digitalizadora.Digitalizadora;
import interfacejava.impressora.Deskjet;
import interfacejava.impressora.Impressora;
import interfacejava.impressora.LaserJet;
import interfacejava.multiFuncional.EquipamentoMultiFuncional;

public class Fabrica {
    public static void main(String[] args) {
        EquipamentoMultiFuncional em = new EquipamentoMultiFuncional();

        Impressora impressora = em;
        Digitalizadora digitalizadora = em;
        //equipamentoMultiFuncional é uma impressora, digitalizadora e copiadora


        // Digitalizadora digitalizadora2 = Deskjet; // deskjet não é uma digitalizadora
       
        impressora.imprimir();
        digitalizadora.digitalizar();



    }
}
