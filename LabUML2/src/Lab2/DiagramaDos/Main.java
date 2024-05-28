package Lab2.DiagramaDos;

public class Main {
    public static void main(String[] args) {

        Pedido pedido = new Pedido("2024-05-28", 500);

        Cliente clienteCorporativo = new ClienteCorporativo("Empresa XYZ", "12345-67890");
        clienteCorporativo.pagar(pedido);

        Cliente clienteParticular = new ClienteParticular("Juan Pérez", "9876-54321");
        clienteParticular.pagar(pedido);
        
        Cliente clienteGeneral = new Cliente("Cliente General");
        clienteGeneral.pagar(pedido);
    }
}


