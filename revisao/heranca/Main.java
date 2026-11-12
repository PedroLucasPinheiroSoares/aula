import java.util.List;
import java.util.ArrayList;

public class Main {
    private static List<Professor> professores = new ArrayList<>();
    private static List<Aluno> alunos = new ArrayList<>();

    public static void main(String[] args) {  // usa o static pra nãi ficar crian new Main toda hora
        professores.add(new Professor("Diogo"));
        professores.add(new Professor("Rosica"));

        alunos.add(new Aluno("Pedro Foda"));
        alunos.add(new Aluno("Samuel Lindo"));
        alunos.add(new Aluno("Diogo Broxa"));
        alunos.add(new Aluno("Miguel Estuprado"));

        int i = 1;

        for (Professor prof : professores) {
            System.out.println("Nome " + i + ": " + prof.getNome());
            i ++;
        }

        i = 1;

        System.out.println(" ");

        for (Aluno al : alunos) {
            System.out.println("Nome " + i + ": " + al.getNome());
            i ++;
        }
    }
    
}
