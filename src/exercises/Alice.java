package exercises;

public class Alice {
    public static void main(String[] args){
        String s = "Strings: The first sentence of Alice’s Adventures in Wonderland is below. " +
                "Store this sentence in a string, and then prompt the user for a term to search " +
                "for within this string. Print whether or not the search term was found. " +
                "Make the search case-insensitive, so that searching for “alice”, for example, prints true.";

        String firstSentence = "Store this sentence in a string,";
        String searchTerm = " ";
        Integer index = firstSentence.indexOf(searchTerm);
        Integer length = searchTerm.length();
        System.out.println("Your search term first appears at index " + index + ". Your term is " + length + " characters long.");
        String modifiedSentence = firstSentence.replace(searchTerm, "");
        System.out.println(modifiedSentence);

    }
}
