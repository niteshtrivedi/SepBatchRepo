package Assignment2;

public class Students {
	public int Sum(int a, int b) {
		int c=a+b;
		System.out.println("Addition" +c);
		return c;
	}
	public int Sum1(int c, int d) {
		int e=c+d;
		System.out.println("Addition" +e);
		return c;
	}
	public int Subtraction(int f, int g) {
		int h=f-g;
		System.out.println("Substraction" +h);
		return h;
	}
	public int Multiply(int x, int y) {
		int z=x*y;
		System.out.println("Multiply" +z);
		return z;
	}
	public int Division(int a1, int a2) {
		int a3=a1/a2;
		System.out.println("Division" +a3);
		return a3;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students nits=new Students();
		int add=nits.Sum(10, 2);
		int add1=nits.Sum1(add, 2);
		int sub=nits.Subtraction(add, 2);
		int mul=nits.Multiply(sub, 2);
		nits.Division(mul, 2);
	}
}
