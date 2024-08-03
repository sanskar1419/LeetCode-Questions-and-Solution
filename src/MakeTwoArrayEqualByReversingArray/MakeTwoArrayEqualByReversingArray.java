package MakeTwoArrayEqualByReversingArray;

import java.util.Arrays;

public class MakeTwoArrayEqualByReversingArray {
    /* This is not a correct way */
    public boolean canBeEqual(int[] target, int[] arr) {
        if (arr.length == 0)
            return true;

        Arrays.sort(arr);
        Arrays.sort(target);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != target[i])
                return false;

        }

        return true;
    }
}
