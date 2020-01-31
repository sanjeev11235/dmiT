package lamdaEx;

public interface FunInterface {

	void abstractFun(int x);
	
	default void normalFun() {
		System.out.println("normalFun");
	}
}
