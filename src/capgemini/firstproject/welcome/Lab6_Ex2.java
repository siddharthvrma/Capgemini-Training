package capgemini.firstproject.welcome;

import java.io.*;

public class Lab6_Ex2 {

	BufferedReader bb=new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] arg) {
		Lab6_Ex2 lobj=new Lab6_Ex2();
		lobj.readFile();
	}
	
	public void readFile() {
		int lno=1;
		String line=null;
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
					System.out.println(lno+". "+line);
					lno++;
									}
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		
		
	}
}
