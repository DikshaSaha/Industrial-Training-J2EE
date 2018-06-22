import java.io.*;
import java.util.*;
class Demo1
{
	static void put1(String x, List<String> inp3, Set<String> inp4, HashMap<String, Integer> freq)
	{
		freq.put(x, Collections.frequency(inp3, x));
	}
	static HashMap wordfreq(String inp1)
	{
		HashMap<String, Integer> freq=new HashMap();
		String inp2[]=inp1.split(" ");
		List<String> inp3=Arrays.asList(inp2);
		//inp3.forEach(System.out::println);
		Set<String> inp4=new HashSet();
		inp4.addAll(inp3);
		inp4.forEach(x->put1(x, inp3, inp4, freq));
		
		
		
		/*
		 for(String x:inp4)
		{
			freq.put(x, Collections.frequency(inp3, x));
		}
		 */
		
		/*StringTokenizer s=new StringTokenizer(inp, " ");		
		String x;
		while(s.hasMoreTokens())
		{
			x=s.nextToken();
			if(freq.containsKey(x))
				freq.put(x, freq.get(x)+1);
			else
				freq.put(x, 1);
		}*/
		return freq;
	}
}
public class WordFrequency {

	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String data=br.readLine();
		HashMap<String,Integer> outp=Demo1.wordfreq(data);
		System.out.println(outp);

	}

}
