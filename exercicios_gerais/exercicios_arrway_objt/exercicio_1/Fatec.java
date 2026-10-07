public class Fatec {
    public static void main(String[] args){
        Aluno aluno_1 = new Aluno("Matheus Caralho", "matheuku@gmail.com");
        Aluno aluno_2 = new Aluno("Pedrinho do Sixseven", "sixseven67@gmail.com");
        Aluno aluno_3 = new Aluno("Miguelito do Suquito", "canudodomiguel@gmail.com");
        Aluno aluno_4 = new Aluno("Davizao Toma Fumo", "podejogarseforbom?@gmail.com");
       
        Aluno[] classe = {aluno_1, aluno_2, aluno_3, aluno_4};

        for(Aluno item: classe){
            System.out.println("Nome: " + item.nome);
            System.out.println("Email: " + item.email);
            System.out.println("");
        }
    }
}