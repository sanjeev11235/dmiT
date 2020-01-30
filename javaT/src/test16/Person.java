package test16;

public class Person implements Comparable<Person>{

	int x;
	String name;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}
	
	public Person(int x, String name) {
		super();
		this.x = x;
		this.name = name;
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + x;
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (x != other.x)
			return false;
		return true;
	}

	@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
//		return o.getName().compareTo(this.getName());
		return this.getName().compareTo(o.getName());
	}
	
	
}
