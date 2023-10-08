package Assignment1;

public class student {
	public int rollno,age;
	public void display1() {
		System.out.println("Welcome to the group");
	}
	public void display2() {
		System.out.println("automation is very easy");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      student nitesh=new student();
      nitesh.age=18;
      nitesh.rollno=3;
      nitesh.display1();
      nitesh.display2();
      System.out.println(nitesh.age);
      System.out.println(nitesh.rollno);
	}

}
