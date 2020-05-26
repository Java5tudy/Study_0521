package CollectionFrameWork;
import java.util.HashSet;
import java.util.Objects;

class Person {
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return name + "(" +age+"¼¼)";
	}
	@Override
	public int hashCode() {
		return Objects.hash(name,age);
	}
	@Override
	public boolean equals(Object obj) {
		String name = ((Person)obj).name;
		int age = ((Person)obj).age;
		
		if(name.equals(name) && age == (age))
			return true;
		else
			return false;
	}
}
public class PersonHashSet {
	public static void main(String[] args) {
		HashSet<Person> set = new HashSet<>();
		set.add(new Person("Sam",29));
		set.add(new Person("Sam",17));
		set.add(new Person("Sam",29));
		set.add(new Person("Jeff",17));
		set.add(new Person("Jeff",21));
		
		for(Person p : set)
			System.out.print(p.toString()+"\t");
		System.out.println();
	}

}
