package capgemini.firstproject.welcome;

import java.util.*;

public class AXIS extends RBI{
	AXIS()
	{
		setMIN_BALANCE(4000);
		setADD_INTEREST(0.017);
		setWITHDRAW_INTEREST(0.02);
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
