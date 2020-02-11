package capgemini.firstproject.welcome;

import java.io.*;

public class Lab5_Ex2 {

	BufferedReader bb=new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] arg) {
		Lab5_Ex2 lobj=new Lab5_Ex2();
		lobj.Func1();
		lobj.Func2(lobj);
	}
	
	public void Func1() {
		int n=0;
		System.out.println("\nEnter the limit\n");
		int a=-1,b=1;
		try {
			n=Integer.parseInt(bb.readLine());
			System.out.println("\n The Fibonacci Series :-\n");
			for(int i=1;i<=n;i++) {
				int c=a+b;
				a=b;
				b=c;
				System.out.print("\t"+c);
				if(i==n)
					System.out.println("\n\nnth element of the fibonacci series :- "+c);
			}
				
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	public void Func2(Lab5_Ex2 obj) {
		int n=0;
		System.out.println("\nEnter the limit\n");
		try {
			n=Integer.parseInt(bb.readLine());
			for(int i=0;i<n;i++)
				System.out.print("\t"+obj.fib(i));
			System.out.println("\n\n nth Element of this series is  :- "+obj.fib(n-1));
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				bb.close();
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		}
		
	}
	public int fib(int n) {
		if(n==0)
			return 0;
		if(n==1||n==2)
			return 1;
		else
			return fib(n-1)+fib(n-2);
	}
}
