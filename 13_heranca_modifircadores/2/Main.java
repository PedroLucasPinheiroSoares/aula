public class Main {
    public static void main(String[] args) {

        Professor prof = new Professor("Diogo", 32);
        Aluno estudante = new Aluno("Pedro", 18);
        Diretor dir = new Diretor("Mathias", 67);

        prof.profissao();
        estudante.profissao();
        dir.profissao();
        
    }
}
