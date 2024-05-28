package Lab2.DiagramaUno;

public class PartTimeEmp extends Employee {
    private int nbWorkHours;
    private int rate;

    public PartTimeEmp(String name, int id, int nbWorkHours, int rate) {
        super(name, id);
        this.nbWorkHours = nbWorkHours;
        this.rate = rate;
    }

    public PartTimeEmp(PartTimeEmp p) {
        super(p);
        this.nbWorkHours = p.nbWorkHours;
        this.rate = p.rate;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Número de horas de trabajo: " + nbWorkHours + ", Pago por hora: " + rate);
    }

    @Override
    public double calculatePay() {
        return nbWorkHours * rate;
    }

    public int getRate() {
        return rate;
    }

    public int getNbWorkHours() {
        return nbWorkHours;
    }

    
}

