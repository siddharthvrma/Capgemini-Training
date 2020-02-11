package capgemini.firstproject.welcome;

import java.io.*;

interface Authenticate{
	public boolean valid(String user,String pass);
}
public class Lab10_Ex3 {
	
	BufferedReader bb=new BufferedReader(new InputStreamReader(System.in));
	String username,password;
	
	public static void main(String[] arg) {
		Lab10_Ex3 lobj=new Lab10_Ex3();
		lobj.Validate(lobj,lobj.bb);
	}
	
	public void Validate(Lab10_Ex3 obj,BufferedReader br) {
		System.out.println("\nEnter the username\n");
		try {
			obj.username=br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("\nEnter the password\n");
		try {
			obj.password=br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		Authenticate auth=(user,pass)->{
			if(user.equals("siddharth.vrma")&&pass.equals("admin"))
				return true;
			else
				return false;
		};
		if(auth.valid(obj.username, obj.password))
			System.out.println("\nAuthentication Successful\n");
		else
			System.out.println("\nWrong username or password\n");		
	}

}
