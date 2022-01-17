// Given an array of positive numbers, the task is to find the number of possible contiguous subarrays having product less than a given number k.

// Example 1:

// Input : 
// n = 4, k = 10
// a[] = {1, 2, 3, 4}
// Output : 
// 7
// Explanation:
// The contiguous subarrays are {1}, {2}, {3}, {4} 
// {1, 2}, {1, 2, 3} and {2, 3} whose count is 7.
 

// Example 2:

// Input:
// n = 7 , k = 100
// a[] = {1, 9, 2, 8, 6, 4, 3}
// Output:
// 16
 

// Your Task:  
// You don't need to read input or print anything. Your task is to complete the function countSubArrayProductLessThanK() which takes the array a[], its size n and an integer k as inputs and returns the count of required subarrays.

 

// Expected Time Complexity: O(n)
// Expected Auxiliary Space: O(1)

 

// Constraints:
// 1<=n<=105
// 1<=k<=1015
// 1<=a[i]<=105

// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;


class GFG {
	public static void main(String[] args) throws IOException
	{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            StringTokenizer stt = new StringTokenizer(br.readLine());
            
            long n = Long.parseLong(stt.nextToken());
            long k = Long.parseLong(stt.nextToken());
            
            long a[] = new long[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            
            Solution obj = new Solution();
            System.out.println(obj.countSubArrayProductLessThanK(a, n, k));
            
        }
	}
}

// } Driver Code Ends


//User function Template for Java


class Solution {
    public int countSubArrayProductLessThanK(long a[], long n, long k)
    {
        int i = 0;
        int j = 0;
        long pdt = 1;
        int count = 0;
        while(i<=j && j<(int)n){
            pdt*=a[j];
            while(i<j && pdt>=k){
                pdt/=a[i];
                i++;
            }
            if(pdt<k){
                count+=j-i+1;
                
            }
            j++;
        }
        return count;
    }
}