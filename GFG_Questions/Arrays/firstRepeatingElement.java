// First Repeating Element : Link - https://practice.geeksforgeeks.org/problems/first-repeating-element4018/1
//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
class firstRepeatingElement {
    public static void main(String[] args) {

        // Taking input using class Scanner
        Scanner sc = new Scanner(System.in);

        // Taking total count of testcases
        int t = sc.nextInt();

        while (t-- > 0) {
            // taking total count of elements
            int n = sc.nextInt();

            // creating a new array of size n
            int arr[] = new int[n];

            // inserting elements to the array
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            Solution ob = new Solution();
            // calling firstRepeated method
            // and printing the result
            System.out.println(ob.firstRepeated(arr, n));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    // Function to return the position of the first repeating element.
    public static int firstRepeated(int[] arr, int n) {
        // Your code here
        HashMap<Integer, Integer> map = new HashMap<>(); // Declaring a Map to store the each element of array with its index
        int smallestIndex = -1; // smallestIndex to store the index of repeating element with smallest index  
        for(int i=0; i<n; i++) // traversing array
        {
            if(map.containsKey(arr[i]))
            {
                if(smallestIndex == -1) // if we encounter first repeating element then storing the index of that element
                {
                    smallestIndex = map.get(arr[i]);
                }
                
                else
                {
                    if(smallestIndex > map.get(arr[i])) // if another repeating element encountered then compare index of it with the previous repeating element 
                    {
                        smallestIndex = map.get(arr[i]);
                    }
                }
            }
            else
            {
                map.put(arr[i], i); // element encountered first time
            }
        }
        
        if(smallestIndex != -1) return smallestIndex+1; // returning index of repreating element with smalles index
        return -1; // incase no element if repeated
    }
}
