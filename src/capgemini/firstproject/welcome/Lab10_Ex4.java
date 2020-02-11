package capgemini.firstproject.welcome;

interface Creation{
	void create();
}
public class Lab10_Ex4 {

	public void make() {
		System.out.println("\nCreating Instance Using Method Reference\n");
	}
	
	public static void main(String[] arg) {
		Lab10_Ex4 lobj=new Lab10_Ex4();
		Creation crt=lobj::make;
		crt.create();
	}
}
