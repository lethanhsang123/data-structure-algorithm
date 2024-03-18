package leetcode.arrays.median_of_two_sorted_arrays;

import java.util.Arrays;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // merge 2 arrays
        // calculate median
        return 0;
    }

    public void solution1(int[] arr1, int[] arr2) {
        int i = 0, j = 0, k = 0, n = arr1.length, m = arr2.length;
        int[] arr3 = new int[m + n];
        while (i < n && j < m) {
            if (arr1[i] <= arr2[j]) {
                arr3[k++] = arr1[i++];
            }
            else {
                arr3[k++] = arr2[j++];
            }
        }
        while (i < n) {
            arr3[k++] = arr1[i++];
        }
        while (j < m) {
            arr3[k++] = arr2[j++];
        }
        System.out.println("Merged Arrays: " + Arrays.toString(arr3));
        int mPos = k / 2;
        double median = k % 2 == 0 ? ((arr3[(mPos)] + arr3[mPos - 1]) / 2) : arr3[(mPos)];
        System.out.println("Median: " + median );
    }

    public void solution2(int[] arr1, int[] arr2) {
        int i = 0, j = 0, k = 0, n = arr1.length, m = arr2.length;
        int[] arr3 = new int[m + n];
        while (i < n && j < m) {
            if (arr1[i] <= arr2[j]) {
                arr3[k++] = arr1[i++];
            }
            else {
                arr3[k++] = arr2[j++];
            }
        }
        while (i < n) {
            arr3[k++] = arr1[i++];
        }
        while (j < m) {
            arr3[k++] = arr2[j++];
        }
        System.out.println("Result: " + arr3);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.solution1(new int[] {1, 2, 5, 9, 11}, new int[] {2, 3, 10, 12, 13});
    }
}
