package Lab2.DiagramaTres;

public class Empleado {

    private String nombre;

    public Empleado( String nombre ) {
        this.nombre = nombre;

    }

    public boolean hacerTarea(Tarea tarea) {
        System.out.println(this.nombre + " está realizando la tarea: " + tarea.getNombre());
        return true;

    }
}
    