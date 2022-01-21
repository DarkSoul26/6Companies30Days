// An encoded string (s) is given, the task is to decode it. The pattern in which the strings were encoded were as follows
// original string: abbbababbbababbbab 
// encoded string : 3[a3[b]1[ab]]

// Example 1:

// Input: s = 1[b]
// Output: b
// Explaination: 'b' is present only one time.
// Example 2:

// Input: s = 3[b2[ca]]
// Output: bcacabcacabcaca
// Explaination: 2[ca] means 'ca' is repeated 
// twice which is 'caca' which concatenated with 
// 'b' becomes 'bcaca'. This string repeated 
// thrice becomes the output.
// Your Task:
// You do not need to read input or print annything. Your task is to complete the function decodedString() which takes s as input parameter and returns the decoded string.

// Expected Time Complexity: O(|s|)
// Expected Auxiliary Space: O(|s|)

// Constraints:
// 1 ≤ |s| ≤ 30

// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String s = in.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.decodedString(s));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution{
    static String decodedString(String s){
        if(s == "")return "";
        String sol = new String();
        int repeat = 1;
        for(int i =0;i<s.length();++i)
        {
            if(Character.isDigit(s.charAt(i)))
            {
                String temp = "";
                int k = i;
                while(Character.isDigit(s.charAt(k)))
                {
                    temp+=s.charAt(k);
                    k++;
                }
                repeat = Integer.parseInt(temp);
                i = k-1;
            }
            else if(s.charAt(i) =='[')
            {
                Stack<Character> st = new Stack<>();
                st.push('[');
                int k = i+1;
                while(!st.isEmpty())
                {
                    if(s.charAt(k) == ']')
                    {
                        st.pop();
                        k++;
                    }
                    else if(s.charAt(k) =='[')
                    {
                        st.push('[');
                        k++;
                    }
                    else k++;
                }
                String inside_bracket = decodedString(s.substring(i+1,k-1));
                i = k-1;
                for(int j =0;j<repeat;++j)
                {
                    sol+=inside_bracket;
                }
            }
            
            else
            {
                sol+=s.charAt(i);
            }
        }
        return sol;
    }
}