public class BinarySearch2D implements Solution{
    @Override
    public boolean searchInMatrix(int[][] matrix, int target) {
        int i = 0;
        int j = matrix.length - 1;

        while (i <= matrix.length && j >= 0) {
            if (matrix[i][j] == target) return true;
            else if (matrix[i][j] > target) j--;
            else i++;
        }
        return false;
    }
}
