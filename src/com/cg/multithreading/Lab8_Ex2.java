package com.cg.multithreading;

/*import java.sql.Time;
import java.time.*;*/
public class Lab8_Ex2 {

	public static void main(String[] arg) {
		Timer tm = new Timer("Thread Timer");
		new Thread(tm).start();
		
	}
}

 class Timer implements Runnable{
	
	String name;
	Timer(String n){
		name=n;
	}
	@Override
	public void run() {

		long startTime=System.currentTimeMillis();
		/*LocalTime lt=LocalTime.now();
		Time st=Time.valueOf(lt);
		System.out.println("\nStart "+st);*/
		while(true) {
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			long elapsedTime=System.currentTimeMillis()-startTime;
			long elapsedSec=elapsedTime/1000;
			long displaySec=elapsedSec%60;
			long elapsedMin=elapsedSec/60;
			System.out.println("\n"+elapsedMin+" : "+displaySec);
		}
		
	}
	
	
}
