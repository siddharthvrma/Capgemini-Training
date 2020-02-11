package capgemini.firstproject.welcome;

import java.io.*;

public class Lab5_Ex5 {


	BufferedReader bb=new BufferedReader(new InputStreamReader(System.in));
	
	
	public static void main(String[] arg) {
		Lab5_Ex5 lobj=new Lab5_Ex5();
		try {
			lobj.Validate();
		} catch (MyException e) {
			System.out.println("Exception Occured "+e);
		}
	}
	
	
	
	public void Validate() throws MyException {
		int age=0;
		System.out.println("\nEnter the age of a person\n");
		try {
			age=Integer.parseInt(bb.readLine());
			
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
				
		if(age<15)
			throw new MyException("Age shouldn't be less than 15\n");
		else
			System.out.println("\nValid Age\n");
		
	}
}
