public class For {

    public static void main(String[] args) {

        String alunos [] = {"Lucas", "João", "Maria", "Ana"}; //Array de Strings

        //Loop for para percorrer o array de alunos
        for (int i = 0; i < alunos.length; i++) {
            System.out.println("Aluno: " + alunos[i]); //Imprime o nome do aluno
        }

        //Outra frorma de fazer o mesmo loop, mas com o for each
        for (String aluno : alunos) {
            System.out.println("Aluno: " + aluno); //Imprime o nome do aluno
        }

        //Break e continue
        for(String aluno : alunos) {
            if(aluno.equals("João")) {
                if(aluno.equals("Ana")) {
                    break; //Para o loop se o aluno for Ana
                }
            }
        }
    }
}
