
/*
Given an array of size N-1 such that it only contains distinct integers in the range of 1 to N. Find the missing element.
Example 1:
Input:
N = 5
A[] = {1,2,3,5}
Output: 4


Example 2:
Input:
N = 10
A[] = {6,1,2,8,3,4,7,10,5}
Output: 9

Your Task :
You don't need to read input or print anything. Complete the function MissingNumber() that takes array and N as input  parameters and returns the value of the missing number.

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)

Constraints:
1 ≤ N ≤ 106
1 ≤ A[i] ≤ 106


 */
import java.util.Scanner;

public class missingnum {
    public static int findMissingNumber(int[] array, int N) {
        int totalSum = (N * (N + 1)) / 2;
        int arraySum = 0;
        for (int num : array) {
            arraySum += num;
        }
        return totalSum - arraySum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array (N): ");
        int N = scanner.nextInt();
        int[] array = new int[N - 1];
        System.out.println("Enter the elements of the array ( range 1 to N):");
        for (int i = 0; i < N - 1; i++) {
            array[i] = scanner.nextInt();
        }
        int missingNumber = findMissingNumber(array, N);
        System.out.println("The missing number is: " + missingNumber);
        scanner.close();
    }
}
