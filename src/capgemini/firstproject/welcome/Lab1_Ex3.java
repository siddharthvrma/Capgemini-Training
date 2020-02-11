package capgemini.firstproject.welcome;

public class Lab1_Ex3 {
	int natural_number=133468;
	
	public static void main(String[] args) {
		Lab1_Ex3 mObject = new Lab1_Ex3();
		System.out.println("Is the number increasing : "+mObject.checkNumber(mObject.natural_number));
}
		public boolean checkNumber(int number) {	
			int l=number%10;
			boolean isIncreasing=false;
			while(number!=0)
			{
				if(number%10<=l)
				{
					l=number%10;
					number=number/10;
					isIncreasing=true;
				}
				else
					isIncreasing=false;
			}
		    return isIncreasing;		    		
}
}
