// A top secret message containing letters from A-Z is being encoded to numbers using the following mapping:

// 'A' -> 1
// 'B' -> 2
// ...
// 'Z' -> 26
// You are an FBI agent. You have to determine the total number of ways that message can be decoded, as the answer can be large return the answer modulo 109 + 7.
// Note: An empty digit sequence is considered to have one decoding. It may be assumed that the input contains valid digits from 0 to 9 and If there are leading 0’s, extra trailing 0’s and two or more consecutive 0’s then it is an invalid string.

// Example 1:

// Input: str = "123"
// Output: 3
// Explanation: "123" can be decoded as "ABC"(123),
// "LC"(12 3) and "AW"(1 23).
// Example 2:

// Input: str = "27"
// Output: 1
// Explanation: "27" can be decoded as "BG".
 

// Your Task:
// You don't need to read or print anything. Your task is to complete the function CountWays() which takes the string as str as input parameter and returns the total number of ways the string can be decoded modulo 109 + 7.
 

// Expected Time Complexity: O(n)
// Expected Space Complexity: O(n) where n  = |str|

// Constraints:
// 1 <= |str| <= 104

// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String str = br.readLine().trim();
            Solution ob = new Solution();
            int ans = ob.CountWays(str);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int CountWays(String s)
    {
        int m = 1000000007;
        int len = s.length();
        if(len==0 || s.charAt(0)=='0') return 0;
        if(len == 1)    return 1;
        long count1 = 1, count2 = 1;
        for(int i=1;i<len;i++){
            int a = s.charAt(i)-'0';
            int b = s.charAt(i-1)-'0';
            b*=10;
            b+=a;
            long count = 0;
            if(a>0) count+=count2%m;
            if(b>=10 && b<=26)  count+=count1%m;
            count1 = count2%m;
            count2 = count%m;
        }
        return (int)count2;
    }
}