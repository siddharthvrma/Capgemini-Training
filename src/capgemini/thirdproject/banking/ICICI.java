package capgemini.thirdproject.banking;

import java.util.*;

public class ICICI extends RBI{
	
	
	public void addAmount(Scanner sc) {
		setADD_INTEREST(2.3);
		super.addAmount(sc);
	}

	public void withdrawAmount(Scanner sc) {
		setWITHDRAW_INTEREST(1.5);
		setMIN_BALANCE(3000);
		super.withdrawAmount(sc);
	}
	@Override
	public void showBalance() {
		super.showBalance();
	}

}
