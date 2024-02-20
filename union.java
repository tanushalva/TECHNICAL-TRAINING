
/*
 * Given two arrays a[] and b[] of size n and m respectively. The task is to find the number of elements in the union between these two arrays.

The Union of the two arrays can be defined as the set containing distinct elements from both arrays. If there are repetitions, then only one occurrence of an element should be printed in the union.

Note : Elements are not necessarily distinct.

Example 1:

Input:
5 3
1 2 3 4 5
1 2 3
Output: 
5
Explanation: 
1, 2, 3, 4 and 5 are the
elements which comes in the union set
of both arrays. So count is 5.
Example 2:

Input:
6 2 
85 25 1 32 54 6
85 2 
Output: 
7
Explanation: 
85, 25, 1, 32, 54, 6, and
2 are the elements which comes in the
union set of both arrays. So count is 7.
Your Task:
Complete the doUnion function that takes a, n, b, m as parameters and returns the count of union elements of the two arrays. The printing is done by the driver code.

Constraints:
1 ≤ n, m ≤ 105
0 ≤ a[i], b[i] < 105

Expected Time Complexity: O(n+m)
Expected Auxilliary Space: O(n+m)


 */
import java.util.HashSet;
import java.util.Scanner;

public class union {
    public static int doUnion(int[] a, int n, int[] b, int m) {
        HashSet<Integer> unionSet = new HashSet<>();
        for (int i = 0; i < n; i++) {
            unionSet.add(a[i]);
        }
        for (int i = 0; i < m; i++) {
            unionSet.add(b[i]);
        }
        return unionSet.size();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of array a: ");
        int n = scanner.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the elements of array a:");
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        System.out.print("Enter the size of array b: ");
        int m = scanner.nextInt();
        int[] b = new int[m];
        System.out.println("Enter the elements of array b:");
        for (int i = 0; i < m; i++) {
            b[i] = scanner.nextInt();
        }
        int unionCount = doUnion(a, n, b, m);
        System.out.println("The count of elements in the union is: " + unionCount);
        scanner.close();
    }
}
