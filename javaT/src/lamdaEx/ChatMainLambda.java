package lamdaEx;

public class ChatMainLambda {

	public static void main(String[] args) {
		Chat c1= (name)->{
			String st="I would like to say ";
			String st2 = st+name;
			return st2;
		};
		
		System.out.println(c1.chat("time is precious"));
	}
}
