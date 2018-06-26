package java_test;

public class Number implements Num {

	int l=0;
	@Override
	public void inc() {
		l++;
		
	}

	@Override
	public void dec() {
		l--;
		
	}
	
	public void printK() {
		System.out.println(l);
	}

}
