package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;
public class Area {
    public static void main(String[] args) {
      while (true){
        double radius;
        double area;


            Scanner input = new Scanner(System.in);

            System.out.println("Enter a radius: ");
            if (!input.hasNext() || !input.hasNextDouble()) {
                System.out.println("This did not work need a real number");
            } else {
                radius = input.nextDouble();
                if (radius < 0) {
                    System.out.println("There is something wrong here enter a positive number");
                } else if (radius == 0) {
                    System.out.println("Thanks");
                    input.close();
                    break;
                }else{
                    area = Circle.getArea(radius);
                    System.out.println("The area of the circle of radius " + radius + " is: " + area + " ");
                }
            }
        }
    }
}
