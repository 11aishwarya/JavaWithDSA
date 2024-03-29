package Leetcode;

import java.util.*;

public class Ques451 {
    /*
    451. Sort Characters By Frequency
Solved
Medium
Topics
Companies
Given a string s, sort it in decreasing order based on the frequency of the characters. The frequency of a character is the number of times it appears in the string.

Return the sorted string. If there are multiple answers, return any of them.



Example 1:

Input: s = "tree"
Output: "eert"
Explanation: 'e' appears twice while 'r' and 't' both appear once.
So 'e' must appear before both 'r' and 't'. Therefore "eetr" is also a valid answer.
Example 2:

Input: s = "cccaaa"
Output: "aaaccc"
Explanation: Both 'c' and 'a' appear three times, so both "cccaaa" and "aaaccc" are valid answers.
Note that "cacaca" is incorrect, as the same characters must be together.
Example 3:

Input: s = "Aabb"
Output: "bbAa"
Explanation: "bbaA" is also a valid answer, but "Aabb" is incorrect.
Note that 'A' and 'a' are treated as two different characters.


Constraints:

1 <= s.length <= 5 * 105
s consists of uppercase and lowercase English letters and digits.
     */

    public static String frequencySort(String s) {
        // Count the frequency of each character.
        Map<Character, Integer> charCounts = new HashMap<>();
        for (char c : s.toCharArray()) {
            charCounts.put(c, charCounts.getOrDefault(c, 0) + 1);
        }

        // Create a custom comparator to sort characters by frequency in descending order.
        Comparator<Character> comparator = (c1, c2) -> charCounts.get(c2) - charCounts.get(c1);

        // Sort the characters.
        List<Character> sortedChars = new ArrayList<>(charCounts.keySet());
        sortedChars.sort(comparator);

        // Build the sorted string.
        StringBuilder sb = new StringBuilder();
        for (char c : sortedChars) {
            for (int i = 0; i < charCounts.get(c); i++) {
                sb.append(c);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String s1 = "tree";
        String s2 = "сссааа";

        System.out.println(frequencySort(s1));  // Output: "eert"
        System.out.println(frequencySort(s2));  // Output: "aaaссс"
    }
}
