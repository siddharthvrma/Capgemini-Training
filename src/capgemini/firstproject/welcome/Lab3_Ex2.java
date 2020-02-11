package capgemini.firstproject.welcome;

import java.io.*;
public class Lab3_Ex2 {
	
	BufferedReader bb=new BufferedReader(new InputStreamReader(System.in));	

public static void main(String[] arg) {
	Lab3_Ex2 lbobj = new Lab3_Ex2();
	lbobj.Accept();
	
}

public void Accept()
{
	String [] array=null;
	int n=0;
	System.out.println("\n Enter the size of array\n");
	try {
		n=Integer.parseInt(bb.readLine());
		array=new String[n];
		System.out.println("\n Enter the String objects\n");
		for(int i=0;i<n;i++)
		{
			array[i]=bb.readLine();		
		}
		for(int i=0;i<n-1;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(array[i].charAt(0)>array[j].charAt(0))
				{
					String temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}			
			}
		}
		
	}	
	catch (IOException e) {
		e.printStackTrace();
	}
	finally {
		try {
			bb.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	if(n%2==0)
	{	for(int i=0;i<n/2;i++)
			array[i]=array[i].toUpperCase();
		for(int i=n/2;i<n;i++)
			array[i]=array[i].toLowerCase();
		
	}
	else
	{	for(int i=0;i<(n/2)+1;i++)
			array[i]=array[i].toUpperCase();
		for(int i=(n/2)+1;i<n;i++)
			array[i]=array[i].toLowerCase();
	}
	System.out.println("\nResulted Array is \n");
	for(int i=0;i<n;i++) {
		System.out.println(array[i]);
	}

}
}