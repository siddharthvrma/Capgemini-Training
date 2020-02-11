package capgemini.firstproject.welcome;

import java.io.*;

public class Lab5_Ex4 {

	BufferedReader bb=new BufferedReader(new InputStreamReader(System.in));
	
	
	public static void main(String[] arg) {
		Lab5_Ex4 lobj=new Lab5_Ex4();
		try {
			lobj.Validate();
		} catch (MyException e) {
			System.out.println("Exception Occured "+e);
		}
	}
	
	
	
	public void Validate() throws MyException {
		String fname=null;
		String lname=null;
		System.out.println("\nEnter the first name of Employee\n");
		try {
			fname=bb.readLine();

			System.out.println("\nEnter the last name of Employee\n");
			lname=bb.readLine();
			
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
				
		if(fname.length()==0&&lname.length()!=0)
			throw new MyException("First name shouldn't be empty\n");
		else if(fname.length()!=0&&lname.length()==0)
			throw new MyException("Last name shouldn't be empty\n");
		else if(fname.length()==0&&lname.length()==0)
			throw new MyException("Both names shouldn't be empty\n");
		else
			System.out.println("\nValid Names\n");
		
	}
}
