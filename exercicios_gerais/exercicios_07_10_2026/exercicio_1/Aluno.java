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

    public void setNome (String nome) { this.nome = nome;}
    public String getNome() {return this.nome;}
    public void setEmail (String email) { this.email = email;}
    public String getEmail() {return this.email;}
    public void setInteligente (Boolean inteligente) { this.inteligente = inteligente;}
    public Boolean getInteligente() {return this.inteligente;}
    public void setNivelSono (int nivel_sono) { this.nivel_sono = nivel_sono;}
    public int getNivelSono() {return this.nivel_sono;}
    public void setPiscandoLento (Boolean piscando_lento) { this.piscando_lento = piscando_lento;}
    public Boolean getPiscandoLento() {return this.piscando_lento;}

    //Métodos Personalizados
    public void dormirNaAula() {
        if (nivel_sono < 6) {
            System.out.println("O aluno não está dormindo na aula.");
        }else{
            System.out.println("O aluno está dormindo na aula!");
        }
    }

    public void fingirEstudar(){
        if(inteligente = false){
            System.out.println("O aluno finge estudar!");
        }else{
            System.out.println("O aluno realmente estuda.");
        }
    }
 
}
