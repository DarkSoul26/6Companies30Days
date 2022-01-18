// Ugly numbers are numbers whose only prime factors are 2, 3 or 5. The sequence 1, 2, 3, 4, 5, 6, 8, 9, 10, 12, 15, … shows the first 11 ugly numbers. By convention, 1 is included. Write a program to find Nth Ugly Number.

// Example 1:

// Input:
// N = 10
// Output: 12
// Explanation: 10th ugly number is 12.
// Example 2:

// Input:
// N = 4
// Output: 4
// Explanation: 4th ugly number is 4.
// Your Task:
// You don't need to read input or print anything. Your task is to complete the function getNthUglyNo() which takes an integer n as parameters and returns an integer denoting the answer.

// Expected Time Complexity: O(N)
// Expected Auxiliary Space: O(N)

// Constraints:
// 1 ≤ N ≤ 104

// { Driver Code Starts
    import java.io.*;
    import java.util.*;
    
    class GFG {
        public static void main(String[] args) throws IOException {
            BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
            int t =
                Integer.parseInt(br.readLine().trim()); // Inputting the testcases
            while (t-- > 0) {
                int n = Integer.parseInt(br.readLine().trim());
    
                System.out.println(new Solution().getNthUglyNo(n));
            }
        }
    }// } Driver Code Ends
    
    
    
    class Solution {
        /* Function to get the nth ugly number*/
        // boolean isPrime(int n){
        //     if (n <= 5) {  
        //       return false;  
        //     }
        //     for(int i=2;i<=Math.sqrt(n);i++){
        //         if(n%i==0)
        //             return false;
        //     }
        //     return true;
        // }
        long getNthUglyNo(int n) {
            long dp[] = new long[n+1];
            dp[1] = (long)1;
            // int count = 0;
            // int finalAns = 1;
            int i = 1, j=1, k=1;
            // int min,a1 = 2, a2 = 3, a3 = 5;
            for(int m = 2;m<=n;m++){
                long a1 = 2*dp[i];
                long a2 = 3*dp[j];
                long a3 = 5*dp[k];
                dp[m] = Math.min(a1,Math.min(a2,a3));
               
                if(dp[m] == a1)   
                    i++;
                if(dp[m] == a2)
                    j++;
                if(dp[m] == a3)
                    k++;
            }
            return dp[n];
        }
    }