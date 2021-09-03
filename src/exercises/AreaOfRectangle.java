package exercises;
import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Length of  the rectangle:");
        Double numLength = input.nextDouble();

        System.out.println("Height of the rectangle:");
        Double numHeight = input.nextDouble();

        System.out.println("Width of the rectangle:");
        Double numWidth = input.nextDouble();

        double area = numLength * numHeight * numWidth;
        System.out.println("The area of the rectangle is " + area + "sq/ft");

    }
}
