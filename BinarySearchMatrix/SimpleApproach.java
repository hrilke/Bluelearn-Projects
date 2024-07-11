public class SimpleApproach implements Solution{
    @Override
    public boolean searchInMatrix(int[][] matrix, int target) {

        for (int i =0; i < matrix.length; i++) {
            if (binarySearch1D(matrix[i],target)) return true;
        }
        return false;
    }
    public static boolean binarySearch1D(int[] arr, int target) {
        int l = 0;
        int r = arr.length - 1;

        while (l <= r) {
            int mid = l + (r-l)/2;
            if (arr[mid] == target) return true;
            else if (arr[mid] < target) l = mid + 1;
            else r = mid - 1;
        }
        return false;
    }
}
