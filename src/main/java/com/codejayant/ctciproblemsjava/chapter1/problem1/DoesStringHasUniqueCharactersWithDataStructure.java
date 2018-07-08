package com.codejayant.ctciproblemsjava.chapter1.problem1;

import java.util.HashMap;
import java.util.Map;

/**
 * This class is to find if a string has all unique characters or not using data structure.
 */
public class DoesStringHasUniqueCharactersWithDataStructure {

    public static void main(String[] args) {
        String str = "jay";

        System.out.println("Does string has unique characters? " + isStringUnique(str));
    }

    private static boolean isStringUnique(String str) {

        Map<Character, Boolean> dictionary = new HashMap<>();

        for (Character c : str.toCharArray())  {
            if (dictionary.get(c) != null)  {
                return false;
            }

            dictionary.put(c, true);
        }

        return true;
    }

}
