public class Main {
    public static boolean ligarInterruptor() {
        if (passarEletricidade()) {
            if (acenderLampada()) {
                System.out.println("Lampada acesa!");
                return true;
            }
        }
        System.out.println("Queimou");
        return false;
    }

    static boolean passarEletricidade() {
        return true;
    }

    static boolean acenderLampada() {
        return false;
    }

    public static void main(String[] args) {
        System.out.println(ligarInterruptor());
    }
}