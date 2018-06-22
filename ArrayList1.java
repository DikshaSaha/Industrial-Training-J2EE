import java.util.*;
public class ArrayList1 
{
	public static void main(String[] args) 
	{
		List data=new ArrayList();
		data.add("Hi");
		data.add(192);
		data.add(10.f);
		data.add(65L);
		data.add(78.9);
		data.remove(data.get(4));
		data.add(29.45);
		data.add(null);
		data.add(null);
		for(Object obj:data)
			System.out.println(obj);
		
		System.out.println("Has hi? "+data.contains("hi"));
		System.out.println("Has null? "+data.contains(null));
		System.out.println("Size: "+data.size());
		System.out.println("Empty? "+data.isEmpty());
		System.out.println(data);
	}
}
