package capgemini.firstproject.welcome;

import java.io.*;

public class Lab6_Ex6 {

	BufferedReader bb=new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] arg) {
		Lab6_Ex6 lobj=new Lab6_Ex6();
		lobj.Display();
	}
	
	public void Display() {
		System.out.println("\nEnter the Text\n");
		String s;
		int cntch=0,cntwd=0;
		try {			
			s=bb.readLine();
			s=s.concat(" ");
			int j=0;
			for(int i=0;i<s.length();i++) {
				char ch=s.charAt(i);
				if(ch!='\0')
					cntch++;
				if(ch==' ')
				{	int k=i;
					String s1=s.substring(j,k);
					j=k;
					if(s1!="null")
						cntwd++;
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("\nNumber of Characters in the text :- "+(cntch-1));
		System.out.println("\nNumber of Words in the text :- "+cntwd);
		
	}
}
