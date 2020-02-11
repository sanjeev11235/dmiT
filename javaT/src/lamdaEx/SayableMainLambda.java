package lamdaEx;

public class SayableMainLambda {

	public static void main(String[] args) {
		Sayable s1 = (name)->{
			return "Hello from s1 "+name;
		};
		System.out.println(s1.say("Sanjeev"));
		
		Sayable s2= name->{
			return "Hello from s2 "+name;
		};
		System.out.println(s2.say("Deepak"));
	}

}
