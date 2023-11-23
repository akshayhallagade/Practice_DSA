/*
 * ............BINARY SEARCH.................
 * 
 * Target : K
 * Search Space : Entire Array
 * 
 * case 1:
 * arr[mid]==k : return mid
 * [------mid------]
 * 
 * case 2:
 * arr[mid]<k : Search K in Right. { left=mid+1 }
 * [ mid------]
 * 
 * case 3:
 * arr[mid]>k : Search K in Left. { Right=mid-1 }
 * [------mid ]
 */

import java.util.*;

public class Mindex {
    public static int search(int[] arr, int k) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            mid = (left + right) / 2; // Doing half to find mid.
            if (arr[mid] == k)
                return mid; // case 1 condition.
            else if (arr[mid] < k)
                left = mid + 1; // case 2 condition.
            else
                right = mid - 1; // case 3 condition.
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 3, 6, 9, 12, 19, 20, 23, 25, 27 };
        int k = 12;
        System.out.print(search(arr, k));
    }
}