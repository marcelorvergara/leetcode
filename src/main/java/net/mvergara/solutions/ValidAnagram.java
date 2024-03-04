package net.mvergara.solutions;

import java.util.HashMap;

public class ValidAnagram {
    public static boolean isAnagram(String s1, String s2) {

        if (s1.length() != s2.length())
            return false;

        var s1HM = createHashMap(s1);
        var s2HM = createHashMap(s2);

        return s1HM.equals(s2HM);
    }

    private static HashMap<Character, Integer> createHashMap(String s) {
        HashMap<Character, Integer> stringHashMap = new HashMap<>();

        for (char c : s.toCharArray()) {
            stringHashMap.put(c, stringHashMap.getOrDefault(c, 0) + 1);
        }
        return stringHashMap;
    }
}
