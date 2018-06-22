import java.io.*;
public class Factorial {
	
	private static long fac(int n)
	{
		long fact=1;
		while((n>=1)&&((fact=fact*n--)>0));
		return fact;
	}

	public static void main(String[] args)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		long fact=fac(n);
		System.out.println(fact);
	}
}