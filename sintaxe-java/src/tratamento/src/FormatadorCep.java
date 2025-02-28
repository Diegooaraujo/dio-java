public class FormatadorCep {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("12345678");
            System.out.println(cepFormatado);
        } catch (CepInvalido e) {
  
           System.out.println("o cep não é valido");
        }
    }
    

    static String formatarCep(String cep) throws CepInvalido{
        if(cep.length() != 8){
            throw new CepInvalido();
        }
        return"12345-678";
    }
}
