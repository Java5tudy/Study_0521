package may0525;

import java.util.Objects;
import java.util.HashSet;

class Person1 {
	private String name;
	private int age;
	public Person1(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return name + "(" + age + "세)";
	}
	@Override 
	public int hashCode() {
		return Objects.hash(name, age);
	}
	@Override
	public boolean equals (Object o) {
		String n = ((Person1)o).name;
		int a = ((Person1)o).age;
		
		if (name.equals(n) && a == age) {
			return true;
		}
		else {
			return false;
		}
	}
}


public class S23_01_1 {
	public static void main(String[] args) {
		HashSet<Person1> h = new HashSet<>();
		h.add(new Person1("김진현",27));//
		h.add(new Person1("김진현",26));
		h.add(new Person1("김지냔",28));
		h.add(new Person1("김진현",27));//
		h.add(new Person1("김지년",27));
		for(Person1 p : h) {
			System.out.println(p.toString() + '\t');
		}
	}
}