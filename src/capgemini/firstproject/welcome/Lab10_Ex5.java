package capgemini.firstproject.welcome;

import java.io.*;

interface Factorial{
	void fact();
}
public class Lab10_Ex5 {

	BufferedReader bb=new BufferedReader(new InputStreamReader(System.in));
	int number;
	
	void factofnum() {
		System.out.println("\nEnter the number");
		try {
			number=Integer.parseInt(bb.readLine());
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		int fac=1;
		for(int i=1;i<=number;i++) {
			fac=fac*i;
		}
		System.out.println("\nFactorial of "+number+" is :- "+fac);
	}
	
	public static void main(String[] arg) {
		Lab10_Ex5 lobj=new Lab10_Ex5();	
		Factorial fct=lobj::factofnum;
		fct.fact();
		
	}
}
