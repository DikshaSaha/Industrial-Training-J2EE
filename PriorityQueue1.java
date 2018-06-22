import java.util.*;
public class PriorityQueue1 {

	public static void main(String[] args) {
		PriorityQueue p=new PriorityQueue();
		p.add(14);
		p.add(4);
		p.add(44);
		for(Object o:p)
			System.out.println(o);
		System.out.println(p);
		System.out.println(p.poll());
		System.out.println(p);
		System.out.println(p.peek());
		

	}

}
