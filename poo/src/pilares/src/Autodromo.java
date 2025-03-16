public class Autodromo {
    public static void main(String[] args) {
        Carro jeep = new Carro();
        // jeep.conferirCambio();
        // jeep.conferirConbustivel();
        jeep.setChassi("12345");
        jeep.ligar();


        Moto moto = new Moto();
        moto.setChassi("123456");
        moto.ligar();
    }
}
