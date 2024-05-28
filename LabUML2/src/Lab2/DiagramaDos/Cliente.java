package Lab2.DiagramaDos;

public class Cliente {

    private String nombre;

    public Cliente ( String nombre ) {
        this.nombre = nombre;

    }

    protected void pagar ( Pedido pedido ) {
        System.out.println( nombre + " ha realizado un pago." );

    }
}


