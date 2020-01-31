package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class JavaStreamDemo {

	public static void main(String[] args) {
		List <Product> pl= new ArrayList<Product>();
		pl.add(new Product(1,"A9",22000f));  
        pl.add(new Product(2,"A10",38000f));  
        pl.add(new Product(3,"S10",28000f));  
        pl.add(new Product(4,"A8",27000f));  
        pl.add(new Product(5,"A6",90000f)); 
        
        List<Float> fp= pl.stream()        		
        		  .filter(p -> p.price > 40000)// filtering data  
                  .map(p->p.price)        // fetching price  
                  .collect(Collectors.toList()); // collecting as list  
        
        System.out.println(fp);
	}
}
