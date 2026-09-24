public class Main {
    public static void main(String[] args) {
        Carro veiculo = new Carro();
        veiculo.marca = "Fiat";
        veiculo.modelo = "Mobi";
        veiculo.combustivel = "Flex";
        veiculo.cor = "Cinza";

        System.out.println(veiculo.marca);
        System.out.println(veiculo.modelo);
        System.out.println(veiculo.combustivel);
        System.out.println(veiculo.cor);

        veiculo.ligarCarro();
        veiculo.desligarCarro();

        Moto veiculo2 = new Moto();
        veiculo2.marca = "Honda";
        veiculo2.modelo = "CG-150";
        veiculo2.combustivel = "Gasolina";
        veiculo2.cilindradas = 150;

        veiculo2.ligarMoto();
        veiculo2.desligarMoto();

        Helicoptero veiculo3 = new Helicoptero();
        veiculo3.marca = "Sikorsky";
        veiculo3.modelo = "S-92";
        veiculo3.ano = "2004";

        veiculo3.ligarHelicoptero();
        veiculo3.desligarHelicoptero();

        Balao veiculo4 = new Balao();
        veiculo4.limite_pessoas = 10;

        veiculo4.acender();
        veiculo4.subir();
        veiculo4.descer();

    }
    
}




//faltou colocar todos os prints ln