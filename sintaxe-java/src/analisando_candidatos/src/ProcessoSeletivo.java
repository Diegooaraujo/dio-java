import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import java.util.Random;

public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        analisarCandidatura(1800.0);
        analisarCandidatura(2300.0);
        analisarCandidatura(2000.0);
        selecaoCandidato();
        imprimirSelecionados();
        String [] candidatos = {"felipe", "marcia", "julia","paulo","augusto"};
        for(String candidato:candidatos){
            entrandoEmContato(candidato);
        }
    }
    //metodo auxiliar
    static boolean atender(){
        return new Random().nextInt(3)==1;
    }

    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 0;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do{
            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando){
                tentativasRealizadas++;
            }else{
                System.out.println("contato realizado com sucesso");
            }

        }while(continuarTentando && tentativasRealizadas < 3);
        if(atendeu){
            System.out.println("conseuimos contato com o candidato: " + candidato + " apos " + tentativasRealizadas + " tentativas");
        }
        else{
            System.out.println("nao conseguimos contato com o candidato: " + candidato + " apos " + tentativasRealizadas + " tentativas");
        }
    }

    static void imprimirSelecionados(){
        String [] candidatos = {"felipe", "marcia", "julia","paulo","augusto"};
        System.out.println("lista de candidatos");
        for(int i = 0; i<candidatos.length; i++){
            System.out.println(candidatos[i] + "numero " + (i+1));
        }

    }

    static Double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1500.0, 2200.0);
    }
    static void selecaoCandidato(){
        String [] candidatos = {"felipe", "marcia", "julia","paulo","augusto","monica"};
        int candidatoSelecionado = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while(candidatoSelecionado < 5 && candidatoAtual < candidatos.length){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();
            System.out.println("Candidato: " + candidato + " Salario Pretendido: " + salarioPretendido);
            if(salarioBase >= salarioPretendido){
                System.out.println("Candidato selecionado: " + candidato);
                System.out.println("candidato "+candidato+" selecionado");
                candidatoSelecionado++;
            }else{
                System.out.println("Candidato não selecionado: " + candidato);
            }
            candidatoAtual++;
        }

    }
    static void analisarCandidatura(double salario){   
        double salarioBase = 2000.0;
        if(salarioBase > salario){
            System.out.println("ligar para candidato");
        
        }else if(salarioBase == salario){
            System.out.println("ligar para candidato para contra proposta");

        }
        else{
            System.out.println("aguardando resultado dos demais candidatos");
        }
    }
}
