package java_test;

public interface NewNum extends Num{

	@Override void inc();

	@Override
	default void dec() {
		System.out.println(k+"dec");
	}
	
	public int kala();
	
}
