// Given an array of integers and a number k, write a function that returns true if given array can be divided into pairs such that sum of every pair is divisible by k.
 

// Example 1 :

// Input : arr = [9, 5, 7, 3], k = 6
// Output: True
// Explanation: {(9, 3), (5, 7)} is a 
// possible solution. 9 + 3 = 12 is divisible
// by 6 and 7 + 5 = 12 is also divisible by 6.

// Example 2:

// Input : arr = [2, 4, 1, 3], k = 4
// Output: False
// Explanation: There is no possible solution.
 

// Your Task:
// You don't need to read or print anything. Your task is to complete the function canPair() which takes array and k as input parameter and returns true if array can be divided into pairs such that sum of every pair is divisible by k otherwise returns false.
 

// Expected Time Complexity: O(n)
// Expected Space Complexity : O(n)
 

// Constraints:
// 1 <= length of array <= 100000
// 1 <= elements of array <= 100000
// 1 <= k <= 100000

// { Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String s1 = br.readLine().trim();
            String[] S1 = s1.split(" ");
            int n = Integer.parseInt(S1[0]);
            int k = Integer.parseInt(S1[1]);
            String s2 = br.readLine().trim();
            String[] S2 = s2.split(" ");
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = Integer.parseInt(S2[i]);
            }
            Solution ob = new Solution();
            boolean ans = ob.canPair(nums, k);
            if (ans)
                System.out.println("True");
            else
                System.out.println("False");
        }
    }
}
// } Driver Code Ends


// User function Template for Java
class Solution {
    public boolean canPair(int[] nums, int k) {
        // Code here
        int[] rem = new int[k];
        for(int ele : nums)
            rem[ele%k]++;
        
        if(rem[0] % 2 != 0)
            return false;
        int i=1,j = k-1;
        while(i<j) {
            if(rem[i] != rem[j])
                return false;
            i++;
            j--;
        }
        if(i==j && rem[i]%2 == 1)
            return false;
        return true;
    }
}