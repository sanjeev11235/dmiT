package RobinAliAssig;

import java.util.Scanner;

public class CalcDemo {

	public static void main(String[] args) {
		Scanner s1= new Scanner(System.in);
		System.out.println("Enter any two digits to see their calc: ");
		System.out.println("Eneter First Number");
		int num1 = s1.nextInt();
		System.out.println("Enter Second Number");
		int num2 = s1.nextInt();
		
		System.out.println("Choose what you wants to perform");
		System.out.println("1. Addition");
		System.out.println("2. Substraction");
		System.out.println("3. Multiply");
		System.out.println("4. Divide");
		System.out.println("5. power");
		
		int temp =s1.nextInt();
		
		switch (temp) {
		case 1:
			System.out.println("Addition is "+(num1+num2));
//			break;
		case 2:
			System.out.println("Substraction is "+(num1-num2));
//			break;
		case 3:
			System.out.println("Multiplication is "+(num1 * num2));
			break;
		case 4:
			System.out.println("Division is "+(num1/num2));
			break;
		case 5:
			int sum=1;
			for(int i=0;i<num2;i++) {
				sum= sum*num1;
			}
			System.out.println("Power "+num1+" of "+num2+" is "+sum);
			break;
		default:
			break;
		}
		
	}
}
