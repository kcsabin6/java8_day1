package java8;

@FunctionalInterface	//will allow only one abstract method
interface Power{
	public int execute(int num);
}

public class AnonymousClass2 {

	public static void main(String[] args) {
		
		//This is special anonymous class 
		//Because we are using Functional interface 
		Power power=new Power() {
			
			@Override
			public int execute(int num) {
			return	num*num*num;
			}
		};
		
		int result=power.execute(5);
		System.out.println("Result is "+result);
		
		Power power1=(int num)-> {
			return	num*num*num;
		};
		
		Power power2=(num)-> {
			return	num*num*num;
		};
		
		//if we have only one parameter no need parenthesis()
		Power power3=num-> {
			return	num*num*num;
		};
		
		//if in method definition we have only one statement
		Power power4=num->num*num*num;
		int hola=power4.execute(6);
		System.out.println(hola);
		
		magic(power4,7);
		magic(num->num*num*num,7);
		magic(new Power() {
			@Override
			public int execute(int num) {
			return	num*num*num;
			}
		},7);
		
		
	}
	
	public static void magic(Power pk,int num) {
		int resulta=pk.execute(num);
		System.out.println(resulta);
	}
	
}




