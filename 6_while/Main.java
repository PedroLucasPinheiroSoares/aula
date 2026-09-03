public class Main {
    public static void main(String[] args)throws InterruptedException{

        int i = 100;
        
        while (i > 0) {
            System.out.println(i);
            i--;

            Thread.sleep(100);
        }

        i = i + 100;

        while (i > 0) {
            System.out.println(i);

            Thread.sleep(250);

            // Limpa o terminal
            System.out.print("\033[H\033[2J");
            System.out.flush();

            i--;
        }
    }
}
