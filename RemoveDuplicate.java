import java.io.*;
import java.util.*;
class Demo
{
	
	static HashSet inpData(String s)
	{
		HashSet<String> sent=new HashSet();
		StringTokenizer s1=new StringTokenizer(s, " ");
		while(s1.hasMoreTokens())
			sent.add(s1.nextToken());
		
	/*
	 * better
	 * ......	
		 String[] data2=s.split(" ");
		List data3=Arrays.asList(data2);
		Set data4=new HashSet<>();
		data4.addAll(data3);
		
		*/
		return sent;
	}
}
public class RemoveDuplicate {

	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String data=br.readLine();
		HashSet<String> outp=Demo.inpData(data);
		System.out.println(outp);

	}

}
