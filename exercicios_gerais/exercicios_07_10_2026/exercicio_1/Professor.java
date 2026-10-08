public class Professor {
    //atributos
    String nome = "";
    int quantidade_cafe = 0;
    String humor = ""; //Bem Humorado, Neutro, Mal Humorado
    String nivel_de_paciencia = ""; //Alto, Médio, Baixo
    boolean usa_data_show = false;
    String frase_favorita = "";


    //metodo construtor
    public Professor(String nome, int quantidade_cafe, String humor, String ivel_de_paciencia, boolean usaDatashow, String fraseFavorita){
        this.nome = nome;
        this.quantidade_cafe = quantidade_cafe;
        this.humor = humor;
        this.nivel_de_paciencia = nivel_de_paciencia;
        this.usa_data_show = usa_data_show;
        this.frase_favorita = frase_favorita;
    }


    //metodos Get e Set - Setters e Getters - camelCase
    public void setNome (String nome) { 
        this.nome = nome;
    }
    public String getNome() {
        return this.nome;
    }
    public void setQuantidadeCafe(int quantidade_cafe) {this.quantidade_cafe = quantidade_cafe;}
    public int getQuantidadeCafe() {return this.quantidade_cafe;}
    public void setHumor(String humor) {this.humor = humor;}
    public String getHumor() {return this.humor;}
    public void setNivelDePaciencia(String nivel_de_paciencia) {this.nivel_de_paciencia = nivel_de_paciencia;}
    public String getNivelDePaciencia() {return this.nivel_de_paciencia;}
    public void setUsaDataShow(Boolean usa_data_show) {this.usa_data_show = usa_data_show;}
    public Boolean getUsaDataShow() {return this.usa_data_show;}
    public void setFraseFavorita (String frase_favorita) {this.frase_favorita = frase_favorita;}
    public String getFraseFavorita () {return this.frase_favorita;}

    //nesses de cima eu posso dar espaço pra ficar visualmente mais bonito e organizado; como eu fiz nos dois primeiros


    // Método personalizados
    public void ensinar() {
        System.out.println("Professor finge ensinar!");
    }
    
    public void tomarCafe() {
        if(quantidade_cafe > 0){
            System.out.println("Professor toma café!");
        }else{
            System.err.println("Professor não toma café.");
        }
    }
    
}
