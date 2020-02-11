package capgemini.firstproject.welcome;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Lab7_Ex5 {
	
	BufferedReader bb=new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] arg) {
		Lab7_Ex5 lobj=new Lab7_Ex5();
		lobj.getData(lobj,lobj.bb);
	}

	public void getData(Lab7_Ex5 obj,BufferedReader br) {
		int n=0;
		System.out.println("\nEnter the limit of Array\n");
		try {
			n=Integer.parseInt(br.readLine());
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		int[] a = new int[n];
		System.out.println("\nEnter the Array Elements\n");
		for(int i=0;i<n;i++) {
			try {
				a[i]=Integer.parseInt(br.readLine());
			} catch (NumberFormatException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("\nSecond Smallest Number :- "+obj.getSecondSmallest(a));
	}
	public int getSecondSmallest(int[] a1) {
		int len=a1.length;
		List<Integer> l=new ArrayList<Integer>();
		for(int i=0;i<len;i++) {
			l.add(a1[i]);
		}
		Collections.sort(l);
		List<Integer> l1=l.stream().distinct().collect(Collectors.toList());
		/*int i=0;
		for(int j=i+1;j<len;j++) {
			if(l.get(i)==l.get(j))
				i++;
			else
				return l.get(j);
		}*/
		
		return l1.get(1);
		
	}
}
