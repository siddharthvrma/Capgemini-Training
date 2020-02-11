package capgemini.firstproject.welcome;

import java.util.*;

public class HDFC extends RBI{
	HDFC()
	{
		setMIN_BALANCE(2000);
		setADD_INTEREST(0.02);
		setWITHDRAW_INTEREST(0.0275);
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
