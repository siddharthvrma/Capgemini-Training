package capgemini.firstproject.welcome;

import java.io.*;

public class Lab6_Ex6_1 {

BufferedReader bb=new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] arg) {
		Lab6_Ex6_1 lobj=new Lab6_Ex6_1();
		lobj.readFile();
	}
	
	public void readFile() {
		int cntch=0,cntwd=0,cntl=0;
		String line;
		String fname=null;
		System.out.println("\nEnter the name of file with extension\n");
		try {
			
			fname=bb.readLine();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			FileReader fr=new FileReader("C:\\Users\\Siddharth\\Documents\\Links\\"+fname);
			BufferedReader br=new BufferedReader(fr);
			try {
				
				while((line=br.readLine())!=null) {
					System.out.println(line);
					cntl++;
					cntch=cntch+line.length();
					String[] s=line.split(" ");
					cntwd=cntwd+s.length;
				}
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}

		System.out.println("\nNumber of Characters in the text :- "+cntch);	
		System.out.println("\nNumber of Words in the text :- "+cntwd);	
		System.out.println("\nNumber of Lines in the text :- "+cntl);	
	}
	
}

