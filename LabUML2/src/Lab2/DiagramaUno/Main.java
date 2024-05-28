package Lab2.DiagramaUno;

public class Main {
    public static void main(String[] args) {
        // Create some employees
        PartTimeEmp employeeOne = new PartTimeEmp("Maria Luisa", 1, 20, 15);
        PartTimeEmp employeeTwo = new PartTimeEmp("Juan Carlos", 2, 25, 20);
        PartTimeEmp employeeThree = new PartTimeEmp("Teresita", 3, 30, 25);

        Company company = new Company("LISTECH", 10);
        company.addEmployee(employeeOne);
        company.addEmployee(employeeTwo);
        company.addEmployee(employeeThree);

        System.out.println("----------Empleados actuales----------");
        company.displayAll();

        System.out.println("----------Búsqueda de empleados----------");
        String searchName = "Teresita";
        int searchEmployee = company.searchName(searchName);
        System.out.println(searchEmployee);

        System.out.println("----------Eliminar empleado----------");
        company.deleteEmployee("Maria Luisa");
        company.displayAll();

        System.out.println("----------Paga anual de un empleado----------");
        String employeeName = "Juan Carlos";
        double yearlyPay = company.getYearlyPay(employeeName);
        System.out.println("Pago anual de " + employeeName + ": " + yearlyPay);

        System.out.println("----------Paga anual de un empleado de medio tiempo----------");
        double avgPayForPartTime = company.calAvgPayForPartTime();
        System.out.println("Pago de trabajadores de medio tiempo: " + avgPayForPartTime);
    }
}

