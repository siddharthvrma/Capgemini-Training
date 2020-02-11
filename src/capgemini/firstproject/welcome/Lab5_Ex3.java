package capgemini.firstproject.welcome;

import java.io.*;

public class Lab5_Ex3 {

	BufferedReader bb=new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] arg)
	{
		Lab5_Ex3 lobj=new Lab5_Ex3();
		lobj.Prime();
	}
	
	public void Prime() {
		int n=0;
		System.out.println("\nEnter the limit\n");
		try {
			n=Integer.parseInt(bb.readLine());
			System.out.println("\nPrime Numbers :-");
			for(int i=2;i<=n;i++)
			{
				int h=0;
				for(int j=2;j<i;j++)
				{
					if(i%j==0) {
						h=1;
						break;
					}
				}
				if(h==0)
					System.out.print(i+"\t");
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				bb.close();
				
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		}
	}
	
}
