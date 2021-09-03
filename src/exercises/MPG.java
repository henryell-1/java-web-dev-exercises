package exercises;
import  java.util.Scanner;
public class MPG {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Miles that you have driven:");
        Double numMiles = input.nextDouble();

        System.out.println("Gallons that you have Used:");
        Double numGallons = input.nextDouble();

        double mpg = numMiles / numGallons;
        System.out.println("The number of miles per gallon " + mpg + " mpg.");
    }
}
