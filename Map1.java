import java.util.*;
public class Map1 {

	public static void main(String[] args) {
		Map<Integer,String> m=new HashMap();
		m.put(1,"a");
		m.put(2,"a");
		m.put(4,"c");
		m.put(1,"d");
		System.out.println(m);
		System.out.println(m.keySet());
	}
}
