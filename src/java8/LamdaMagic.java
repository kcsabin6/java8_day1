package java8;

interface Super{
	public void tin();
}

public class LamdaMagic {
	public static void main(String[] args) {
		
		Super sup=new Super() {
			@Override
			public void tin() {
				System.out.println("@!@!+ HaHaha");
			}
		};
		
		Super sup2=()->{
				System.out.println("@!@!+ HaHaha");
			};
		
			Super sup3=()->System.out.println("@!@!+ HaHaha");	
		
	/*1*/	iwiwi(sup3);
	/*2*/	iwiwi(()->System.out.println("@!@!+ HaHaha"));
	/*3*/	iwiwi(()->{
				System.out.println("@!@!+ HaHaha");
			});
	/*4*/	iwiwi(new Super() {
				@Override
				public void tin() {
					System.out.println("@!@!+ HaHaha");
				}
			});
		
		
	}
	
	public static void iwiwi(Super sup) {
		sup.tin();
	}

}
