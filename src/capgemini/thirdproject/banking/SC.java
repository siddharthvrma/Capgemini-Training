package capgemini.thirdproject.banking;

import java.util.*;

public class SC extends RBI{	
	
	public void addAmount(Scanner sc) {

		setADD_INTEREST(3);
		super.addAmount(sc);
	}

	public void withdrawAmount(Scanner sc) {
		setMIN_BALANCE(5000);
		setWITHDRAW_INTEREST(3.8);
		super.withdrawAmount(sc);
	}	

	@Override
	public void showBalance() {
		super.showBalance();
	}

}
