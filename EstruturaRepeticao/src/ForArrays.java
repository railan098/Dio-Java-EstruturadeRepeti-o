import java.util.Arrays;

public class ForArrays {
    public static void main(String[] args) {

        String alunos [] = {"Railan", "Yasmin"};
 /*
        for (int x = 0; x < alunos.length;x++ ){
            System.out.println("Aluno do indice x = "+x+" é "+alunos[ x] ) ;
        }*/
 //x        For / each
   //Forma Abreviada
        for (String aluno: alunos){
            System.out.println(aluno);

        }

    }
}
