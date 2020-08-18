package java8;



final class A{
	
	static class B{
	}
	
}

class C extends A.B{
	
}



//final classes String,Integer,Scanner,System,Long etc...
public class Jocker {
	
	private int m=10;
	private static int n=20;
	
	public static void main(String[] args) {
		int gk=100;
		int pk=100;
		pk++;
		final int amoga=200;
		//amoga++;
		//local inner class
		//we cannot load it form enclosed class
		
		class Home{
			//local inner class we can access only final and 
			//effective final variable of enclosed class
			public void run() {
				System.out.println("n = "+n);
				//System.out.println("m = "+m);
				//System.out.println("pk = "+pk);
				System.out.println("gk = "+gk);
				System.out.println("amoga = "+amoga);
			}
			
		}
	}
	

	public  void main() {
		
		int gk=100;
		int pk=100;
		pk++;
		final int amoga=200;
		//amoga++;
		//local inner class
		//we cannot load it form enclosed class
		
		class Home{
			//local inner class we can access only final and 
			//effective final variable of enclosed class
			public void run() {
				System.out.println("n = "+n);
				System.out.println("m = "+m);
			//	System.out.println("pk = "+pk);
				System.out.println("gk = "+gk);
				System.out.println("amoga = "+amoga);
			}
			
		}
	}

}
