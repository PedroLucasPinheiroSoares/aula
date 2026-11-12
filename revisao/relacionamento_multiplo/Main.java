import java.util.List;
import java.util.ArrayList;

public class Main {
    private static List<Professor> professor = new ArrayList<>();
    private static List<Aluno> aluno = new ArrayList<>();

    public static void main(String[] args) {
        professor.add(new Professor("Rosica"));
        professor.add(new Professor("Diogo"));
        professor.add(new Professor("Jubileu"));

        aluno.add(new Aluno("Pedro"));
        aluno.add(new Aluno("MIguel"));

        int i = 1;  //firula minha

        for(Professor prof : professor) {
            System.out.println("Nome professor" + i + ": " + prof.getNome());
            i = i + 1;
        }

        System.out.println(" ");

        for(Aluno estudante : aluno) {
            System.out.println("Nome aluno" + i + ": " + estudante.getNome());
            i = i + 1;
        }
    }
}