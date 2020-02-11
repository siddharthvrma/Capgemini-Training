package com.cg.eis.exception;

import java.io.*;

public class EmployeeException {


	BufferedReader bb=new BufferedReader(new InputStreamReader(System.in));
	
	
	public static void main(String[] arg) {
		EmployeeException lobj=new EmployeeException();
		try {
			lobj.Validate();
		} catch (MyException e) {
			System.out.println("Exception Occured "+e);
		}
	}
	
	
	
	public void Validate() throws MyException {
		double salary=0;
		System.out.println("\nEnter the salary of a person\n");
		try {
			salary=Double.parseDouble(bb.readLine());
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				bb.close();
			}
			catch(IOException e) {
				e.printStackTrace();
			}
		}
				
		if(salary<3000)
			throw new MyException("Salary shouldn't be less than 3000\n");
		else
			System.out.println("\nValid Salary\n");
		
	}
}
