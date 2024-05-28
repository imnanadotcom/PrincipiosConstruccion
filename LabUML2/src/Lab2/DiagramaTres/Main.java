package Lab2.DiagramaTres;

public class Main {
    public static void main(String[] args) {
        
        Empleado empleado = new Empleado("Juan Pérez");
        Tarea tarea1 = new TareaOptativa("Revisión de inventario", 5);
        Tarea tarea2 = new TareaAdministrativa("Organizar archivos");

        empleado.hacerTarea(tarea1);
        empleado.hacerTarea(tarea2);

    }
}