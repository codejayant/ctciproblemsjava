package com.codejayant.ctciproblemsjava.chapter1.problem2;

/**
 * Check Permutation of two string by array
 *
 * Assumption :
 * 1. characters can be of different count in string
 * 2. It is case sensitive permutation
 * 3. CharacterSet in ASCII
 *
 */
public class CheckPermutationWithHashTable {

    public static void main(String args[])  {
        String str1 = "Car", str2 = "rac";

        System.out.println("is str1 permutation of str2? " + isPerm(str1, str2));
    }

    private static boolean isPerm(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        // Assumption : ASCII
        int[] letters = new int[128];

        for (int i = 0; i < str1.length(); i++) {
            letters[str1.charAt(i)]++;
        }

        for (int i = 0; i < str2.length(); i++) {
            letters[str2.charAt(i)]--;

            if (letters[str2.charAt(i)] < 0)    {
                return false;
            }
        }

        return true;
    }

}
