package Mypac;

public class Patterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		triangle();
		System.out.println("-------------");
		triangle1();
		System.out.println("-------------");
		triangle2();
		System.out.println("-------------");
		triangle3();
		System.out.println("-------------");
		triangle4();
		System.out.println("-------------");
		triangle5();
	}
	
	
	public static void triangle() {
		for (int i = 0; i <4; i++) {
			for (int j = 0; j <4; j++) {
				/*
   *
  **
 ***
****
				 */
				if (i+j>=3)System.out.print("*");
				else System.out.print(" ");
			}
			System.out.println();	
		}
	}

	public static void triangle1() {
		for (int i = 0; i <4; i++) {
			for (int j = 0; j <4; j++) {
				/*
*   
**  
*** 
****
				 */
				if (i-j>=0)System.out.print("*");
				else System.out.print(" ");
			}
			System.out.println();	
		}
	}

	public static void triangle2() {
		for (int i = 0; i <4; i++) {
			for (int j = 0; j <4; j++) {
				/*
****
 ***
  **
   *
				 */
				if (i-j<=0)System.out.print("*");
				else System.out.print(" ");
			}
			System.out.println();	
		}
	}

	public static void triangle3() {
		for (int i = 0; i <=4; i++) {
			for (int j = 0; j <=4; j++) {
				/*
*****
**** 
***  
**   
* 
				 */
				if (i+j<=4)System.out.print("*");
				else System.out.print(" ");
			}
			System.out.println();	
		}
	}


	

	public static void triangle4() {
		for (int i = 0; i <7; i++) {
			for (int j = 0; j <7; j++) {
				/*
   *   
  ***  
 ***** 
*******
				 */
				if (i+j>=6&&i>=j)System.out.print("*");
				else System.out.print(" ");
			}
			System.out.println();	
		}
	}


	public static void triangle5() {
		for (int i = 0; i <7; i++) {
			for (int j = 0; j <7; j++) {
				/*
*******
*******
*******
*** ***
**   **
*     *
     	 */
				if (i+j>=6&&i>=j)System.out.print(" ");
				else System.out.print("*");
			}
			System.out.println();	
		}
	}

	
}
