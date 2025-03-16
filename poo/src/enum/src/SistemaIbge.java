






enum EstadosBr {
    SAO_PAULO("SP","São Paulo"),
    RIO_DE_JANEIRO("RJ","Rio de Janeiro"),
    MINAS_GERAIS("MG","Minas Gerais");

    private String nome;
    private String sigla;

   
   
    private EstadosBr(String sigla, String nome){
        this.sigla = sigla;
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public String getSigla() {
        return sigla;
    }
    public String getNomeMaiusculo(){
        return nome.toUpperCase();
    }
}

public class SistemaIbge {
    public static void main(String[] args) {
        for(EstadosBr estado: EstadosBr.values()){
            System.out.println(estado.getNome());
        }
    }
}


