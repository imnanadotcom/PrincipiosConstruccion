package Lab2.DiagramaUno;

public class Company {
    private String name;
    private Employee[] arrEmployee;
    private int nbEmployee;

    public Company(String name, int size) {
        this.name = name;
        this.arrEmployee = new Employee[size];
        this.nbEmployee = 0;
    }

    public void displayAll() {
        for (int i = 0; i < nbEmployee; i++) {
            arrEmployee[i].display();
        }
    }

    public void addEmployee(Employee e) {
        if (nbEmployee < arrEmployee.length) {
            arrEmployee[nbEmployee] = e;
            nbEmployee++;
        } else {
            System.out.println("No space to add more employees");
        }
    }

    public int searchName(String name) {
        for (int i = 0; i < nbEmployee; i++) {
            if (arrEmployee[i].getName().equals(name)) {
                return i;
            }
        }
        return -1; // Not found
    }

    public void deleteEmployee(String name) {
        int index = searchName(name);
        if (index != -1) {
            for (int i = index; i < nbEmployee - 1; i++) {
                arrEmployee[i] = arrEmployee[i + 1];
            }
            arrEmployee[nbEmployee - 1] = null;
            nbEmployee--;
        } else {
            System.out.println("Employee not found");
        }
    }

    public double getYearlyPay(String name) {
        int index = searchName(name);
        if (index != -1) {
            return arrEmployee[index].calculatePay();
        } else {
            System.out.println("Employee not found");
            return 0;
        }
    }

    public double calAvgPayForPartTime() {
        double totalPay = 0;
        int count = 0;
        for (int i = 0; i < nbEmployee; i++) {
            if (arrEmployee[i] instanceof PartTimeEmp) {
                totalPay += arrEmployee[i].calculatePay();
                count++;
            }
        }
        return count > 0 ? totalPay / count : 0;
    }
}

