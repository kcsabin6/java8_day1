package java8;


interface Pooler{
	public void zee(String message);
	public void joke(String message);
}

public class AnonymousClass {
	
	public static void main(String[] args) {
		//Pooler ppp=new Pooler();
		Pooler ppp=new Pooler() {
			
			@Override
			public void zee(String message) {
				System.out.println("Hello magic of = "+message);
				
			}
			@Override
			public void joke(String message) {
				System.out.println("Hello joke of = "+message);
				
			}
			
		};
		ppp.zee("Mr. Jack");
		ppp.joke("Jocker");
		
	}
}
