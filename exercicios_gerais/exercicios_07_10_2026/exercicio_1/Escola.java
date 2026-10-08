public class Escola {
    public static void main(String[] args) {
        Aluno aluno_1 = new Aluno("Pedro Lucas", "pedrol@gmail.com", true, 1, false);
        Aluno aluno_2 = new Aluno("Oscar Alho", "oscara@gmail.com", false, 8, true);

        Professor professor_1 = new Professor("Diogo", 3, "Bem Humorado", "Alto", true, "Savalo Horse");
        Professor professor_2 = new Professor("Vagner", 0, "Neutro", "Medio", false, "Coisa de Corinthiano");

        Aluno[] alunos = { aluno_1, aluno_2 };
        Professor[] professores = { professor_1, professor_2 };

        for(Aluno estudante: alunos) {
            System.out.println("______________"); //linha
            System.out.println(""); //espaço
            System.out.println("Aluno: " + estudante.getNome());
            System.out.println("E-mail: " + estudante.getEmail());
            System.out.println("Inteligente: " + estudante.getInteligente());
            System.out.println("Nível de Sono: " + estudante.getNivelSono());
            System.out.println("Piscando Lento: " + estudante.getPiscandoLento());
            estudante.dormirNaAula();
            estudante.fingirEstudar();
            System.out.println(""); //espaço
            System.out.println("______________"); //linha
        }

        for(Professor prof: professores) {
            System.out.println("______________"); //linha
            System.out.println(""); //espaço
            System.out.println("Professor: " + prof.getNome());
            System.out.println("Quantidade de Café: " + prof.getQuantidadeCafe());
            System.out.println("Humor: " + prof.getHumor());
            System.out.println("Nível de Paciência: " + prof.getNivelDePaciencia());
            System.out.println("Usa data show: " + prof.getUsaDataShow());
            System.out.println("Frase Favorita do Professor: " + prof.getFraseFavorita());
            System.out.println(""); //espaço
            System.out.println("______________"); //linha
        }
    }
}
