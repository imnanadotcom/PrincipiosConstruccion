package Lab2.DiagramaDos;

public class ClienteParticular extends Cliente {

    private String tarjeta;

    public ClienteParticular ( String nombre, String tarjeta ) {
        super( nombre );
        this.tarjeta = tarjeta;

    }

    @Override
    public void pagar ( Pedido pedido ) {
        System.out.println("Pagado por particular con tarjeta: " + tarjeta + " y cantidad: " + pedido.getPrecio() );
        
    }
}
