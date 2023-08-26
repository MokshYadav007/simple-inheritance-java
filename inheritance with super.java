package Inheritance;

class test1
{ 
	int a, b ;

	public test1()
	{
		System.out.println("parent class of test1 ");
	}

	public test1(int x, int y)
	{
		System.out.println("parameter hai isme");
	    a = x;
		b = y;

	}

}

class test2 extends test1
{
	public test2()
	{
		super(10, 20);
		System.out.println("child class of test 2");
	}
}

public class inheritanceWithsuper
{
	public static void main(String[] args) {
		test2 t1= new test2();
		

	}
}
