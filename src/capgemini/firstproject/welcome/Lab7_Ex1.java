package capgemini.firstproject.welcome;

import java.io.*;
import java.util.*;

public class Lab7_Ex1 {

	BufferedReader  bb=new BufferedReader(new InputStreamReader(System.in));
	HashMap<Integer, Integer> hm=new HashMap<Integer, Integer>();
	int n;
	
	public static void main(String[] arg) {
		Lab7_Ex1 lobj=new Lab7_Ex1();
		System.out.println("\nEnter the limit\n");
		try {
			lobj.n=Integer.parseInt(lobj.bb.readLine());
			int[]a=new int[lobj.n];			
			int[]b=new int[lobj.n];		
			System.out.println("\nEnter the Keys of Hash Map\n");			
			for(int i=0;i<lobj.n;i++) {
				a[i]=Integer.parseInt(lobj.bb.readLine());
			}
			System.out.println("\nEnter the Values of Hash Map\n"); 
			for(int i=0;i<lobj.n;i++) {
				b[i]=Integer.parseInt(lobj.bb.readLine());
				lobj.hm.put(a[i],b[i]);
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("\n"+lobj.getValues(lobj.hm));
	}
	public List<Integer> getValues(HashMap<Integer, Integer> h) {
		
		List<Integer> l=new ArrayList<Integer>(h.values());
		System.out.println("\n"+h);
		Collections.sort(l);
		
		return l ;
	}
}
