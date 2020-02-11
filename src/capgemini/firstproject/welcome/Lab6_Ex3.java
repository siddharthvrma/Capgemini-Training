package capgemini.firstproject.welcome;

import java.io.*;

public class Lab6_Ex3 {
	
	String s;
	BufferedReader bb=new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] arg)
	{
		Lab6_Ex3 lobj=new Lab6_Ex3();
		System.out.println("\nEnter the String");
		try {
			lobj.s=lobj.bb.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("\n"+lobj.getImage(lobj,lobj.s));
		
	}
	
	public String getImage(Lab6_Ex3 obj,String s1) {
		StringBuffer rev=new StringBuffer();
		rev.append(s1);
		rev.reverse();
		s1=s1.concat("|");
		s1=s1.concat(rev.toString());
		return s1;
	}

}
