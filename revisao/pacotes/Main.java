import colaborador.Vendedor; //primeiro minusculo é a pasta e o segundo com maiusculo é a classe
import cliente.Cliente;
import java.util.List;
import java.util.ArrayList;

public class Main {
    private static List<Vendedor> vendedores = new ArrayList<>();
    private static List<Cliente> clientes = new ArrayList<>();
    public static void main(String[] args) {
        vendedores.add(new Vendedor("Jubileu"));
        clientes.add(new Cliente("Joaozinho"));

        for(Cliente cli : clientes) {
            System.out.println("Cliente: " + cli.getNome());
        }

        for(Vendedor vend : vendedores) {
            System.out.println("Vendedor: " + vend.getNome());
        }
    }
}
