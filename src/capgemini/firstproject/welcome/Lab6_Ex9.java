package capgemini.firstproject.welcome;

import java.io.*;
import java.time.*;

public class Lab6_Ex9 {
	
	String date=new String();
	BufferedReader bb=new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] arg) {

		Lab6_Ex9 lobj=new Lab6_Ex9();
		System.out.println("\nEnter the Date in the DD/MM/YYYY format\n");
		try {
			lobj.date=lobj.bb.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		lobj.display(lobj, lobj.date);

	}
	
	public void display(Lab6_Ex9 obj,String s){
		String[] ar=s.split("/");
		LocalDate p=LocalDate.of(Integer.parseInt(ar[2]),Integer.parseInt(ar[1]),Integer.parseInt(ar[0]));
		LocalDate n=LocalDate.now();
		Period d=Period.between(p, n);
		System.out.printf("\n Difference is %d years, %d months, %d days",d.getYears(),d.getMonths(),d.getDays());		
		}
		
	}

