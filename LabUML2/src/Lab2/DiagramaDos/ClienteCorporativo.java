package Lab2.DiagramaDos;

public class ClienteCorporativo extends Cliente {

    private String cuenta;

    public ClienteCorporativo ( String nombre, String cuenta ) {
        super( nombre );
        this.cuenta = cuenta;

    }

    @Override
    protected void pagar ( Pedido pedido ) {
        System.out.println( "Pagado por corporativo con cuenta: " + cuenta + " y cantidad: " + pedido.getPrecio() );

    }
}