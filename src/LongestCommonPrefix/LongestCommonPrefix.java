/* 
 * Time Complexity : O(n*m*log(m))
 *    m = size of strs array
 *    n = length of zeroth index string  after sorting
 * Space Complexity : O(1)
 */

package LongestCommonPrefix;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        /*
         * if (strs.length == 0)
         * return "";
         * 
         * if (strs.length == 1)
         * return strs[0];
         * 
         * Arrays.sort(strs);
         * 
         * int i = 0;
         * while (i < strs[0].length()) {
         * char ch = strs[0].charAt(i);
         * for (int j = 1; j < strs.length; j++) {
         * if (strs[j].charAt(i) != ch) {
         * return strs[0].substring(0, i);
         * }
         * }
         * i++;
         * }
         * 
         * return strs[0];
         */
        if (strs == null || strs.length == 0)
            return "";
        String prefix = strs[0];
        for (String s : strs)
            while (!s.startsWith(prefix))
                prefix = prefix.substring(0, prefix.length() - 1);
        return prefix;

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
