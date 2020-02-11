package capgemini.thirdproject.banking;

import java.util.*;

public class HDFC extends RBI{
	
	public void addAmount(Scanner sc) {
		setADD_INTEREST(2);
		super.addAmount(sc);
	}

	public void withdrawAmount(Scanner sc) {
		setMIN_BALANCE(2000);		
		setWITHDRAW_INTEREST(2.75);
		super.withdrawAmount(sc);
	}

	@Override
	public void showBalance() {
		super.showBalance();
	}

}
