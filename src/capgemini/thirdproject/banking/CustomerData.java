package capgemini.thirdproject.banking;

import java.util.HashMap;

public class CustomerData {
	
	public static HashMap<String, Customer> Customer_data() {
		HashMap<String, Customer> mMap = new HashMap<String, Customer>();
		Customer C1=new Customer("Saurabh",8500,"ICICI");
		Customer C2=new Customer("Sid",9650,"AXIS");
		Customer C3=new Customer("Chamyal",6000,"SC");
		Customer C4=new Customer("Piyush",3050,"HDFC");
		Customer C5=new Customer("Levi",7600,"ICICI");
		Customer C6=new Customer("Kite",9000,"ICICI");
		Customer C7=new Customer("Garry",7000,"AXIS");
		Customer C8=new Customer("Benn",4500,"SC");
		Customer C9=new Customer("Benny",4500,"HDFC");
		

		mMap.put("100001", C1);
		mMap.put("100002", C2);
		mMap.put("100003", C3);
		mMap.put("100004", C4);
		mMap.put("100005", C5);
		mMap.put("100006", C6);
		mMap.put("100007", C7);
		mMap.put("100008", C8);
		mMap.put("100009", C9);
		
		return mMap;

	}

}
