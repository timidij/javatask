package myfirst;

public class Students {
	private String name;
	private int test1;
	private int test2;
	private int test3;
	
	public Students() {
		name = "";
		test1 = 0;
		test2 = 0;
		test3 = 0;
	}
	public Students(String nm, int t1, int t2, int t3) {
		name = nm;
		test1 = t1;
		test2 = t2;
		test3 = t3;
	}
	public void setName(String Na) {
		name = Na;
	}
	public String getName() {
		return name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("helllo");
		Students s1 = new Students("joy", 5,34,43);
		System.out.println(s1.getName());
		s1.setName("James");
		System.out.println(s1.getName());
		Students s2 = new Students();
		s2.setName("Jude");
		System.out.println(s2.getName());
	}

}
