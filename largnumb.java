import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class largnumb {
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		int a=0,b=0,num;
		num=Integer.parseInt(br.readLine());
		b=num;
		for(int i=2;i<n;i++)
		{
			num=Integer.parseInt(br.readLine());
			if(num>a)
			{
				a=num;
			}
			if(num<b)
			{
				b=num;
			}
		}
		System.out.println("largest"+a);
		System.out.println("smallest"+b);
	}
}

