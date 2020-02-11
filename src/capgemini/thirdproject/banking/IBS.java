/*
 * 
 * @Author Capgemini
 * @Developer Siddharth Verma
 * @Description This class is performing the banking process
 * @Created 29/01/2020
 * @Version 1.0
 * @Status release Beta
 * 
 */

package capgemini.thirdproject.banking;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class IBS {
	Scanner  mScanner = new Scanner(System.in);
	RBI robj;
	int c=1;
	public static void main(String[] args) {
		IBS obj=new IBS();
		
		obj.welcome(obj);
		
		obj.mScanner.close();
	}
	public void welcome(IBS object)
	{			
		System.out.println("\nWelcome to IBS\n");
		Map<String, Customer> hMap= CustomerData.Customer_data();
		
		System.out.println("\nEnter The Account Number\n");
		String accno=object.mScanner.nextLine();
		
		Iterator<Entry<String,Customer>> i=hMap.entrySet().iterator();
		System.out.println("\nAccount Details are :-\n");
		String flag="";
		Map.Entry<String, Customer> me=null;
		while(i.hasNext()) {
			me=(Map.Entry<String,Customer>)i.next();
			if(me.getKey().equals(accno))
			{
				System.out.println("\nName \t\tBank \t\tBalance");
				System.out.println(me.getValue().getCname()+"\t\t"+me.getValue().getBnknm()+"\t\t"+me.getValue().getBalance());
				flag=me.getValue().getBnknm();
				break;
			}
		}
		/*while(c!=2) {
		System.out.println("\nSelect Your Bank \n 1. ICICI \n 2. HDFC \n 3. SC \n 4. Axis\n");
		int choice=mScanner.nextInt();*/
		switch(flag)
		{
		case "ICICI" :  robj=(ICICI)new ICICI();
				 		operation(robj,hMap,accno);
				 		break;
		case "HDFC" : 	robj=(HDFC)new HDFC();
				 		operation(robj,hMap,accno);
				 		break;
		case "AXIS" : 	robj=(AXIS)new AXIS();
				 		operation(robj,hMap,accno);
				 		break;
		case "SC" : 	robj=(SC)new SC();	
		 		 		operation(robj,hMap,accno);
		 		 		break;
		default : System.out.println("\nBank does not exist\n");
		}
		/*System.out.println("\nDo you want to change Bank\n1. Yes\n2. No\n");
		c=mScanner.nextInt();
		*/
	}

	
public void operation(RBI object,Map<String,Customer> hm, String acn)	{
	int choice=1;
	while(choice==1) {
	System.out.println("\nEnter your Choice\n1. Deposit\n2. Withdraw\n");
	int ch=mScanner.nextInt();
	switch(ch) {
	case 1 : object.addAmount(mScanner,hm,acn);
			 object.showBalance(hm,acn);
			 break;
	case 2 : object.withdrawAmount(mScanner,hm,acn);
			 object.showBalance(hm,acn);
			 break;
	default : System.out.println("\nWrong Choice Entered\n");
	}
	System.out.println("\nDo you want to continue to deposit or withdraw\n1. Yes\n2. No\n");
	choice=mScanner.nextInt();
	
    }

}
}