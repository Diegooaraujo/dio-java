public enum EstadosBr {
    SAO_PAULO("SP", "São Paulo"),
    RIO_DE_JANEIRO("RJ", "Rio de Janeiro"),
    MINAS_GERAIS("MG", "Minas Gerais"),
    BAHIA("BA", "Bahia"),
    RIO_GRANDE_DO_SUL("RS", "Rio Grande do Sul"),
    PARANA("PR", "Paraná"),
    SANTA_CATARINA("SC", "Santa Catarina"),
    GOIAS("GO", "Goiás");



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
