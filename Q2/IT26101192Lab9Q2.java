import java.util.Scanner;

public class IT26101192Lab9Q2 {

    public static double circleArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double radius = input.nextDouble();

        double area = circleArea(radius);

        System.out.printf("The area of the circle with radius 5.0 is = %.2f", area);

        input.close();
    }
}