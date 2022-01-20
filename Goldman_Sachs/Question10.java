// Given an array of N positive integers, print k largest elements from the array. 

// Example 1:

// Input:
// N = 5, k = 2
// arr[] = {12,5,787,1,23}
// Output: 787 23
// Explanation: First largest element in
// the array is 787 and the second largest
// is 23.
// Example 2:

// Input:
// N = 7, k = 3
// arr[] = {1,23,12,9,30,2,50}
// Output: 50 30 23
// Explanation: Three Largest element in
// the array are 50, 30 and 23.
// Your Task:
// Complete the function kLargest() that takes the array, N and K as input parameters and returns a list of k largest element in descending order. 

// Expected Time Complexity: O(N log K)
// Expected Auxiliary Space: O(K)

// Constraints:
// 1 ≤ N ≤ 104
// K ≤ N
// 1 ≤ array[i] ≤ 105

// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;


class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t > 0)
        {
            int n = sc.nextInt();
            int k = sc.nextInt();
            
            int arr[] = new int[n];
            for(int i = 0; i<n; ++i)
                arr[i] = sc.nextInt();
            Solution ob = new Solution();
            ArrayList<Integer> list = ob.kLargest(arr, n, k);
            for(int i = 0; i<list.size(); i++)
                System.out.print(list.get(i) + " ");
            System.out.println();
            t--;
        }
    }
}


// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to return k largest elements from an array.
    public static ArrayList<Integer> kLargest(int arr[], int n, int k)
    {
        // code here 
        Arrays.sort(arr);
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=n-1;i>=n-k;i--)
            al.add(arr[i]);
        return al;
    }
}