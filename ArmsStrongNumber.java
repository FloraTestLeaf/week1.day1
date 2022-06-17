package week1.day1;

public class ArmsStrongNumber {
	
	
	/*
	 * Goal: To find whether a number is an Armstrong number or not
	 * 
	 * inputs: 153
	 * output: (1*1*1)+(5*5*5)+(3*3*3) = 153
	 * 
	 * Shortcuts:
	 * 1) Print : type: syso, followed by: ctrl + space + enter
	 * 2) To create a While loop, type 'while' followed by: ctrl + space + down arrow + enter
	 * 3) To create an 'if' condition: type 'if', followed by ctrl + space +down arrow + enter
	 *   
	 * What are my learnings from this code?
	 * 1)
	 * 2)
	 * 3) 
	 * 
	 */

	// Declare your input


public static void main(String[] args) {
	int n=153;
	int cal = 0,org,rem;
	org=n;
	while (n>0) {
		rem=n%10;
		n=n/10;
		cal=cal+(rem*rem*rem);
		
	}
	System.out.println(org+"=" +cal);
	if(cal==org) {
		System.out.println("armstrong");
	}else {
		System.out.println("not armstrong");
	}
	
	
	
	/*
	 * int c=0; int r; int original=153;
	 * 
	 * 
	 * while (original>0) { r=original%10; original=original/10; c=c+(r*r*r); }
	 * if(c==original) { System.out.println("armstrong number"); }else {
	 * System.out.println("not armstrong number"); }
	 */
	
}

		


		

			// Declare 3 more int variables as calculated, remainder, original (Tip:Initialize calculated alone)

		
	
		

			// Assign input into variable original 

		


		

			// Use loop to calculate: use while loop to set condition until the number greater than 0

		

			// Within loop: get the remainder when done by 10 (Tip: Use Mod operator)

			

			// Within loop: get the quotient when done by 10 (Tip: Assign the result to input)

			

			// Within loop: Add calculated with the cube of remainder & assign it to calculated

			
				

			// Check whether calculated and original are same

		

			//When it matches print it as Armstrong number

}
		



		

		

		

		


