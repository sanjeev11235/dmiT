package lamdaEx;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ComparatorLambdaMain2 {

	public static void main(String[] args) {
		List<ComparatorLambdaDemo> al =new ArrayList<ComparatorLambdaDemo>();
		al.add(new ComparatorLambdaDemo(1,"Samsung A5",17000f));  
        al.add(new ComparatorLambdaDemo(3,"Iphone 6S",65000f));  
        al.add(new ComparatorLambdaDemo(2,"Sony Xperia",25000f));  
        al.add(new ComparatorLambdaDemo(4,"Nokia Lumia",15000f));  
        al.add(new ComparatorLambdaDemo(5,"Redmi4 ",26000f));  
        al.add(new ComparatorLambdaDemo(6,"Lenevo Vibe",19000f));
        
        //using lambda to filter data	??
        Stream<ComparatorLambdaDemo>  data= al.stream().filter(p->p.price>20000);
        
        //using lambda to iterate through collection
        data.forEach(
        		ComparatorLambdaDemo->System.out.println(ComparatorLambdaDemo.name+" : "+ComparatorLambdaDemo.price)
        );
	}
}
