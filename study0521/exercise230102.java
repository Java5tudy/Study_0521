package study0521;

import java.util.HashSet;
import java.util.Objects;

class Person1{
	private String name;
	private int age;
	public Person1(String name, int age) {
		this.name = name; 
		this.age = age;
	}
	public String toString() {
		return name + "(" + age + "세)";
	}
	
//	public static int hash(Object...values) {
//		return age;
//	}

	
	@Override
	public int hashCode() { //해쉬코드 오버라이드
		return Objects.hash(name, age);
	}
	public boolean equals(Object obj) {
		String a = ((Person1)obj).name;
		int b = ((Person1)obj).age;
		
		if(name.equals(a) && age == b ) { //비교구문 작성
			return true;
		}else {
			return false;
		}
	}
}
public class exercise230102 {
	public static void main(String[] args) {
		HashSet<Person1> set = new HashSet<>();
		set.add(new Person1("james", 20));
		set.add(new Person1("james", 21));
		set.add(new Person1("james", 21));
		set.add(new Person1("tomholland", 19));
		set.add(new Person1("tomholland", 19));
		set.add(new Person1("tomholland", 30));
		set.add(new Person1("spiderman", 34));
		
		for(Person1 p : set)
			System.out.println(p.toString());
	}

}
