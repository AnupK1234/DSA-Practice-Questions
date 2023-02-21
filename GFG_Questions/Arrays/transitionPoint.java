// Find Transition Point : Link - https://practice.geeksforgeeks.org/problems/find-transition-point-1587115620/1
//{ Driver Code Starts
    import java.util.*;

    class transitionPoint {
        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            int T = sc.nextInt();
            while (T > 0) {
                int n = sc.nextInt();
                int arr[] = new int[n];
                for (int i = 0; i < n; i++) {
                    arr[i] = sc.nextInt();
                }
                GfG obj = new GfG();
                System.out.println(obj.transitionPoint(arr, n));
                T--;
            }
        }
    }
    // } Driver Code Ends
    
    
    class GfG {
        int transitionPoint(int arr[], int n) {
            // code here
            if(n == 1) // if there is only one element in array
            {
                if(arr[0] != 1) return -1; // if that single element is zero then return -1;
                else return 0; // else if that single element is one return 0
            }
            
            else if(arr[0] == 1) return 0; // if first element is one which means there are not zero in the array as it a sorted array
            
            else if(arr[n-1] == 0) return -1; // if last element is zero which means there is no one the array
            
            int low = 0, high = n-1, mid=0;
            // using binary search
            while(low <= high)
            {
                mid = (low + high)/2;
                
                if(arr[mid] == 1)
                {
                    if(mid == 0 || arr[mid-1] == 0) return mid;
                    high = mid-1;
                }
                else
                {
                    low = mid + 1;
                }
            }
            return -1;
            
        }
    }