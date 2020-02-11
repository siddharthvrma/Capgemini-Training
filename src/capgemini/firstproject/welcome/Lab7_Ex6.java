package capgemini.firstproject.welcome;

import java.io.*;
import java.util.*;
import java.util.Map;
import java.util.Map.Entry;
import java.time.*;

public class Lab7_Ex6 {
	BufferedReader bb=new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] arg)
	{
		Lab7_Ex6 lobj=new Lab7_Ex6();
		lobj.getData(lobj,lobj.bb);
	}
	public void getData(Lab7_Ex6 obj,BufferedReader br) {
		int n=0;;
		Map<Integer,String> hm=new HashMap<Integer,String>();
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
		String[] b=new String[n];
		try{
			
			for(int i=0;i<n;i++) {
				System.out.println("\nEnter the ID of a Person\n");
				a[i]=Integer.parseInt(br.readLine());
				System.out.println("\nEnter the Birth Date of the Person in DD/MM/YYYY format");
				b[i]=br.readLine();
			}
			
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		for(int i=0;i<n;i++) {
			hm.put(a[i], b[i]);
		}
		System.out.println(obj.votersList(n,hm));
		
	}
	public List<Integer> votersList(Integer size,Map<Integer,String> h) {
		List<Integer> l=new ArrayList<Integer>();
		Iterator<Entry<Integer,String>> itr=h.entrySet().iterator();
		Map.Entry<Integer, String> me=null;
		while(itr.hasNext()) {
			me=(Map.Entry<Integer, String>)itr.next();
			if(difference(me.getValue())==true) {
				l.add(me.getKey());
			}
		
		}
		
		return l;
		
		
	}
	
	public boolean difference(String str) {
		String[] ar=str.split("/");
		LocalDate p=LocalDate.of(Integer.parseInt(ar[2]),Integer.parseInt(ar[1]),Integer.parseInt(ar[0]));
		LocalDate n=LocalDate.now();
		Period d=Period.between(p, n);
		
		if(d.getYears()>=18)
			return true;
		else
			return false;
	}
}
