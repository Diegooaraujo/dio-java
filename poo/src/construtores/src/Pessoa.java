public class Pessoa {
    private String nome;
    private int idade;
    private String endereco;

    // Constructor
    public Pessoa(String nome, int idade ) {
        this.nome = nome;
        this.idade = idade;
  
    }

    public String getNome() {
        return nome;
    }


    public int getIdade() {
        return idade;
    }
  

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }


}
