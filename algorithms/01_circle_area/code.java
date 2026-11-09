
import java.util.Scanner;

class Main {

    static double calcualteCircleArea(double radius) {
        double area = radius * radius * Math.PI;
        return area;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter The Radius");
        double radius = scanner.nextDouble();
        double area = calcualteCircleArea(radius);
        System.out.println("Circle Area" + area);

        scanner.close();
    }
}
