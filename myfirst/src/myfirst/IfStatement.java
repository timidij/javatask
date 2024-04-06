
package myfirst;

import java.util.Scanner;

public class IfStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int score1, score2;
		System.out.println("Enter the first test score: ");
		score1 = in.nextInt();
		System.out.println("Enter the second test score: ");
		score2 = in.nextInt();
		
		if(score1>=90 && score2>= 90) {
			System.out.println("Qualified to be a manager");
		}
		//for the supervisors must score above 90 in any of the test 
		else if (score1>=90 || score2 >= 90) {
			System.out.println("Qualified to be a supervisor");
			
		}
		//clerical worker must score moderately well on one test 
		//70 or above, but not badly below 50 on either of the test
		else if ((score1>=70 || score2 >=70) && !(score1<50 || score2<50)) {
			System.out.println("Qualified to be a clerk");
		}
		
	}

}
