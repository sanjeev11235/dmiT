package test13;

class Bike10 {
	final int speedlimit;//blank final variable

	Bike10() {
		speedlimit = 10;
		System.out.println(speedlimit);
		
	}

	public Bike10(int i) {
		speedlimit=i;
		System.out.println(i);
	}

	public static void main(String args[]) {
		new Bike10();
		new Bike10(100);
	}
}
