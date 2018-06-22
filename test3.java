
interface E 
{ 
	int a=5; int b=10;
}
class B implements E
{
	int x;
	void add(){ x= a+b;
System.out.println(x);}
}
public class test3 {

	public static void main(String[] args) {
		B b=new B();
		b.add();

	}

}
