public class Aluno {
    String nome = "";
    String email = "";
    Boolean inteligente = false;
    int nivel_sono = 0;
    Boolean piscando_lento = false;

    public Aluno(String nome, String email, Boolean inteligente, int nivel_sono, Boolean piscando_lento) {
        this.nome = nome;
        this.email = email;
        this.inteligente = inteligente;
        this.nivel_sono = nivel_sono;
        this.piscando_lento = piscando_lento;

    }

    public static void dormirNaAula () {
        if (nivel_sono < 51) {
            piscando_lento = false;
        }else {
            piscando_lento = true;
        }

        if (piscando_lento == false) {
            System.out.println("O aluno está acordado.");
        }else {
            System.out.println("O aluno dormiu na aula!");
        }

    }

    public static void fingirEstudar() {
        if (inteligente == false) {
            System.out.println("O aluno FINGE estudar!");
        }else {
            System.out.println("O aluno realmente estuda.");
        }
        
    }
}
