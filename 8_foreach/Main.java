// VETOR -> ARRWAY -> LISTA    ---  Tudo a mesma coisa   -- for each é "para cada" então é para cada elemento, tipo faça tal coisa pra cada elemento


public class Main {
    public static void main(String [] args){



        //EXERCICIO 1

        // String[] alunos = {"Miranata", "Savalo", "Aeronauta"};

        // for(String estudante : alunos){
        //     System.out.println(estudante);
        // }



        // EXERCICIO 2


        // String[] alunos = {"Miranata", "Savalo", "Aeronauta"};

        // alunos[0] = "Mariazinha";
        // System.out.println("Qtd de alunos: " + alunos.length);

        // for(String estudante : alunos){
        //     System.out.println(estudante);
        // }










        //EXERCICIO 2

        // System.out.println("    FOR  EACH");
        // System.out.println("   ");

        // String[] produtos = {"Pao", "Rosquinha", "Baguete", "Salada", "Bolo"};

        // for(String comidas : produtos){
        //     System.out.println(comidas);
        // }

        // System.out.println("   ");
        // System.out.println("    FOR");
        // System.out.println("   ");

        // for(int i = 0; i < 5; i++){
        //     System.out.println(produtos[i]);
        // }



    





        //EXERCICIO 3

        int[] numeros = {1, 0, -3, 10, -5};

        for (int numero : numeros) {

            if (numero > 0) {
                System.out.println(numero + " = positivo");
            } else if (numero < 0) {
                System.out.println(numero + " = negativo");
            } else {
                System.out.println(numero + " = zero"); 
            }
        }
    }
}
