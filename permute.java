
/*Given a string S. The task is to print all unique permutations of the given string that may contain dulplicates in lexicographically sorted order. 

Example 1:

Input: ABC
Output:
ABC ACB BAC BCA CAB CBA
Explanation:
Given string ABC has permutations in 6 
forms as ABC, ACB, BAC, BCA, CAB and CBA .
Example 2:

Input: ABSG
Output:
ABGS ABSG AGBS AGSB ASBG ASGB BAGS 
BASG BGAS BGSA BSAG BSGA GABS GASB 
GBAS GBSA GSAB GSBA SABG SAGB SBAG 
SBGA SGAB SGBA
Explanation:
Given string ABSG has 24 permutations.
Your Task:  
You don't need to read input or print anything. Your task is to complete the function find_permutation() which takes the string S as input parameter and returns a vector of string in lexicographical order.

Expected Time Complexity: O(n! * n)
Expected Space Complexity: O(n! * n)

Constraints:
1 <= length of string <= 5

 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class permute {
    public static ArrayList<String> find_permute(String S) {
        ArrayList<String> result = new ArrayList<>();
        char[] chars = S.toCharArray();
        ArrayList<Character> charList = new ArrayList<>();
        for (char c : chars) {
            charList.add(c);
        }
        Collections.sort(charList);
        backtrack(charList, new boolean[charList.size()], new StringBuilder(), result);
        return result;
    }

    private static void backtrack(ArrayList<Character> charList, boolean[] used, StringBuilder current,
            ArrayList<String> result) {
        if (current.length() == charList.size()) {
            result.add(current.toString());
            return;
        }

        for (int i = 0; i < charList.size(); i++) {
            if (used[i] || (i > 0 && charList.get(i) == charList.get(i - 1) && !used[i - 1])) {
                continue;
            }
            used[i] = true;
            current.append(charList.get(i));
            backtrack(charList, used, current, result);
            current.deleteCharAt(current.length() - 1);
            used[i] = false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String input = scanner.nextLine();

        ArrayList<String> permutations = find_permute(input);
        System.out.println("Permute: " + permutations);

        scanner.close();
    }
}
