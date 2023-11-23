public class binary_search1_1 {

    /*
     * Question : Given a sorted array with distinct elements. We need to search for
     * index of an element K.
     */

    /*
     * ........................................
     * case 1 : A[mid]==K
     * ====> return K
     * 
     * ........................................
     * case 2 : A[mid]>K
     * ===> right=mid-1 // move left
     * 
     * ........................................
     * case 3 : A[mid]<k
     * ===> left=mid+1 //move right
     * 
     * ........................................
     * Otherwise, return -1
     */
    public static int search(int[] arr, int k) {

        int left = 0;
        int right = arr.length - 1;
        int mid = 0;
        while (left <= right) {
            mid = (left + right) / 2;
            if (arr[mid] == k) {
                // return output.
                return k;
            } else if (arr[mid] > k) {
                // go to left
                right = mid - 1;
            } else {
                // go to right
                left = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 6, 9, 12, 14, 19, 20, 23, 25, 27 };
        int k = 6;
        System.out.print(search(arr, k));
    }
}
