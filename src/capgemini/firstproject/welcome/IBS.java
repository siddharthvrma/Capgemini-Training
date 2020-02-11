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

package capgemini.firstproject.welcome;

import java.util.*;

public class IBS {
	Scanner  mScanner = new Scanner(System.in);
	int c=1;
	public static void main(String[] args) {
		IBS obj=new IBS();
		obj.welcome(obj);
		
		obj.mScanner.close();
	}
	public void welcome(IBS object)
	{
		ICICI iobj=new ICICI();
		HDFC hobj=new HDFC();
		AXIS aobj=new AXIS();
		SC sobj=new SC();		
		System.out.println("\nWelcome to IBS\n");
		while(c!=2) {
		System.out.println("\nSelect Your Bank \n 1. ICICI \n 2. HDFC \n 3. SC \n 4. Axis\n");
		int choice=mScanner.nextInt();
		switch(choice)
		{
		case 1 : operation(iobj);
				 break;
		case 2 : operation(hobj);
			     break;
		case 3 : operation(aobj);
				 break;
		case 4 : operation(sobj);
				 break;
		default : System.out.println("\nBank does not exist\n");
		}
		System.out.println("\nDo you want to continue\n1. Yes\n2. No\n");
		c=mScanner.nextInt();
		
		
		}		
	}
	
public void operation(RBI object)	{
	
	System.out.println("\nEnter your Choice\n1. Deposit\n2. Withdraw\n");
	int ch=mScanner.nextInt();
	switch(ch) {
	case 1 : object.addAmount(mScanner);
			 object.showBalance();
			 break;
	case 2 : object.withdrawAmount(mScanner);
			 object.showBalance();
			 break;
	}
    }

}
