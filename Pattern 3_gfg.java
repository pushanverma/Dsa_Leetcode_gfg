//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Main {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            Solution obj = new Solution();
            obj.printTriangle(n);
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


class Solution {

    void printTriangle(int n) {
        // code here
        int tnol =n;
		int cnol =1;

		int stars=1;



		while(cnol<=tnol) {
			//print pattern
			
			int num =1;

			for(int i =1; i<=stars; i++) {
				System.out.print(num+" ");
				num++;
			}


			// prepare for next line
			stars++;
			cnol++;
			System.out.println();

		}
        
    }
}
