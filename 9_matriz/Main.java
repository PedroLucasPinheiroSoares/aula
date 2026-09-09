public class Main {
    public static void main(String [] args){

        //int[][] numeros= { {1, 4, 2, 0}, {3, 6, 8, 7}, {70, 5968, 5, 514326}, {542, 67, 69, 2020207}};

        int[][] numeros= { 
            {1, 4, 2, 0}, 
            {3, 6, 8, 7}, 
            {70, 5968, 5, 514326}, 
            {542, 67, 69, 2020207}};
            
        System.out.println(numeros[2][3]); // Saída 514326

        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                System.out.println(numeros[i][j]); // Exibe a matriz
            }
        }

        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                numeros[i][j] = 0; // Vai zerar todos os valores da matriz percorrendo ela
            }
        }

        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                System.out.println(numeros[i][j]); // Exibe todos os elementos da matriz
            }
        }

        numeros[2][3] = 67;
        System.out.println(numeros[2][3]);
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                System.out.println(numeros[i][j]); // Exibe todos os elementos da matriz
            }
        }



        // Segue abaixo a exibição foda
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                System.out.print(numeros[i][j] + " "); 
                if (j == 3){
                    System.out.println("");
                }
            }
        }
    }
}
