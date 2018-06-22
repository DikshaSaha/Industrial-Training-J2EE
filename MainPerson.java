public class MainPerson 
{
	public static void main(String[] args)throws CloneNotSupportedException
	{
		Person p1=new Person("A","B",12);
		Person p2=new Person("A","B",12);
		Person p3=(Person)(p1.clone());
		System.out.println("P1 equals P2? "+p1.equals(p2));
		System.out.println("P1's class equals P2's class? "+((p1.getClass()).toString()).equals((p2.getClass()).toString()));
		System.out.println("P1's Hashcode: "+p1.hashCode()+"\nP1's Class: "+p1.getClass()+"\nP1's Class+Hashcode: "+p1.toString());
		System.out.println("P2's Hashcode: "+p2.hashCode()+"\nP2's Class: "+p2.getClass()+"\nP2's Class+Hashcode: "+p2.toString());
		System.out.println("P3's Hashcode: "+p3.hashCode()+"\nP3's Class: "+p3.getClass()+"\nP3's Class+Hashcode: "+p3.toString());
	}

}
class Person implements Cloneable
{
	private String fname, lname;
	private int age;
	public Person(String fname, String lname, int age)
	{
		this.fname=fname;
		this.lname=lname;
		this.age=age;
	}
	protected Object clone()throws CloneNotSupportedException
	{
		return super.clone();
	}
	public boolean equals(Object obj)
	{
		Person p=(Person)obj;
		if((this.fname).equals(p.fname))
			return true;
		return false;
		
	}
}
