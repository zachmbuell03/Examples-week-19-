package Example;

public class findMissing {

    public static int findMissing(int[] arr) {
        int n = arr.length;

        // Sum of integers 1 through n+1
        int expectedSum = (n + 1) * (n + 2) / 2;

        // Sum of array elements
        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }

        // The difference is the missing number
        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        int[] arr = {3, 6, 5, 1, 4};  // Example array

        int missing = findMissing(arr);

        System.out.println("The missing number is: " + missing);
    }
}
