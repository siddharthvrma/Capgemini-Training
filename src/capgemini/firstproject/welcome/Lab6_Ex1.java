package capgemini.firstproject.welcome;

import java.io.*;
import java.util.StringTokenizer;

public class Lab6_Ex1 {

	BufferedReader bb=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] arg) {
		Lab6_Ex1 lobj=new Lab6_Ex1();
		lobj.Sum();
		
	}
	
	public void Sum() {
		String s=null;
		int n;
		int sum=0;
		System.out.println("\nEnter the line of Integers\n");
		try {
			s=bb.readLine();			
		}
		catch (IOException e) {
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
		StringTokenizer st=new StringTokenizer(s," ");
		
		while(st.hasMoreTokens())
		{
			n=Integer.parseInt(st.nextToken());
			System.out.println("\n"+n);
			sum=sum+n;
		}
		System.out.println("\nThe Sum of Entered Integers is "+sum);
		
	}
	
}
