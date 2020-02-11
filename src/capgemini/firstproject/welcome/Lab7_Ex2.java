package capgemini.firstproject.welcome;

import java.io.*;
import java.util.*;

public class Lab7_Ex2 {
	
	BufferedReader bb=new BufferedReader(new InputStreamReader(System.in));
	
	
	public static void main(String [] arg)
	{
		Lab7_Ex2 lobj=new Lab7_Ex2();
		System.out.println("\n"+lobj.countCharacter(lobj.getArray(lobj,lobj.bb)));
	}
	public char[] getArray(Lab7_Ex2 obj,BufferedReader br) {
		char[] ch=null;
		System.out.println("\nEnter the limit of array\n");
		try {
			int n=Integer.parseInt(br.readLine());
			ch=new char[n];
			System.out.println("\nEnter the Character Elements\n");
			for(int i=0;i<n;i++) {
				ch[i]=br.readLine().charAt(0);
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return ch;
		
	}
	public Map<Character,Integer> countCharacter(char[] c) {
		int size=c.length;		
		Map<Character,Integer> hm =new HashMap<Character,Integer>();
		for(int i=0;i<size;i++)
		{
			if(hm.containsKey(c[i])) {
				hm.put(c[i], hm.get(c[i])+1);
			}
			else
			{
				hm.put(c[i], 1);
			}
		}
			
		
		return hm;
		
	}

}
