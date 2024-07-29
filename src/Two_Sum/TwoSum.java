package Two_Sum;

import java.util.Arrays;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int tempArr[] = new int[n];

        // n operation will be done here
        for (int i = 0; i < n; i++) {
            tempArr[i] = nums[i];
        }

        // nlog(n) operation
        Arrays.sort(tempArr);

        int start = 0;
        int end = n - 1;
        int firstElement = 0, secondElement = 0;

        // n operation will be done here
        while (start < end) {
            if (tempArr[start] + tempArr[end] < target) {
                start++;
            } else if (tempArr[start] + tempArr[end] > target) {
                end--;
            } else {
                firstElement = tempArr[start];
                secondElement = tempArr[end];
                break;
            }
        }

        // System.out.println(firstElement + " " + secondElement);

        int result[] = new int[2];
        // n operation will be done here
        for (int i = 0; i < n; i++) {
            if (nums[i] == firstElement) {
                result[0] = i;
                nums[i] = Integer.MIN_VALUE;
                break;
            }
        }

        // n operation will be done here
        for (int i = 0; i < n; i++) {
            if (nums[i] == secondElement) {
                result[1] = i;
                nums[i] = Integer.MIN_VALUE;
                break;
            }
        }

        return result;
    }

    public static void main(String args[]) {

    }

}
