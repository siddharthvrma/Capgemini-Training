package capgemini.firstproject.welcome;

import java.util.*;

public class SC extends RBI{
	SC()
	{
		setMIN_BALANCE(5000);
		setADD_INTEREST(0.03);
		setWITHDRAW_INTEREST(0.038);
	}
	
	public void addAmount(Scanner sc) {
		
		super.addAmount(sc);
	}

	public void withdrawAmount(Scanner sc) {
		
		super.withdrawAmount(sc);
	}	

	@Override
	public void showBalance() {
		super.showBalance();
	}

}
