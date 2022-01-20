// Given a pattern containing only I's and D's. I for increasing and D for decreasing.
// Devise an algorithm to print the minimum number following that pattern.
// Digits from 1-9 and digits can't repeat.

 

// Example 1:

// Input:
// D
// Output:
// 21
// Explanation:
// D is meant for decreasing,
// So we choose the minimum number
// among 21,31,54,87,etc.
 

// Example 2:

// Input:
// IIDDD
// Output:
// 126543
// Explanation:
// Above example is self- explanatory,
// 1 < 2 < 6 > 5 > 4 > 3
//   I - I - D - D - D
 

 

// Your Task:

// You don't need to read input or print anything. Your task is to complete the function printMinNumberForPattern() which takes the string S and returns a string containing the minimum number following the valid pattern.

 

// Expected Time Complexity: O(N)
// Expected Auxiliary Space: O(1)

 

// Constraints:
// 1 ≤ Length of String ≤ 8

// { Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String S = read.readLine();
            Solution ob = new Solution();
            System.out.println(ob.printMinNumberForPattern(S));
        }
    }
}// } Driver Code Ends


//User function Template for Java
class Solution{
    static String printMinNumberForPattern(String s){
        Stack<Integer> st = new Stack<>();
        String ans = "";
        int num = 1;
        st.push(num);
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if( c == 'D' ){
                st.push( ++num );
            }else{
                while( st.size() > 0 ){
                    ans += st.pop();
                }
                st.push( ++num );
            }
        }
        while( st.size() > 0 ){
            ans += st.pop();
        }
            return ans;
        }
}
