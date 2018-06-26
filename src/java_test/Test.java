package java_test;

public class Test {
	
	public static void main(String[] args) {	
		Num n=new Number();
		n.dec();
		((Number)n).printK();
		
		Num.printK();
		
		n.inc();
		n.inc();
		
		((Number)n).printK();
		
		Num n1=new NewNumber0();
		((NewNumber0)n1).dec();
		((Number)n1).printK();
		((NewNumber0)n1).inc();
		
		((Number)n1).printK();
		
	}

}
