public class binary_search1_4 {

    /*
     * Question : Given a sorted array of N elements. Find the first occurence of
     * given element k.
     * 
     */

    /*
     * ........................................
     * case 1 : A[mid]==K
     * ====> ans=mid; //update
     * ====> right=mid-1; //go to left
     * 
     * ........................................
     * case 2 : A[mid]<K
     * ====> left=mid+1; //go to right.
     * 
     * ........................................
     * case 3 : A[mid]>k
     * ====> right=mid-1 //move left
     * 
     * ........................................
     * Otherwise, return ans
     */

    public static int search(int[] arr, int k) {
        int left = 0;
        int right = arr.length - 1;
        int mid = 0;
        int ans = 0; // answer
        while (left <= right) {
            mid = (left + right) / 2;
            if (arr[mid] == k) {
                // update and go to left.
                ans = mid;
                right = mid - 1;
            } else if (arr[mid] < k) {
                // go to right
                left = mid + 1;
            } else {
                // move left
                right = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { -5, -5, 0, 1, 1, 5, 5, 5, 5, 5, 5, 8, 10, 10, 15, 15 };
        int k = 10;
        System.out.print(search(arr, k));
    }
}
