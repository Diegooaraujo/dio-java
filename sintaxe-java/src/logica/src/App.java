import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Digite o valor do salario: ");
        float valorDeSalario =  sc.nextFloat();
        System.out.println("Digite o valor do beneficio: ");
        float valorBeneficio = sc.nextFloat();
        sc.close();

        float valorImposto = 0;
        if(valorDeSalario >= 0 && valorDeSalario <=1100){
            valorImposto = 0.05F * valorDeSalario;
        }else if (valorDeSalario > 1100.01 && valorDeSalario <= 2500.00){
            valorImposto = 0.10F * valorDeSalario;
        }else if (valorDeSalario > 2500.00){
            valorImposto =0.15F * valorDeSalario;
        }
        float saida = (valorDeSalario - valorImposto + valorBeneficio);
        System.out.println(String.format("%.2f",saida));
    }

    
}
