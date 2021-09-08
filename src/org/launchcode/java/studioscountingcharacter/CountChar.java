package org.launchcode.java.studioscountingcharacter;
import java.util.HashMap;
import java.util.Map;
public class CountChar {
    public static void main(String[] args){
        HashMap<Character, Integer> characterCounts = new HashMap();
        String phrase = "If the product of two terms is zero then common sense says " +
                "at least one of the two terms has to be zero to start with. " +
                "So if you move all the terms over to one side, you can put the " +
                "quadratics into a form that can be factored allowing that side of " +
                "the equation to equal zero. Once you’ve done that, it’s pretty " +
                "straightforward from there.";
        char[] charactersInPhrase = phrase.toCharArray();
        for (char character : charactersInPhrase){
            if (characterCounts.containsKey(character)){
                characterCounts.replace(character, characterCounts.get(character) +1);

            }else{
                characterCounts.put(character, 1);
            }
        }
        for (Map.Entry<Character, Integer> oneChar: characterCounts.entrySet()){
            System.out.println(oneChar.getKey() + ":" + oneChar.getValue());
        }

    }
}
