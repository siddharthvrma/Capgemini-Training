package capgemini.firstproject.welcome;

public class Lab1_Ex2 {
	int natural_number=100;
	
	public static void main(String[] args) {
		Lab1_Ex2 mObject = new Lab1_Ex2();
		System.out.println("Diff b/w the sum of sq of first n natural no and the sq of their sum is "+mObject.calculateDifference(mObject.natural_number));
	}
	
	public int calculateDifference(int n) {
		int sum=0, sum1 =0,sum2=0;
		for(int i=0;i<=n;i++)
		{
			sum1=sum1+i;
			sum2=sum2+(i*i);
		}
		sum=sum2-(sum1*sum1);
		return sum;
}
}
