package com.codejayant.ctciproblemsjava.chapter1.problem2;

/**
 * Check Permutation of two string by bitwise operation.
 *
 * Assumption :
 * 1. characters are unique in string
 * 2. It is case insensitive permutation
 * 3. CharacterSet in ASCII
 *
 */
public class CheckPermutationWithBitWiseOperation {

    public static void main(String args[])  {
        String str1 = "Cat", str2 = "tac";
        System.out.println("Is str1 permutation of str2? " +  isPerm(str1, str2));
    }

    private static boolean isPerm(String str1, String str2)    {
        if (str1.length() != str2.length()) {
            return false;
        }

        int i1 = 0, i2 = 0; // Assumption : CharacterSet ASCII

        for (int i = 0; i < str1.length(); i++)   {
            int c = str1.charAt(i) - 'a';
            i1 |= (1 << c);
        }

        for (int i = 0; i < str2.length(); i++) {
            int c = str2.charAt(i) - 'a';
            i2 |= (1 << c);
        }

        return i1 == i2;
    }
}
