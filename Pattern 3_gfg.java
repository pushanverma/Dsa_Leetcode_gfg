
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
