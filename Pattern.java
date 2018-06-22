
public class Pattern {

	public static void main(String[] args) {
		for(int i=1; i<=7; i++)
		{
			int j=1, k=1;
			for(j=1; j<=i; j++)
				System.out.print(j);
			for(k=j; k<=7; k++)
				System.out.print("*");
			System.out.println();
		}

	}

}
