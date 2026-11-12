public class Main {
    private static Professor professor;

    public static void main(String[] args) {
        professor = new Professor("Rosica");

        System.out.println("Nome: " + professor.getNome());
    }
}