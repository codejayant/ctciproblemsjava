package com.codejayant.ctciproblemsjava.chapter1.problem1;

public class DoesStringHasUniqueCharactersWithoutDataStructure {

    public static void main(String[] args) {
        String str = "jaa";

        System.out.println("Does string has unique characters? " + isStringUnique(str));
    }

    private static boolean isStringUnique(String str) {

        int checker = 0;

        for (int i = 0; i < str.length(); i++)  {
            int val = str.charAt(i) - 'a';

            if ((checker & (1 << val)) > 0) {
                return false;
            }

            checker |= (1 << val);
        }
        return true;
    }

}
