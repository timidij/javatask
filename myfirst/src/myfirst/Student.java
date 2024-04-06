package myfirst;

public class Student {

	private String name;
	private int test1;
	private int test2;
	private int test3;
	//constructor method
	public Student() {
		//initializing the a new student
		name= "";
		test1= 0;
		test2 = 0;
		test3 = 0;
	}
	//other methods 
	public void setName(String nm) {
		//set a students name
		name = nm;
	}
	public String getName() {
		//get a student name
		return name;
	}
	public void setScore(int i, int score) {
		if (i==1) {
			test1= score;
		}else if(i == 2) {
			test2 = score;
		}else {
			test3 = score;
		}
	}
	
	public int getAverage() {
		//compute and return the avverage 
		int average;
		average = (int)Math.round((test1 + test2 + test3)/3.0);
		return average;
	}
	public int getHighScore() {
		int highScore;
		//Determine and return the highest score
		highScore = test1;
		if(test2>highScore) {
			highScore = test2;
		}
		if(test3 > highScore) {
			highScore = test3;
		}
		
		return highScore;
	}
	
	public String toString() {
		//construct and return the string representation of the student
		String str;
		str = "name: " +name+ "\n"+"Test1: "+test1 +"\n" +"Test2: "+test2 +"\n"+"Test3: "+test3 +"\n";
		return str;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		System.out.print(s1.getAverage());
	}

}
