package capgemini.firstproject.welcome;

import java.io.*;
import java.util.*;
import java.util.Map.Entry;

public class Lab7_Ex4 {
	
	BufferedReader bb=new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] arg)
	{
		Lab7_Ex4 lobj=new Lab7_Ex4();
		lobj.getData(lobj,lobj.bb);
	}
	public void getData(Lab7_Ex4 obj,BufferedReader br) {
		int n=0;;
		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		System.out.println("\nEnter the Limit\n");
		try {
			n=Integer.parseInt(br.readLine());
		}
		catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		int[] a=new int[n];
		int[] b=new int[n];
		System.out.println("\nEnter the Registration Number of Students\n");
		try{
			
			for(int i=0;i<n;i++) {
				a[i]=Integer.parseInt(br.readLine());
			}
			System.out.println("\nEnter the Marks of Students");
			for(int i=0;i<n;i++) {
				b[i]=Integer.parseInt(br.readLine());
			}
			
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		for(int i=0;i<n;i++) {
			hm.put(a[i], b[i]);
		}
		System.out.println(obj.getStudents(n,hm));
		
	}
	public HashMap<Integer,String> getStudents(Integer size,HashMap<Integer,Integer> h) {
		HashMap<Integer,String> h1=new HashMap<Integer,String>();
		Iterator<Entry<Integer,Integer>> itr=h.entrySet().iterator();
		Map.Entry<Integer, Integer> me=null;
		while(itr.hasNext()) {
			me=(Map.Entry<Integer, Integer>)itr.next();
		
			if(me.getValue()>=70 && me.getValue()<80) {
				h1.put(me.getKey(),"Bronze");
			}
			else if(me.getValue()>=80 && me.getValue()<90) {
				h1.put(me.getKey(),"Silver");
			}
			else if(me.getValue()>=90) {
				h1.put(me.getKey(),"Gold");
			}
			}
		
		return h1;
		
		
	}

}
