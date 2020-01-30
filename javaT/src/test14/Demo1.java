package test14;

import java.util.ArrayList;

public class Demo1 {
	
	public static void main(String[] args) {
		//java.lang.ArithmeticException
		try {
			int result = 10/0;
		} catch (ArithmeticException e) {
			System.out.println("Message String = " + e.getMessage());
		}
		//java.lang.NullPointerException
		try {
			String res=null;
			res.length();
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
		//java.lang.NumberFormatException
		try {
			String s="K1233";
			int k= Integer.parseInt(s);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		//java.lang.ArrayIndexOutOfBoundsException
		try {
			int ar[]= {1,2,3,4,5};
				for(int i=0;i<=ar.length;i++) {
					System.out.println(ar[i]);
				}
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		//java.lang.IndexOutOfBoundsException
		try {
			ArrayList<String > al= new ArrayList<String>();
			al.add("A");
			al.add("B");
			System.out.println(al.get(2));
		} catch (Exception e) {
			e.printStackTrace();
		}
		//java.lang.StringIndexOutOfBoundsException:
		try {
			String re="Hello";
			char ch= re.charAt(6);
		} catch (StringIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
	}
}
