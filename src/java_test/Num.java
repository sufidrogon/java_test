package java_test;

public interface Num {
	public int k = 0;

	static void printK() {
		System.out.println("K is : " + k);
	}

	void inc();

	void dec();

}
