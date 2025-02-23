public class ForEmArray {
    public static void main(String[] args) throws Exception {
       
        String alunos []={"Ana","Maria","José","Pedro","João"};
        for (int i = 0; i < alunos.length; i++){
            System.out.println("Aluno " + alunos[i]);
        }

        // for each
        for (String aluno : alunos){
            System.out.println("Aluno " + aluno);
        }
    }
}
