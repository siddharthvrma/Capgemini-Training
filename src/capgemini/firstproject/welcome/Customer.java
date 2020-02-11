package capgemini.firstproject.welcome;

public class Customer {

	String cname,bnknm;
	double balance;
	
	Customer(String c,double b,String bnk){
		setCname(c);
		setBalance(b);
		setBnknm(bnk);
		
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double b) {
		this.balance = b;
	}

	public String getBnknm() {
		return bnknm;
	}

	public void setBnknm(String bnknm) {
		this.bnknm = bnknm;
	}
	

}
