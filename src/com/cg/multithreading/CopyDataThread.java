package com.cg.multithreading;

import java.io.*;

public class CopyDataThread extends Thread{

	FileInputStream bb;
	FileOutputStream fw;
	CopyDataThread(FileInputStream fr){
		bb=fr;
		try {
			fw=new FileOutputStream("C:\\Users\\Siddharth\\Documents\\Capgemini Training\\Target.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public void run() {
		super.run();
		try {
			
			int ch;
			int count=0;
			while((ch = bb.read()) != -1) {
				fw.write((char)ch);
				count++;
				if(count==10) {
					System.out.println("\n10 Characters Copied");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					
//					fw.write("\n");
//					fw.flush();
//					Thread.interrupted();

					count=0;
					
				}
				
			}
			System.out.println("\nFile Copied\n");
			bb.close();
			fw.close();			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
	
	

