/*
 * 
 * @Author Capgemini
 * @Developer Siddharth Verma
 * @Description This class is performing the banking process
 * @Created 27/01/2020
 * @Version 1.0
 * @Status release Beta
 * 
 */

package capgemini.firstproject.welcome;

import java.util.Scanner;

public class RBI {
	public double ADD_INTEREST,WITHDRAW_INTEREST,MIN_BALANCE,BALANCE;
	public int ADD_COUNTER=0,WITHDRAWCOUNTER=0;

	public void addAmount(Scanner sc) {
		System.out.println("\nEnter amount\n");
		double addAmount=sc.nextDouble();
		BALANCE=BALANCE+addAmount;
		setADD_COUNTER(getADD_COUNTER()+1);
		if(getADD_COUNTER()>3)
			setBALANCE(getBALANCE()+getBALANCE()*getADD_INTEREST());
		
	}
	public void withdrawAmount(Scanner sc) {
		System.out.println("\nEnter amount\n");
		double withdrawAmount=sc.nextDouble();
		if(BALANCE-withdrawAmount>=MIN_BALANCE) {
			BALANCE=BALANCE-withdrawAmount;
			setWITHDRAWCOUNTER(getWITHDRAWCOUNTER()+1);
			if(getWITHDRAWCOUNTER()>3)
				setBALANCE(getBALANCE()-getBALANCE()*getWITHDRAW_INTEREST());
		
		}
		else
			System.out.println("\nCannot withdraw because the minimum balance to be left in account is "+MIN_BALANCE+"\n");
	}
	public void showBalance() {
		System.out.println("\nYour Available Balance is "+BALANCE+"\n");
	}
	public double getADD_INTEREST() {
		return ADD_INTEREST;
	}
	public void setADD_INTEREST(double aDD_INTEREST) {
		ADD_INTEREST = aDD_INTEREST;
	}
	public double getWITHDRAW_INTEREST() {
		return WITHDRAW_INTEREST;
	}
	public void setWITHDRAW_INTEREST(double wITHDRAW_INTEREST) {
		WITHDRAW_INTEREST = wITHDRAW_INTEREST;
	}
	public double getMIN_BALANCE() {
		return MIN_BALANCE;
	}
	public void setMIN_BALANCE(double mIN_BALANCE) {
		MIN_BALANCE = mIN_BALANCE;
	}
	public double getBALANCE() {
		return BALANCE;
	}
	public void setBALANCE(double bALANCE) {
		BALANCE = bALANCE;
	}
	public int getADD_COUNTER() {
		return ADD_COUNTER;
	}
	public void setADD_COUNTER(int aDD_COUNTER) {
		ADD_COUNTER = aDD_COUNTER;
	}
	public int getWITHDRAWCOUNTER() {
		return WITHDRAWCOUNTER;
	}
	public void setWITHDRAWCOUNTER(int wITHDRAWCOUNTER) {
		WITHDRAWCOUNTER = wITHDRAWCOUNTER;
	}
	
}
