package test14;

import java.util.Scanner;

public class Demo4  extends Exception{

	public Demo4(String as) {
		super(as);
	}
	public Demo4() {}
	
	public static void main(String[] args) {
		Demo4 d= new Demo4();
		System.out.println("Enter two string: ");
		Scanner s1=new Scanner(System.in);
			String st=s1.nextLine();
			String st2=s1.nextLine();
		//to run strcmp
		d.strcmp(st,st2);
		//to run strcmpi
		d.strcmpi(st.toLowerCase(),st2.toLowerCase());
	}

	private void strcmpi(String st, String st2) {
		
		try {
			if(st.equals(null) || st.equals("")) {
				throw new Demo4("Null or Empty not allowed");
			}
			else if(st2.equals(null) || st2.equals("")) {
				throw new Demo4("Null or Empty not allowed");
			}
		} catch (Exception e) {
			System.out.println("Caught: "+e.getMessage());
		}
		
		System.out.print(st+" "+st2+" ");
		
		if(st.length()>=st2.length() ) {
			System.out.println("inside if");
			int count=0;
			for(int i=0;i<st.length();i++) {
				
					int a=(int)st.charAt(i);
					int b=(int)st2.charAt(i);
//					System.out.println(a +" "+b);
					
				if( (a>=65 && a<=90) || (a>=97 && a<=122) && (b>=65 && b<=90) || (b>=97 && b<=122)) {
					
					if(a==b) {					
						
						if(count == st.length()-1) {
							System.out.print("0");
							count=0;
						}
						++count;
					}
					else {
						int k=a-b;
						System.out.println("k is: "+k);
					}
					
				}
				else {
					System.out.println("not valid");
				}
					
			}
		}
		else if(st2.length()>st.length()) {
			int count2=0;
			for(int i=0;i<st.length();i++) {
				
				int a=(int)st2.charAt(i);
				int b=(int)st.charAt(i);
//				System.out.println(a +" "+b);
					if( (a >=65 && a<=90) || (a>=97 && a<=122) && (b>=65 && b<=90) || (b>=97 && b<=122)) {
						
						if(st2.charAt(i)==st.charAt(i)) {					
							++count2;
							if(count2 == st.length()-1) {
								System.out.print("0");
								count2=0;
							}
						}
						else if(st2.charAt(i)!=st.charAt(i)){
							int k=(int)st2.charAt(i)-(int)st.charAt(i);
							System.out.println("k is: "+k);
						}						
					}
					else {
						System.out.println("not valid");
					}
					
			}
		}
	}
	
	private void strcmp(String st, String st2) {
		try {
			if(st.equals(null) || st.equals("")) {
				throw new Demo4("Null or Empty not allowed");
			}
			else if(st2.equals(null) || st2.equals("")) {
				throw new Demo4("Null or Empty not allowed");
			}
		} catch (Exception e) {
			System.out.println("Caught: "+e.getMessage());
		}
		
		System.out.print(st+" "+st2+" ");
		
		if(st.length()>=st2.length() ) {
			System.out.println("inside if");
			int count=0;
			for(int i=0;i<st.length();i++) {
				
					int a=(int)st.charAt(i);
					int b=(int)st2.charAt(i);
//					System.out.println(a +" "+b);
					
				if( (a>=65 && a<=90) || (a>=97 && a<=122) && (b>=65 && b<=90) || (b>=97 && b<=122)) {
					
					if(a==b) {					
						
						if(count == st.length()-1) {
							System.out.print("0");
							count=0;
						}
						++count;
					}
					else {
						int k=a-b;
						System.out.println("k is: "+k);
					}
					
				}
				else {
					System.out.println("not valid");
				}
					
			}
		}
		else if(st2.length()>st.length()) {
			int count2=0;
			for(int i=0;i<st.length();i++) {
				
				int a=(int)st2.charAt(i);
				int b=(int)st.charAt(i);
//				System.out.println(a +" "+b);
					if( (a >=65 && a<=90) || (a>=97 && a<=122) && (b>=65 && b<=90) || (b>=97 && b<=122)) {
						
						if(st2.charAt(i)==st.charAt(i)) {					
							++count2;
							if(count2 == st.length()-1) {
								System.out.print("0");
								count2=0;
							}
						}
						else if(st2.charAt(i)!=st.charAt(i)){
							int k=(int)st2.charAt(i)-(int)st.charAt(i);
							System.out.println("k is: "+k);
						}						
					}
					else {
						System.out.println("not valid");
					}
					
			}
		}
	}
}
