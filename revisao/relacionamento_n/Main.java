import java.util.List;
import java.util.ArrayList;

public class Main {
    private static List<Professor> professor = new ArrayList<>();

    public static void main(String[] args) {
        professor.add(new Professor("Rosica"));
        professor.add(new Professor("Diogo"));
        professor.add(new Professor("Jubileu"));

        int i = 1;  //firula minha

        for(Professor prof : professor) {
            System.out.println("Nome " + i + ": " + prof.getNome());
            i = i + 1;
        }
    }
}