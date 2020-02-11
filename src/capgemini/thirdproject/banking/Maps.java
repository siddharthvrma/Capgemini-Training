package capgemini.thirdproject.banking;

import java.io.*;
import java.util.*;
import java.util.Map.*;

public class Maps {
	
	BufferedReader bb=new BufferedReader(new InputStreamReader(System.in));
	String sn,bn;
	double bl;
	int c=1;
	long accno;
	
	public static void main(String[] arg) {
		Maps lobj=new Maps();
		lobj.Accept(lobj, lobj.bb);
	}
	
	public void Accept(Maps m, BufferedReader br) {

		HashMap<Long, Customer> hm=new HashMap<Long,Customer>();
		Map.Entry<Long, Customer> me=null;
		while(m.c==1) {
		System.out.println("\nEnter the Name of Customer\n");		
		try {
			m.sn=m.bb.readLine();
			System.out.println("\nEnter the Balance of Customer\n");
			m.bl=Double.parseDouble(m.bb.readLine());
			System.out.println("\nEnter the Bank of Customer\n");
			m.bn=m.bb.readLine();	
			System.out.println("\nEnter the Account Number of Customer\n");
			m.accno=Long.parseLong(m.bb.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}
		Customer c1=new Customer(m.sn,m.bl,m.bn);
		hm.put(m.accno,c1);
		System.out.println("\nPress 1 To Continue\nPress 2 To Cancel");
		try {
			m.c=Integer.parseInt(m.bb.readLine());
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		}
		System.out.println("\nEnter the Account Number\n");
		long ac=0;
		try {
			ac = Long.parseLong(m.bb.readLine());
		} catch (NumberFormatException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
				Iterator<Entry<Long, Customer>> i=hm.entrySet().iterator();
		while(i.hasNext()) {
			me=(Map.Entry<Long,Customer>)i.next();
			//System.out.println("\nAccount Number of Customer is "+me.getKey());
			if(ac==me.getKey()) {
					System.out.println("\n\nDetails of Customer is \n");
					System.out.println("Name \t\tBank \t\tBalance");
					System.out.println(me.getValue().getCname()+"\t\t"+me.getValue().getBnknm()+"\t\t"+me.getValue().getBalance());
					
			} 
			}
		}
}

