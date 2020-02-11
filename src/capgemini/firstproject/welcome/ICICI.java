package capgemini.firstproject.welcome;

import java.util.*;

public class ICICI extends RBI{
	ICICI()
	{
		setMIN_BALANCE(3000);
		setADD_INTEREST(0.015);
		setWITHDRAW_INTEREST(0.023);
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
