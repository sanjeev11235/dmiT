package StringBufferBuilder;

public class DemoString {

	public static void main(String[] args) {
		
		String s1= new String("Sanjeev");
		System.out.println("String s1 contains : "+s1);
		
		s1.concat(" Saini");		
		System.out.println("After concat with Saini String s1 : "+s1);
		
		
		String s2 = s1.concat(" Saini");
		System.out.println("Appending Saini in new String s2 : "+s2);
		System.out.println("String is Immutable We have to create new objects.\n\n");
		
		
		StringBuffer sb= new StringBuffer("Abhay");
		System.out.println("StringBuffer sb contains : "+sb);
		
		sb.append(" Kumar");
		System.out.println("Appending kumar to StringBuffer sb : "+sb);
		System.out.println("StringBuffer is immutable.\n\n");
		
		StringBuilder sbl= new StringBuilder("Rachit");
		System.out.println("StringBuilder sbl contains : "+sbl);
		
		sbl.append("Kumar");
		System.out.println("Appending Kumar to StringBuilder sbl : "+sbl);
		System.out.println("StringBuilder is immutable.\n\n");
	}
}
