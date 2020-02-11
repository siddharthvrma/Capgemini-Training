package capgemini.firstproject.welcome;

public class Lab1_Ex1 {
	
	int natural_number=150;
	
	public static void main(String[] args) {
		Lab1_Ex1 mObject = new Lab1_Ex1();
		System.out.println("Sum of First n Natural numbers which are divisible by 3 or 5 is "+mObject.calculateSum(mObject.natural_number));
	}
	
	public int calculateSum(int number) {
		int sum = 0;
		for(int i=0;i<=number;i++)
			if(i%3==0 || i%5==0)
				sum=sum+i;
		return sum;
	}
}
