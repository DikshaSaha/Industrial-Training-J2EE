import java.util.*;
import java.io.*;
public class Pattern2 {

	public static void main(String[] args)throws IOException {
		Scanner sc=new Scanner(new InputStreamReader(System.in));
		int n=sc.nextInt(), count=1;
		int x=(n+1)/2;
		for(int i=1;count<=n;i=(count>x)?(i-1):(i+1))
		{
			for(int j=x-i; j>=1; j--)
				System.out.print(" ");
			for(int k=1; k<=i; k++)
				System.out.print("* ");
			System.out.println();
			count++;
		}
		sc.close();

	}

}
