package lamdaEx;

public class LambdaExpressionExample {

	public static void main(String[] args) {
		int width=15;
		//using annonymous class
//		Drawable d= new Drawable() {
//			
//			@Override
//			public void draw() {
//				
//				System.out.println(width);
//			}
//		};
//		d.draw();
		
		//using lambda expression
		Drawable d2=()->{
			System.out.println("Drawing "+width);
		};
		d2.draw();
	}
}
