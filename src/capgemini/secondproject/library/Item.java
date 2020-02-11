/*
 * 
 * @Author Capgemini
 * @Developer Siddharth Verma
 * @Description This class is performing the banking process
 * @Created 29/01/2020
 * @Version 1.0
 * @Status release Beta
 * 
 */
package capgemini.secondproject.library;

import java.util.Scanner;

public abstract class Item {
	
	private int noc;
	private String title, uid;
	
	Scanner s;
	
	Item(){
		s=new Scanner(System.in);
	}

	public int getNoc() {
		return noc;
	}

	public void setNoc(int noc) {
		this.noc = noc;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
	
	

	@Override
	public String toString() {
		return String.format("Item Details :- \n 1. Title :- %s\n 2. Unique Identification Number :- %s\n 3. Number of Copies :-%s", getTitle(),getUid(),getNoc());
	}
	
	public void print() {
		
	}
	
	public void CheckIn() {
		setNoc(getNoc()+1);
	}
	
	public void CheckOut() {
		setNoc(getNoc()-1);	
	}

	public void addItem() {
		System.out.println("\nEnter the Title\n");
		setTitle(s.nextLine());
		System.out.println("\nEnter the Unique Identification Number\n");
		setUid(s.nextLine());
		System.out.println("\nEnter the number of copies\n");
		setNoc(s.nextInt());
		
	}
}
