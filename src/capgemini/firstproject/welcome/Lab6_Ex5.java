package capgemini.firstproject.welcome;

import java.io.*;

public class Lab6_Ex5 {

	BufferedReader bb=new BufferedReader(new InputStreamReader(System.in));
	int number1;
	
	public static void main(String[] arg)
	{
		Lab6_Ex5 lobj=new Lab6_Ex5();
		System.out.println("\nEnter the Number\n");
		try {
			lobj.number1=Integer.parseInt(lobj.bb.readLine());
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				lobj.bb.close();
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		}
		System.out.println("\nModified Number is "+lobj.modifyNumber(lobj,lobj.number1));
	}
	
	public int modifyNumber(Lab6_Ex5 obj, int n) {
		String s=Integer.toString(n);
		int[] j=new int[s.length()];
		int[] k=new int[s.length()];
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);			
			j[i]=Character.getNumericValue(ch);
		}
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<s.length()-1;i++)
		{
			k[i]=Math.abs(j[i]-j[i+1]);					
			
		}
		k[s.length()-1]=Math.abs(j[(s.length())-1]-j[0]);
		for(int i=0;i<s.length();i++)
		{
			sb=sb.append(k[i]);
		}
		
		int m=Integer.parseInt(sb.toString());
		return m;	
	}
}
