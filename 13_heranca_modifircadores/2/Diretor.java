public class Diretor extends Pessoa {

    public Diretor(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public void profissao(){
        System.out.println(" Ola grandioso diretor " + this.nome + "!");
        System.out.println(" Sua idade e de " + this.idade + " anos");
        System.out.println(" ");
    }
    
}

