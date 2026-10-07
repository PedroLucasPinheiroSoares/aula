public class CestaNatal {
    public static void main(String[] args){
        Itens Item_1 = new Itens (123, "Panetone", 7, 20.10);
        Itens Item_2 = new Itens (6767, "Vinho", 3, 80.00);
        Itens Item_3 = new Itens (777, "Uvas passas", 2, 15.00);
        Itens Item_4 = new Itens (6969, "Peru", 4, 300.00);
        Itens Item_5 = new Itens (157, "Coca-fanta", 10, 150.00);
        Itens Item_6 = new Itens (4242, "Cafe", 1, 1000.00);
        Itens Item_7 = new Itens (987, "Pessego", 1, 50.00);

        Itens[] classe = {Item_1, Item_2, Item_3, Item_4, Item_5, Item_6, Item_7};

        for(Itens item: classe){
            System.out.println("Codigo: " + item.codigo);
            System.out.println("Nome: " + item.nome);
            System.out.println("Quantidade: " + item.quantidade);
            System.out.println("Preco: " + item.preco);
            System.out.println("");
        }
    }
}
