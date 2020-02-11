package capgemini.firstproject.welcome;

import java.io.*;

public class Lab6_Ex10 {

	BufferedReader bb=new BufferedReader(new InputStreamReader(System.in));
	String username;
	
	public static void main(String[] arg)
	{
		Lab6_Ex10 lobj=new Lab6_Ex10();
		System.out.println("\nEnter the Username\n");
		try {
			lobj.username=lobj.bb.readLine();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		if(lobj.validate(lobj,lobj.username))
			System.out.println("Entered Username is Valid ");
		else
			System.out.println("Entered Username is Invalid ");
	}
	public boolean validate(Lab6_Ex10 obj,String s) {
		boolean b=false;
		String s1=null,s2=null;
		int len=s.length();
		for(int i=0;i<len;i++) 
		{
			if(s.charAt(i)=='_')
			{
				s1=s.substring(0,i);
				s2=s.substring(i);
			}
			else
				s1=s;
		}
		//System.out.println(s1);
		//System.out.println(s2);
		if(s1.length()>=8 && s2.contains("_job"))
			b=true;
		else
			b=false;
		return b;
	}
	
}
