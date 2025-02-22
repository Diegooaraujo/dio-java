public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }

    public void aumentarVolume(){ 
        System.out.println("almentando volume para " + volume);
        volume++;
    }

    public void diminuirVolume (){
        System.out.println("diminuindo volume para " + volume);
        volume--;
    }

    public void aumentarCanal(){
        canal++;
    }
    public void diminuirCanal(){
        canal--;
    }

    public void trocarCanal(int canal){
        this.canal = canal;
    }


}
