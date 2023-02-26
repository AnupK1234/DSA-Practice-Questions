// Key Pair : Link - https://practice.geeksforgeeks.org/problems/key-pair5616/0
//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;

public class keyPair {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int x = Integer.parseInt(inputLine[1]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            boolean ans = new Solution().hasArrayTwoCandidates(arr, n, x);
            System.out.println(ans ? "Yes" : "No");
        }
    }
}

// } Driver Code Ends


//User function Template for Java


class Solution {
    boolean hasArrayTwoCandidates(int arr[], int n, int x) {
        // code here
        int leftPointer = 0, rightPointer = n-1; // initializing two pointers one at start and other at end of array
        
        Arrays.sort(arr); // sorting array in ascending order
        while(leftPointer < rightPointer)
        {
            if(arr[leftPointer] + arr[rightPointer] == x) return true; // if sum found
            
            else if(arr[leftPointer] + arr[rightPointer] < x) leftPointer++; // if sum if smaller then to increase the sum increament left pointer as sum will be greater with increasing values of array
            
            else rightPointer--; // if sum is greater than required then to reduce it decrease the right pointer by 1
        }
        
        return false; // if sum not found
    }
}