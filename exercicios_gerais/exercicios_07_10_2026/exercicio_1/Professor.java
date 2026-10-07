public class Professor {
    String nome = "";
    int quantidadeCafe = 0;
    String humor = ""; //Bem Humorado, Neutro, Mal Humorado
    String nivelDePaciencia = ""; //Alto, Médio, Baixo
    boolean usaDatashow = false;
    String fraseFavorita = "";

    public Professor(String nome, int quantidadeCafe, String humor, String nivelDePaciencia, boolean usaDatashow, String fraseFavorita){
        this.nome = nome;
        this.quantidadeCafe = quantidadeCafe;
        this.humor = humor;
        this.nivelDePaciencia = nivelDePaciencia;
        this.usaDatashow = usaDatashow;
        this.fraseFavorita = fraseFavorita;
    }
    
}
