Link to the question: https://practice.geeksforgeeks.org/problems/print-anagrams-together/1/


// { Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
    public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        
	    int t=Integer.parseInt(br.readLine().trim());
	    while(t > 0)
	    {
	        int n= Integer.parseInt(br.readLine().trim());
	        String x = br.readLine().trim();
	        String string_list[] = x.split(" ",n);
	        
	        Solution ob = new  Solution();
	        
	        List <List<String>> ans = ob.Anagrams(string_list);
	        
	        Collections.sort(ans, new Comparator<List<String>>(){
            public int compare(List<String> l1, List<String> l2) {
                    String s1 =  l1.get(0);
                    String s2 = l2.get(0);
                    
                    return s1.compareTo(s2);
                }
            });
	        
	        for(int i=0;i<ans.size();i++)
	        {
	            for(int j=0;j<ans.get(i).size();j++)
	            {
	                System.out.print(ans.get(i).get(j) + " ");
	            }
	            System.out.println();
	        }
	       
	       
            t--;
	    }
	}
    
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    public List<List<String>> Anagrams(String[] string_list) {
        // Code here
        Map<String, List<Integer>> map = new HashMap<>();
        for(int i=0;i<string_list.length;i++){
            char[] characters = string_list[i].toCharArray();
            Arrays.sort(characters);
            String new_str = Arrays.toString(characters);
            if(map.containsKey(new_str)){
                List<Integer> al = map.get(new_str);
                al.add(i);
                map.put(new_str,al);
            }
            else{
                List<Integer> al = new ArrayList<>();
                al.add(i);
                map.put(new_str,al);
            }
        }
        List<List<String>> final_list = new ArrayList<>();
        for(Map.Entry m: map.entrySet()){
            List<Integer> al = (List<Integer>)m.getValue();
            List<String> strings = new ArrayList<>();
            for(int i=0;i<al.size();i++){
                strings.add(string_list[al.get(i)]);
            }
            final_list.add(strings);
        }
        return final_list;
    }
}
