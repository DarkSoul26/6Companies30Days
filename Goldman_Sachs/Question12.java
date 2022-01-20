// Find total number of Squares in a N*N cheesboard.

 

// Example 1:

// Input:
// N = 1
// Output:
// 1
// Explanation:
// A 1*1 chessboard has only 1 square.
// Example 2:

// Input:
// N = 2
// Output:
// 5
// Explanation:
// A 2*2 chessboard has 5 squares.
// 4 1*1 squares and a 2*2 square.
 

// Your Task:
// You don't need to read input or print anything. Your task is to complete the function squaresInChessBoard() which takes an Integer N as input and returns the number of squares in a N*N chessboard.

 

// Expected Time Complexity: O(1)
// Expected Auxiliary Space: O(1)

// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            Long N = Long.parseLong(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.squaresInChessBoard(N));
        }
    }
}// } Driver Code Ends


//User function Template for Java

//Solution 1:

class Solution {
    static Long squaresInChessBoard(Long N) {
        // code here
        Long sum = 0L;
        for(Long i=1L;i<=N;i++)
            sum+=i*i;
        return sum;
    }
};

// Solution 2:

class Solution {
    static Long squaresInChessBoard(Long N) {
        // code here
        return (N*(N+1)*(2*N+1))/6;
    }
};