package com.codejayant.ctciproblemsjava.chapter1.problem3;

import java.util.Arrays;

public class ConvertStringToUrlStandardForSpace {

    public static void main(String args[]) {
        String str = "Mr John Smith    ";
        int trueLengthOfString = 13;

        System.out.println("urlify: " + replaceSpace(str.toCharArray(), trueLengthOfString));
    }

    private static String replaceSpace(char[] str, int trueLengthOfString) {

        int spaceCount = 0;

        for (int i = 0; i < trueLengthOfString; i++) {
            if (str[i] == ' ') {
                spaceCount++;
            }
        }

        int index = trueLengthOfString + spaceCount * 2;

        if (trueLengthOfString < str.length) {
            str[trueLengthOfString] = '\0'; // End Array
        }

        for (int i = trueLengthOfString - 1; i >= 0; i--) {
            if (str[i] == ' ') {
                str[index - 1] = '0';
                str[index - 2] = '2';
                str[index - 3] = '%';
                index = index - 3;
            } else {
                str[index - 1] = str[i];
                index--;
            }
        }

        return Arrays.toString(str);
    }
}
