package org.launchcode.java.studioscountingcharacter;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import  java.util.Scanner;
public class Studio2 {
        public static void main(String[] args){
            Scanner input;
            input = new Scanner(System.in);
            System.out.println("Enter a phrase to be counted:");
            String phrase = input.nextLine().toLowerCase();
            input.close();
            HashMap<Character, Integer> characterCounts = new HashMap();

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


