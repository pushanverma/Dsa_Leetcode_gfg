//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

// Position this line where user code will be pasted.

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();

            Solution ob = new Solution();
            ob.printDiamond(n);
        
System.out.println("~");
}
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {

    void printDiamond(int n) {
        // Your code here  
        
        // total number of line 
        
        
       	int tnol =2*n;
        int cnol=1;
        
        int stars =1;
        int spaces=n-1;
        
        int mid =tnol/2;
        
        
        
        while(cnol<=tnol){
            //print spaces 
            for(int i=1;i<=spaces;i++){
                System.out.print(" ");
            }
            
            
            //print stars 
            for(int i=1;i<=stars;i++){
                System.out.print("* ");
            }
            
            //prepare for the next line 
            if(cnol<mid){
                stars++;
                spaces--;
            }
            else if(cnol ==mid ){
                stars =n;
                spaces=0;
            }
            else {
                stars--;
                spaces++;
            }
            cnol++;
            System.out.println();
	}
        
        
        
        
        
    }
}
