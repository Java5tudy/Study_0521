import java.util.HashSet;
import java.util.Objects;

class Person {
	private String name;
	private int age;
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String toString() {
		return name + "(" + age + "¼¼)";
	}
	
	public int hash() {
        return Objects.hash(name, age);
    }
	
	public boolean equals(Object obj) {
        Person agnm = (Person)obj;
        
        if(agnm.equals(name) && (agnm.age == age))
            return true;
        else
            return false;
    }
}