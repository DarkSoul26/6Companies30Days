// Given a string, Your task is to  complete the function encode that returns the run length encoded string for the given string.
// eg if the input string is “wwwwaaadexxxxxx”, then the function should return “w4a3d1e1x6″.
// You are required to complete the function encode that takes only one argument the string which is to be encoded and returns the encoded string.

// Example 1:

// Input:
// str = aaaabbbccc
// Output: a4b3c3
// Explanation: a repeated 4 times
// consecutively b 3 times, c also 3
// times.
// Example 2:

// Input:
// str = abbbcdddd
// Output: a1b3c1d4
// Your Task:
// Complete the function encode() which takes a character array as a input parameter and returns the encoded string.

// Expected Time Complexity: O(N), N = length of given string.
// Expected Auxiliary Space: O(1)

// Constraints:
// 1<=length of str<=100

// { Driver Code Starts
    import java.util.*;
 
    class RLEncoding
    {
       public static void main(String[] args) 
       {
     
          Scanner sc = new Scanner(System.in);
        
          int T = sc.nextInt();
          sc.nextLine();
          while(T>0)
          {
              
            String str = sc.nextLine();
            
            GfG g = new GfG();
            System.out.println(g.encode(str));
            
          
            T--;
          }
       }
    }
    
    // } Driver Code Ends
    
    
    class GfG
     {
        String encode(String str)
        {
              StringBuilder sb = new StringBuilder();
              sb.append(str.charAt(0));
              int count = 1;
              for(int i=1;i<str.length();i++){
                    if(str.charAt(i)!=str.charAt(i-1)){
                        sb.append(count);
                        count = 1;
                        sb.append(str.charAt(i));
                    }
                    else{
                        count++;
                    }
              }
              sb.append(count);
              return sb.toString();
        }
        
     }