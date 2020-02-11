package capgemini.firstproject.welcome;

import java.io.*;

interface Format{
	public String addSpace(String s);
}

public class Lab10_Ex2 {
	
	BufferedReader bb=new BufferedReader(new InputStreamReader(System.in));
	String str;
	
	public static void main(String[] arg) {
		Lab10_Ex2 lobj=new Lab10_Ex2();
		System.out.println("\nEnter the String\n");
		try {
			lobj.str=lobj.bb.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		Format spacing=(s)->{
			String s1="";
			int len=s.length();
			for(int i=0;i<len;i++) {
				if(i==len-1)	
					s1=s1+s.charAt(i);
				else					
					s1=s1+s.charAt(i)+" ";
				
			}
			return s1;
		};
		
		System.out.println("\nString after adding space\n\n"+spacing.addSpace(lobj.str));
	}

}
