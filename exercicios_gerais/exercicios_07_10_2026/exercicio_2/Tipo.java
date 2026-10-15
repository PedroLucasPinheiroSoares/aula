//Nome da classe é PascalCase
public class Tipo {

    //Atributos  - snake_case ou skewer_case
    String categoria  = "";

    //Método construtor
    public Tipo (String categoria) {
        this.categoria = categoria;
    }


    // public void setcategoria (String categoria) { this.categoria = categoria;}        Está comententado pq é a msm coisa do de baixo só que em uma única linha
    // public String getcategoria() {return this.categoria;}

    public void setCategoria (String categoria) { 
        this.categoria = categoria;
    }
    public String getCategoria() {
        return this.categoria;
    }
}
