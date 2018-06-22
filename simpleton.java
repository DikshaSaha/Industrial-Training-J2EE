
public class simpleton {

	public static void main(String[] args){
		Singleton s1=Singleton.getObject();
		System.out.println("s1 hashcode: "+s1.hashCode());
		Singleton s2=Singleton.getObject();
		System.out.println("s2 hashcode: "+s2.hashCode());
		Singleton s3=Singleton.getObject();
		System.out.println("s3 hashcode: "+s3.hashCode());
	}
}

class Singleton 
{
	static Singleton s;
	private Singleton()
	{ 
	}
	public static Singleton getObject()
	{
		if(s==null)
			s=new Singleton();
		return s;
	}
}
