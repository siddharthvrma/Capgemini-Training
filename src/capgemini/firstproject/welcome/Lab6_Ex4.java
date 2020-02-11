package capgemini.firstproject.welcome;

import java.io.*;

public class Lab6_Ex4 {

	BufferedReader bb=new BufferedReader(new InputStreamReader(System.in));
	String s;
	
	public static void main(String[] arg)
	{
		Lab6_Ex4 lobj=new Lab6_Ex4();
		System.out.println("\nEnter the String\n");
		try {
			
			lobj.s=lobj.bb.readLine();
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
		
		System.out.println("\nAltered String is "+lobj.alterString(lobj,lobj.s));
		
	}
	public String alterString(Lab6_Ex4 obj, String sb)
	{
		String as=new String();
		for(int i=0;i<sb.length();i++) {
			if(sb.charAt(i)=='a'||sb.charAt(i)=='e'||sb.charAt(i)=='i'||sb.charAt(i)=='o'||
				sb.charAt(i)=='u'||sb.charAt(i)=='A'||sb.charAt(i)=='E'||sb.charAt(i)=='I'||
				sb.charAt(i)=='O'||sb.charAt(i)=='U') {
				char ch=sb.charAt(i);
				as=as+ch;
			}
			else
				as=as+(char)(sb.charAt(i)+1);
		}
		return as;
	}
}
