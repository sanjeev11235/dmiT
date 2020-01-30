package test15;

import java.util.ArrayList;

public class Demo {
	
	int x;
	String st;
	
	public Demo() {

	}
	
	public Demo(int x, String st) {
		this.x = x;
		this.st = st;
	}

	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public String getSt() {
		return st;
	}

	public void setSt(String st) {
		this.st = st;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((st == null) ? 0 : st.hashCode());
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
		Demo other = (Demo) obj;
		if (st == null) {
			if (other.st != null)
				return false;
		} else if (!st.equals(other.st))
			return false;
		if (x != other.x)
			return false;
		return true;
	}

	
}
