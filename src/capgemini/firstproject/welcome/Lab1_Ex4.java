package capgemini.firstproject.welcome;

public class Lab1_Ex4 {	
	int natural_number=16;

public static void main(String[] args) {
	Lab1_Ex4 mObject = new Lab1_Ex4();
	System.out.println("Is number a power of two : "+mObject.checkNumber(mObject.natural_number));
}
	public boolean checkNumber(int number) {	
		boolean isPower2=false;
		while(number!=1)
		{
			if(number%2==0)
			{
			  number=number/2;
			  isPower2=true;
			}
			else 
			{
				isPower2=false;
				break;
			}
		}
		return isPower2;	    		    		
}
}