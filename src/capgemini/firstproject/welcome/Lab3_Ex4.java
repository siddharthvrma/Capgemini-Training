package capgemini.firstproject.welcome;

import java.io.*;

public class Lab3_Ex4 {
	
	BufferedReader bb=new BufferedReader(new InputStreamReader(System.in));
	
public static void main(String[] arg) {
		Lab3_Ex4 lobj=new Lab3_Ex4();
		lobj.Count();
	}
	
public void Count() {
		char[] ch;
		int n=0;
		System.out.println("\nEnter the size of Array\n");
		try {
			n=Integer.parseInt(bb.readLine());
			ch=new char[n];
			System.out.println("\nEnter the elements of Array\n");			
			for(int i=0;i<n;i++)
			{	
				ch[i]=(char)bb.read();			
			}
			for(int i=0;i<n;i++) {
				int cnt=0;
				for(int j=0;j<n;j++)
					if(ch[i]==ch[j])
						cnt++;
				
				System.out.println("The character "+ch[i]+" is present "+cnt+" times");
				
			
			}

		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				bb.close();
				
			}
			catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	

}
