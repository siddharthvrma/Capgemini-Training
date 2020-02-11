package capgemini.firstproject.welcome;

import java.io.*;
public class Lab3_Ex3 {
	
	int[] a;
	int n;
	BufferedReader bb=new BufferedReader(new InputStreamReader(System.in));	

public static void main(String arg[]) {
	Lab3_Ex3 lbobj = new Lab3_Ex3();
	System.out.println("\n Enter the size of list\n");
	try {
		lbobj.n=Integer.parseInt(lbobj.bb.readLine());
		lbobj.a=new int[lbobj.n];
		System.out.println("\n Enter the list of numbers\n");
		for(int i=0;i<lbobj.n;i++)
		{
			lbobj.a[i]=Integer.parseInt(lbobj.bb.readLine());	
		}
	} catch (NumberFormatException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
	lbobj.getSorted(lbobj,lbobj.a);
		
}

public int getSorted(Lab3_Ex3 obj, int[] ab){

	
	String[] b;
	
	try {
				
		b=new String[obj.n];
		
		for(int i=0;i<n;i++)
		b[i]=Integer.toString(ab[i]);
		for(int i=0;i<n;i++) {
			String rev="";
			int len=b[i].length();
			for(int j=len-1;j>=0;j--) {
				rev=rev+b[i].charAt(j);
		}
			b[i]=rev;
		}
		for(int i=0;i<n;i++)
		ab[i]=Integer.parseInt(b[i]);
		for(int i=0;i<n-1;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(ab[i]>ab[j])
				{
					int temp=ab[i];
					ab[i]=ab[j];
					ab[j]=temp;
				}			
			}
		}

	}	
	catch (NumberFormatException e) {
		e.printStackTrace();
	}
	
	finally {
		try {
			bb.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	System.out.println("\nResulting Array after Reversing and Sorting is ");
	for(int i=0;i<n;i++)
		System.out.println(ab[i]);
	return 0;
}
}
