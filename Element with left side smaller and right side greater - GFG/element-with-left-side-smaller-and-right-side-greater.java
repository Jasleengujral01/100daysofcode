//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-- > 0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int[] a = new int[n];
            String[] inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(inputLine[i]);
            }
            
            Compute obj = new Compute();
            System.out.println(obj.findElement(a, n));
            
        }
	}
}
// } Driver Code Ends

class Compute {
    public int findElement(int arr[], int n) {
        int[] maxLeft = new int[n];
        int[] minRight = new int[n];

        // Fill the maxLeft array
        maxLeft[0] = arr[0];
        for (int i = 1; i < n; i++) {
            maxLeft[i] = Math.max(maxLeft[i - 1], arr[i]);
        }

        // Fill the minRight array
        minRight[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            minRight[i] = Math.min(minRight[i + 1], arr[i]);
        }

        // Check for the first element that satisfies the condition
        for (int i = 1; i < n - 1; i++) {
            if (arr[i] >= maxLeft[i - 1] && arr[i] <= minRight[i + 1]) {
                return arr[i];
            }
        }

        // If no element satisfies the condition, return -1
        return -1;
    }
}