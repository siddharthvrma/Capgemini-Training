package capgemini.firstproject.welcome;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Lab7_Ex8 {

	BufferedReader bb=new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] arg) {
		Lab7_Ex8 lobj=new Lab7_Ex8();
		lobj.accept(lobj,lobj.bb);
	}
	public void accept(Lab7_Ex8 obj,BufferedReader br) {
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
		modifyArray(n,arr);
	}
	
	public int[] modifyArray(int size,int[] ab) {
		List<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<size;i++) {
			list.add(ab[i]);				
		}
		list=list.stream().distinct().collect(Collectors.toList());
		Collections.sort(list);
		Collections.reverse(list);
		//System.out.println(list);
		//System.out.println(list.get(2));
		size=list.size();
		for(int i=0;i<size;i++) {
			ab[i]=list.get(i);
		}
		System.out.println("\nDistinct Elements in Descending Order :-\n");
		for(int i=0;i<size;i++) {
			System.out.print(ab[i]+"\t");
		}
		
		return ab;
	}
}
