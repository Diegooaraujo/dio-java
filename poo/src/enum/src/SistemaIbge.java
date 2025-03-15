import enum.src.EstadosBr;

public class SistemaIbge {
    public static void main(String[] args) {
        for(EstadosBr estado: EstadosBr.values()){
            System.out.println(estado.getNome());
        }
    }
}
