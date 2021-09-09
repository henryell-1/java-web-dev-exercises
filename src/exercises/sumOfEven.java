package exercises;
import java.util.ArrayList;
import java.util.Scanner;
public class sumOfEven {
    public static int main(String[] args) {
        //ArrayList<String> students = new ArrayList<>();
        //ArrayList<Double> grades = new ArrayList<>();
        //Scanner input = new Scanner(System.in);
        //String newStudent;

        //System.out.println("Enter number: (or ENTER to finish):");
        int total = 0;
        int[] number = {10, 21, 30, 40, 50, 61, 70, 80, 90, 100};
        ArrayList<Integer> values = new ArrayList<>();
        for (int num : number) {
            values.add(num);
            if (num % 2 == 0) {
                total += num;
            }
        }
        System.out.println(values);
        System.out.println(new sumOfEven());
        return total;



    }
}
