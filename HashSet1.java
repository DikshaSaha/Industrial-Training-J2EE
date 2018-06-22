import java.util.*;
public class HashSet1 {

	public static void main(String[] args) {
		Set data= new HashSet();
		data.add("hello");
		data.add("hello");
		data.add(null);
		for(Object o:data)
			System.out.println(o);
		System.out.println(data.size());
		System.out.println(data.isEmpty());
		System.out.println(data);
	}
}
