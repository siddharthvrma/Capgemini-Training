package capgemini.firstproject.welcome;

import java.io.*;
import java.util.*;

public class Lab7_Ex7 {
	BufferedReader bb=new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] arg) {
		Lab7_Ex7 lobj=new Lab7_Ex7();
		lobj.accept(lobj,lobj.bb);
	}
	public void accept(Lab7_Ex7 obj,BufferedReader br) {
		int n=0;
		System.out.println("\nEnter the limit\n");
		try {
			n=Integer.parseInt(br.readLine());
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		int[] arr=new int[n];
		System.out.println("\nEnter the Elements\n");
		for(int i=0;i<n;i++) {
			try {
				arr[i]=Integer.parseInt(br.readLine());
			} catch (NumberFormatException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		getSorted(n,arr);
	}
	
	public int getSorted(int size, int[] ab){
		List<Integer> list=new ArrayList<Integer>();
		StringBuffer str=new StringBuffer("");
		for(int i=0;i<size;i++) {
			str.append(ab[i]);		
			str=str.reverse();
			list.add(Integer.parseInt(str.toString()));
			str=new StringBuffer("");
		}
		
		
//		for(int i=0;i<size;i++) {
//			list.add(ab[i]);
//			
//		}
		Collections.sort(list);
		System.out.println(list);
		return 0;

}
}