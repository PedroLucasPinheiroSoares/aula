package exercicios;
public class Main {
    public static void main(String[] args){

        //boolean luz = true;
        //if (luz) {
            //System.out.println("Luz Acesa !!!");
        //} else {
            //System.out.println("Luz Apagada");
        //}

        //luz = false;
        //if (luz) {
            //System.out.println("Luz Acesa !!!");
        //} else {
            //System.out.println("Luz Apagada");
        //}




        //int tempo = 20;
        //String mensagem = (tempo < 10) ? "Bom dia" : "Boa noite";          IF EM UMA ÚNICA LINHA
        //System.out.println(mensagem);



        int idade = 0;
        String mensagem = "";

        if (idade > 0 && idade < 13){
            mensagem = "crianca";

        }else if (idade > 12 && idade < 19){
            mensagem = "adolescente";

        }else if (idade > 18 && idade < 61){
            mensagem = "adulto";

        }else if (idade > 60){
            mensagem = "idoso";
        }

        System.out.println(mensagem);

    }
}