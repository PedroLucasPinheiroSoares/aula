public class Main {
    public static void main(String [] args){

        String saudacao = "Hello World ! ! !";
        System.out.println(saudacao.length());
        System.out.println(saudacao.toLowerCase());
        System.out.println(saudacao.toUpperCase());
        System.out.println(saudacao.indexOf("W"));
        System.out.println(saudacao.charAt(6));

        //Estamos usando o padrão snake_case
        String aluno_1 = "Miranata";
        String aluno_2 = "Astronauta";
        System.out.println(aluno_1.equals(aluno_2)); //false

        String mensagem = " Hello World ";
        System.out.println("-" + mensagem.trim() + "-");  //remove espaçoes desnecessários do inicio e do fim

        String nome = "Savalo";
        String sobrenome = "Horse";
        System.out.println(nome + " " + sobrenome); //junta frases, strings, nomes, etc.

        String aluno_3 = "Pombinha da Paz Silva Sanots de Jesus";
        System.out.println(aluno_3.contains("Paz")); //true

        String aluno_4 = "";
        System.out.println(aluno_4.isEmpty()); //true

        String frutas = String.join("-", "Laranja", "Banana");
        System.out.println(frutas);

        String nome_completo = "Del Lokom Pirom";
        System.out.println(nome_completo.replace("m", "n"));

        String texto = "Boa noite";
        // saudacao.substring(inicio, fim));
        System.out.println(texto.substring(4, 9)); // 9

        String frase = "Repetição com \\\"correção\\\" leva a \\\"perfeição\\\"\"";
        System.out.println(frase);
    }
}