
import java.io.*;
class A
{
	void ok()
	{
		System.out.println("a");
	}
}
class tes2
{
	public static void main(String args[])throws IOException
	{
		A a=new A();
		System.out.println(a.getClass());
	}
}