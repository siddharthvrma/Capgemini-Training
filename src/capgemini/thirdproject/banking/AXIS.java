package capgemini.thirdproject.banking;

import java.util.*;

public class AXIS extends RBI{
	
	public void addAmount(Scanner sc) {
		setADD_INTEREST(0.017);
		super.addAmount(sc);
	}

	public void withdrawAmount(Scanner sc) {

		setMIN_BALANCE(4000);		
		setWITHDRAW_INTEREST(0.02);	
		super.withdrawAmount(sc);
	}

	@Override
	public void showBalance() {
		super.showBalance();
	}

}
