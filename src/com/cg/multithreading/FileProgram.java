package com.cg.multithreading;

import java.io.*;

public class FileProgram {
	
	FileInputStream filer = null;
	
	public static void main(String[] arg) {
		
		FileProgram fp=new FileProgram();
		//FileWriter filew = null;
		//BufferedReader bb = null;
		try {
			fp.filer=new FileInputStream("C:\\Users\\Siddharth\\Documents\\Capgemini Training\\Source.txt");
			//bb=new BufferedReader(filer);
			/*try {
				filew=new FileWriter("C:\\Users\\Siddharth\\Documents\\Capgemini Training\\Target.txt");
			} catch (IOException e) {
				e.printStackTrace();
			}*/
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		CopyDataThread cdt=new CopyDataThread(fp.filer);
		new Thread(cdt).start();
	}
}
