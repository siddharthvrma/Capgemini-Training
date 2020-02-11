package capgemini.firstproject.welcome;

import java.io.*;
import java.util.*;

public class Lab7_Ex3 {
	
	BufferedReader bb=new BufferedReader(new InputStreamReader(System.in));
	
	
	public static void main(String [] arg)
	{
		Lab7_Ex3 lobj=new Lab7_Ex3();
		System.out.println("\n"+lobj.getSquares(lobj.getArray(lobj,lobj.bb)));
	}
	public int[] getArray(Lab7_Ex3 obj,BufferedReader br) {
		int[] ch=null;
		System.out.println("\nEnter the limit of array\n");
		try {
			int n=Integer.parseInt(br.readLine());
			ch=new int[n];
			System.out.println("\nEnter the List of Numbers\n");
			for(int i=0;i<n;i++) {
				ch[i]=Integer.parseInt(br.readLine());
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return ch;
		
	}
	public Map<Integer,Integer> getSquares(int[] c) {
		int size=c.length;		
		Map<Integer,Integer> hm =new HashMap<Integer,Integer>();
		for(int i=0;i<size;i++)
		{
			hm.put(c[i], c[i]*c[i]);			
		}
			
		
		return hm;
		
	}

}
