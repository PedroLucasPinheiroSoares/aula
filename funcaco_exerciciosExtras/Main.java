public class Main{



    //EXERCICIO 1 

    // static void analisaNum(int num){
    //     if(num == 0){
    //         System.out.println(num + " e igual a zero");
    //     }else if(num > 0){
    //         System.out.println(num + " e maior que zero");
    //     }else{
    //         System.out.println(num + " e menor que zero");
    //     }
    // }

    // public static void main(String[] args){
    //     analisaNum(-5);
    //     analisaNum(0);
    //     analisaNum(5);
    // }





    //EXERCICIO 2

    // static void mediaAluno(String aluno, double nota){
    //     if(nota > 7 || nota == 7){
    //         System.out.println(aluno + " esta aprovado!   :)  ---  Nota " + nota);
    //     }else{
    //         System.out.println(aluno + " esta reprovado!  :(  ---  Nota " + nota);
    //     }

    //     System.out.println();
    // }

    // public static void main(String[] args){
    //     mediaAluno("Davi", 0);
    //     mediaAluno("Miguel", 7);
    //     mediaAluno("Matheus", 6.9);
    //     mediaAluno("Pedro", 10);
    // }





    //EXERCICIO 3

    // static void tabuada(int n){
    //     for(int i = 0; i < 11; i++){
    //         System.out.println(i + " X " + n + " = " + (i*n));
    //     }
    // }

    // public static void main(String[] args){
    //     tabuada(2);
    // }






    //EXERCICIO 4

    static void periodo(int valor_inicial, int valor_final){
        while (valor_inicial < (valor_final + 1)) {
            System.out.println(valor_inicial);
            valor_inicial++;
        }
    }

    public static void main(String[] args){
        periodo(20, 67);
    }


}