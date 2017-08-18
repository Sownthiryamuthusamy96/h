import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FIB {
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		int n1=0,n2=1,n3;
		System.out.print(n1+" "+n2);
		System.out.println();
		for(int i=0;i<n;i++)
		{
			n3=n1+n2;
			n1=n2;
			n2=n3;
			
			System.out.print(n3);
			System.out.print(" ");
		}
		
	}
}
