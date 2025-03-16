public class Carro extends Veiculo{
  
    @Override
    public void ligar(){
        conferirCambio();
        conferirConbustivel();
        System.out.println("Carro ligado!");
    }
    private void conferirConbustivel(){
        System.out.println("confereirindo combustivel");
    }
    private void conferirCambio(){
        System.out.println("confereirindo cambio em p");
    }
}
