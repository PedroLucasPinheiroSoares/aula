public class Poder {
    String descricao  = "";


    public Poder (String descricao) {
        this.descricao = descricao;
    }


    // public void setdescricao (String descricao) { this.descricao = descricao;}        Está comententado pq é a msm coisa do de baixo só que em uma única linha
    // public String getdescricao() {return this.descricao;}

    public void setPoder (String descricao) { 
        this.descricao = descricao;
    }
    public String getPoder() {
        return this.descricao;
    }
}
