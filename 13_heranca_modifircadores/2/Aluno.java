public class Aluno extends Pessoa {

    public Aluno(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public void profissao(){
        System.out.println(" Ola grandioso aluno " + this.nome + "!");
        System.out.println(" Sua idade e de " + this.idade + " anos");
        System.out.println(" ");
    }
    
}

