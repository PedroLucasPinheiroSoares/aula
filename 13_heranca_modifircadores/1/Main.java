public class Main {
    public static void main(String[] args) {
        Dog cao = new Dog();
        Cat gato = new Cat();

        cao.nome = "Toto";
        gato.nome = "Jubileu";

        cao.som();
        gato.som();

        cao.dormir();
        cao.acordar();

        gato.dormir();
        gato.acordar();
    }
    
}
