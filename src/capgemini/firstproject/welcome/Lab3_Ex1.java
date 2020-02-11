package capgemini.firstproject.welcome;

import java.io.*;
public class Lab3_Ex1 {
	
	int[] a;
	int n=0;
	BufferedReader bb=new BufferedReader(new InputStreamReader(System.in));	

public static void main(String arg[]) {
	Lab3_Ex1 lbobj = new Lab3_Ex1();
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
	System.out.println("\nSecond Smallest Element of Array is "+lbobj.getSecondSmallest(lbobj,lbobj.a));
		
}

public int getSecondSmallest(Lab3_Ex1 obj, int[] ab){
	try {
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
	catch(NumberFormatException e) {
		e.printStackTrace();
	}
	finally {
		try {
			bb.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}	
	int i=0;
	for(int j=i+1;j<n;j++) {
		if(ab[i]==ab[j])
			i++;
		else
			return ab[j];
	}
 
	return ab[0];
}
}
