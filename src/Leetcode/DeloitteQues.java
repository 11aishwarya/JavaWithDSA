package Leetcode;

import java.util.Scanner;

public class DeloitteQues {
    /*

Output Format:

single line of output contains the resultant word.

Sample Input: helloworld

sample Output: "hheelllloowwoorrlldd"
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        String doubledString = doubleLetters(str);

        System.out.println("Doubled string: " + doubledString);

        scanner.close();
    }

    public static String doubleLetters(String str) {
        StringBuilder doubledString = new StringBuilder();
        for (char c : str.toCharArray()) {
            doubledString.append(c).append(c);
        }
        return doubledString.toString();
    }
}
