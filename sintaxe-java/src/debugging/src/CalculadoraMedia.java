import java.util.Scanner;

public class CalculadoraMedia {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        String [] alunos = {"camila", "joao", "maria", "pedro", "ana"};

        double media = calculaMedia(alunos, scan);
        System.out.println("A média da turma é: %.1f" + media);
    }

    public static double calculaMedia(String[] alunos, Scanner scan) {
        double soma = 0;
        for (String aluno : alunos) {
            System.out.println("nota do aluno " + aluno);
            double nota = scan.nextDouble();
            soma += nota;
        }
        return soma / alunos.length;
    }
}
