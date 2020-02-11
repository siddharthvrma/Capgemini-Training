package capgemini.firstproject.welcome;

import java.io.*;

public class Lab6_Ex8 {

	String s;
	BufferedReader bb=new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] arg)
	{
		Lab6_Ex8 lobj=new Lab6_Ex8();
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
			catch(IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("\nEntered string is positive :- "+lobj.check(lobj,lobj.s));
	}
	public boolean check(Lab6_Ex8 obj,String s1) {
		boolean b=false;
		s1=s1.toUpperCase();
		for(int i=0;i<s1.length()-1;i++) {
			if(s1.charAt(i)>s1.charAt(i+1)) {
				b=false;
				break;
			}
			else
				b=true;
		}
		return b;
	}
}
