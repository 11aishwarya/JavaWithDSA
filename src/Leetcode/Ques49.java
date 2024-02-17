package Leetcode;

import java.util.*;

public class Ques49 {
    /*
    valid anagrams
    ip: ["eat","tea","tan","ate","nat",
    'bat'];
    op : [["bat"],["nat","tan"],["ate","eat","tea"]];
     */
    public static void main(String[] args) {

          String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};

        List<List<String>> anagramGroups = groupAnagrams(strs);

        // Print the grouped anagrams
        for (List<String> group : anagramGroups) {
            System.out.println(group);
        }
    }
    public static  List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String word : strs) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);

            if (!map.containsKey(sortedWord)) {
                map.put(sortedWord, new ArrayList<>());
            }

            map.get(sortedWord).add(word);
        }

        return new ArrayList<>(map.values());
    }
}
