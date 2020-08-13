package java8;
//Top level class
//static private and protected cannot be written on toplevel class
public class StaticInner {
	private int m=10;
	private static int n=20;
	
	public static void wow() {
		System.out.println("wowowowowowowow");
	}
	
	public void showx() {
		System.out.println("show m= "+m);
		System.out.println("show n= "+n);
	}
	
	//static inner class is also known as nested class
	//this inner class can be called without  the instance of outer enclosing class
	//inner class we can load with the help of outer class  
	//static inner class can access only the static variable or method of outer class
	static class Inner{
		private int p=100;
		private static int q=200;
		
		public void showx() {
			System.out.println("@@@!!!!showx!!!@@@@");
		}
		
		public void show() {
			System.out.println("show p= "+p);
			System.out.println("show q= "+q);
			//System.out.println("show m= "+m);
			System.out.println("show n= "+n);
			showx();	//this will call it's own method, if method not present only then will call outer.
			//StaticInner.this.showx();	// this will call Outer class method
			StaticInner.wow();
		}
		
	}

	public static void main(String[] args) {
	//I am not making the instance of Outer class here
		//here we are making the object of Inner class directly with the help of Outer class
		StaticInner.Inner onb1=new StaticInner.Inner();
		onb1.show();
		onb1.showx();
	}
	
	
	
}
