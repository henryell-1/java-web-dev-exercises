package exercises;

import java.util.Arrays;

public class StringExercise {
    public static void main(String[] args){
        String saying = "I would not, could not, in a box. I would not, " +
                "could not with a fox. I will not eat them in a house. " +
                "I will not eat them with a mouse.";
        String[] words = saying.split("\\.");
        System.out.println(Arrays.toString(words));

    }
}
