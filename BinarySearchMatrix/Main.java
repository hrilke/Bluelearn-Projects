public class Main {
    public static void main(String[] args) {

        int[][] matrix = {
                { 1, 4, 7, 11 },
                { 2, 5, 8, 12 },
                { 3, 6, 9, 16 },
                { 10, 13, 14, 17 }
        };
        int target = 6;

        Solution binarySearch1D = new SimpleApproach();
        System.out.println("Approach: Applying Binary search on each row" +
                            "\nTime Complexity : O(NlogN)");
        System.out.println("Answer : " +binarySearch1D.searchInMatrix(matrix, target));

        Solution binarySearch2D = new SimpleApproach();
        System.out.println("Approach: Applying Binary search on Matrix (Starting point:Top Right)" +
                             "\nTime Complexity : O(N+N)");
        System.out.println("Answer : " +binarySearch2D.searchInMatrix(matrix, target));

        Solution iterativeSearch = new IterativeSearch();
        System.out.println("Approach: Applying Binary search on each row" +
                             "\nTime Complexity : O(NxN)");
        System.out.println("Answer : " +iterativeSearch.searchInMatrix(matrix, target));
    }
}