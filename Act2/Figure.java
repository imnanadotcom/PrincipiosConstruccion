public abstract class Figure {
    private int numberOfSides;

    public Figure(int numberOfSides) {
        this.numberOfSides = numberOfSides;
    }

    public int getNumberOfSides() {
        return numberOfSides;
    }

    public abstract double calculateArea();
    public abstract double calculatePerimeter();

    public interface Resize {
        void resize(double x);
    }
}