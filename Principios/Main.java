public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4, 3);
        System.out.println("Área del rectángulo: " + rectangle.calculateArea());
        System.out.println("Perímetro del rectángulo: " + rectangle.calculatePerimeter());

        rectangle.resize(5);

        System.out.println("Área del rectángulo después de redimensionar: " + rectangle.calculateArea());
        System.out.println("Perímetro del rectángulo después de redimensionar: " + rectangle.calculatePerimeter());
    }
}