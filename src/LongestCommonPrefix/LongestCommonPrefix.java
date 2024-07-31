package LongestCommonPrefix;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0)
            return "";

        if (strs.length == 1)
            return strs[0];

        Arrays.sort(strs);

        int i = 0;
        while (i < strs[0].length()) {
            char ch = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].charAt(i) != ch) {
                    return strs[0].substring(0, i);
                }
            }
            i++;
        }

        return strs[0];
    }

    public static void main(String args[]) {
        String strs1[] = { "flower", "flow", "flight" };
        String strs2[] = { "dog", "racecar", "car" };
        String strs3[] = { "ai", "a" };

        System.out.println(longestCommonPrefix(strs1));
        System.out.println(longestCommonPrefix(strs2));
        System.out.println(longestCommonPrefix(strs3));
    }
}
