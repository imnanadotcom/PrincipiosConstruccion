package Lab2.DiagramaDos;

public class Pedido {
    
    private int precio;
    private String fecha;

    public Pedido ( String fecha, int precio ) {
        this.precio = precio;
        this.fecha = fecha;
        
    }

    public int getPrecio () {
        return precio;

    }

    public String getFecha () {
        return fecha;

    }
}
