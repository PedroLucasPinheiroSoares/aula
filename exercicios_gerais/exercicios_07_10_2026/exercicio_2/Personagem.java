import java.util.List;

public class Personagem {

    String nome = "";
    int vida = 0;
    //Tipo[] tipo;
    List<Tipo> tipo;    //se eu só colocar ponto e virgula sem nada nem igual ele já consta como vazio
    List<Poder> poder;

    public Personagem (String nome, int vida, String tipo, String poder) {
        this.nome = nome;
        this.vida = vida;
        Tipo tipo1 = new Tipo(tipo);
        this.tipo.add(tipo1);
        Poder poder1 = new Poder(poder);
        this.poder.add(poder1);
    }

    public void setNome (String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }

    public void setVida (int vida){
        this.vida = vida;
    }
    public int getVida(){
        return this.vida;
    }


    public static void main(String[] args) {

        List<Personagem> personagens;
        personagens.add(
            new Personagem("Ben 10", 100, "Mutante", "Transformação"),
            new Personagem("Batman", 98, "Cavaleiro", "Dinheiro")
        );

        for (Personagem persona : personagens) {
            System.out.println("Nome: " + persona.getNome());
        }
        

    }
}
