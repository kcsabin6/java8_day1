package java8;
//Top level class
//static private and protected cannot be written on toplevel class
public class Outer {
	private int m=10;
	private static int n=20;
	
	public void showx() {
		System.out.println("show m= "+m);
		System.out.println("show n= "+n);
	}
	
	//this is no-static class
	//this inner class can be called with the help of outer enclosing class
	//inner class we cannot load with the help of outer class that's why we can not declare 
	//anything static inside it
	class Inner{
		private int p=100;
		//private static int q=200;
		
		public void showx() {
			System.out.println("@@@!!!!showx!!!@@@@");
		}
		
		public void show() {
			System.out.println("show p= "+p);
			System.out.println("show m= "+m);
			System.out.println("show n= "+n);
			showx();	//this will call it's own method, if method not present only then will call outer.
			Outer.this.showx();	// this will call Outer class method
		}
		
	}

	public static void main(String[] args) {
		Outer outer=new Outer();
		outer.showx();
		//now i want to make object of inner class
		//Outer.Inner iobj1=outer.new Inner();
		Outer.Inner iobj1=new Outer().new Inner();
		iobj1.show();
	}
	
	
	
}
