package capgemini.firstproject.welcome;

import java.io.*;

interface Power{
	public double Pow1(double a, double b); 
}
public class Lab10_Ex1 {

	BufferedReader bb=new BufferedReader(new InputStreamReader(System.in));
	double x,y;
	
	public static void main(String[] arg) {
		Lab10_Ex1 lobj=new Lab10_Ex1();
		System.out.println("\nEnter the 2 numbers\n");
		try {
			lobj.x=Double.parseDouble(lobj.bb.readLine());
			lobj.y=Double.parseDouble(lobj.bb.readLine());			
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		Power pow=(a,b)->{
			return (Math.pow(a, b));
		};
		
		System.out.println(pow.Pow1(lobj.x,lobj.y));
	}
}
