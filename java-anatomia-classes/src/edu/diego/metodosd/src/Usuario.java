public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv tv = new SmartTv();

        System.out.println("A TV está ligada? " + tv.ligada);
        System.out.println("Canal: " + tv.canal);
        System.out.println("Volume: " + tv.volume);

        tv.ligar();
        System.out.println("A TV está ligada? " + tv.ligada);

        tv.desligar();
        System.out.println("A TV está ligada? " + tv.ligada);

        tv.aumentarVolume();
        System.out.println("Volume: " + tv.volume);

        tv.diminuirVolume();
        tv.diminuirVolume();
        tv.diminuirVolume();
        tv.diminuirVolume();
        System.out.println("Volume: " + tv.volume);

    }
}
