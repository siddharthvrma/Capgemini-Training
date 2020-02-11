package capgemini.firstproject.welcome;

import java.io.*;
public class Lab4_Ex1 {

	BufferedReader bb=new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] arg)
	{
		Lab4_Ex1 lobj=new Lab4_Ex1();
		lobj.Cubes();
	}
	
	public void Cubes() {
		int n = 0,m;
		int sum=0;
		System.out.println("\nEnter the number\n");
		try {
			n=Integer.parseInt(bb.readLine());
			m=n;
			while(m!=0)
			{
				int d=m%10;
				int e=d*d*d;
				m=m/10;
				sum=sum+e;
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally
		{
			try {
				bb.close();
			}
			catch(IOException e)
			{
				e.printStackTrace();
				
			}
		}
		System.out.println("\n Sum of the cubes of digit of "+n+" is "+sum);
	}
}
