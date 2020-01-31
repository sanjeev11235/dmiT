package streams;

import java.util.ArrayList;
import java.util.List;

public class JavaStreamDemo2 {

	public static void main(String[] args) {
		List<Product> pl= new ArrayList<Product>();
		pl.add(new Product(1,"Hp zbook",100000f));
		pl.add(new Product(4, "Sony", 200000f));		
		pl.add(new Product(3, "Acer", 140000f));
		pl.add(new Product(2, "lenovo", 120000f));
		
		pl.stream()
			.filter(p ->p.price >150000)
			.forEach( p -> System.out.println(p.name));
	}
}
