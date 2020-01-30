package test12;

public class Main {
	static String a="abc";
	static String b="ABC";
	public static void main(String[] args) {
		Parent p= new Parent(1, "A");
		Parent p2 =new Parent(2, "B");
		Parent p3= new Parent(1, "A");
		
		Child c= new Child(1, "A");
		Child c2= new Child(2, "B");
		Child c3= new Child(1, "A");
		
		System.out.println("p hascode"+p.hashCode());
		System.out.println("p2 hascode"+p2.hashCode());
		System.out.println("p3 hascode"+p3.hashCode());
		
		System.out.println("c hascode "+c.hashCode());
		System.out.println("c2 hascode "+c2.hashCode());
		System.out.println("c3 hascode "+c3.hashCode());
		
		System.out.println("p.equals(p) "+p.equals(p));
		System.out.println("p.equals(p2) "+p.equals(p2));
		System.out.println("p.equals(p3) "+p.equals(p3));
		
		System.out.println("c.equals(c) "+c.equals(c));
		System.out.println("c.equals(c2) "+c.equals(c2));
		System.out.println("c.equals(c3) "+c.equals(c3));
		
		System.out.println("p.equals(c) "+p.equals(c));
		System.out.println("p.equals(c2) "+p.equals(c2));
		System.out.println("p.equals(c3) "+p.equals(c3));
		
		if(p==p2) {
			System.out.println("p == p2");
		}
		else if(p==p) {
			System.out.println("p == p");
		}
		else if(p == p3) {
			System.out.println("p == p3");
		}
		
		if(a.equals(b)) {
			System.out.println(a.equals(b));
		}
		else if(a.equalsIgnoreCase(b)) {
			System.out.println(a.equalsIgnoreCase(b));
		}
		
		
	}
}
