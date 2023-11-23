public class binary_search1_2 {

    // .................Find 'Floor' of Given number K........................
    /*
     * Question : Given a sorted array.Find 'Floor' of a given number K.
     * Note : Floor =>{ greatest number <= K in arr[] }
     */

    /*
     * ........................................
     * case 1 : A[mid]==K
     * ====> return arr[mid];
     * 
     * ........................................
     * case 2 : A[mid]<K
     * ====> ans=A[mid] //update the 'ans'
     * ====> left=mid+1 //go to right
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
        int ans = Integer.MIN_VALUE; // answer
        while (left <= right) {
            mid = (left + right) / 2;
            if (arr[mid] == k) {
                // return mid
                return arr[mid];
            } else if (arr[mid] < k) {
                // Update the 'ans' and move right.
                ans = arr[mid];
                left = mid + 1;
            } else {
                // move left
                right = mid - 1;
            }
        }
        return ans;
    }
    // ...................Find 'Ceil' of Given number K....................
    /*
     * Question : Given a sorted array.Find 'Ceil' of a given number K.
     * Note : Ceil =>{ smallest number >= K in arr[] }
     */

    /*
     * ........................................
     * case 1 : A[mid]==K
     * ====> return arr[mid];
     * 
     * ........................................
     * case 2 : A[mid]<K
     * ====> left=mid+1 //go to right
     * 
     * ........................................
     * case 3 : A[mid]>k
     * ====> ans=A[mid] // update
     * ====> right=mid-1 //go to left
     * 
     * ........................................
     * Otherwise, return ans
     */

    // public static int search(int[] arr, int k) {
    // int left = 0;
    // int right = arr.length - 1;
    // int mid = 0;
    // int ans = Integer.MAX_VALUE; // answer
    // while (left <= right) {
    // mid = (left + right) / 2;
    // if (arr[mid] == k) {
    // // return mid
    // return arr[mid];
    // } else if (arr[mid] < k) {
    // // go to right
    // left = mid + 1;
    // } else { // arr[mid]>k
    // // update the 'ans' and go to left
    // ans = arr[mid];
    // right = mid - 1;
    // }
    // }
    // return ans;
    // }

    public static void main(String[] args) {
        int arr[] = { -5, 2, 3, 6, 9, 10, 11, 14, 18 };
        int k = 6;
        System.out.print(search(arr, k));
    }
}
