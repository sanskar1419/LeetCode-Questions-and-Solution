package LongestCommonPrefix;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0)
            return "";

        if (strs.length == 1)
            return strs[0];

        int minStringIndex = Integer.MAX_VALUE;
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].length() < minStringIndex) {
                minStringIndex = i;
            }
        }

        int i = 0;
        while (i < strs[minStringIndex].length()) {
            char ch = strs[minStringIndex].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].charAt(i) != ch) {
                    return strs[minStringIndex].substring(0, i);
                }
            }
            i++;
        }

        return strs[minStringIndex];
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
