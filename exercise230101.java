package study0521;

import java.util.HashSet;

class Person{
	private String name;
	private int age;
	public Person(String name, int age) {
		this.name = name; 
		this.age = age;
	}
	public String toString() {
		return name + "(" + age + "세)";
	}
	@Override
	public int hashCode() { //해쉬코드 오버라이드
		return (name. hashCode() + age % 7);
	}
	public boolean equals(Object obj) {
		String a = ((Person)obj).name;
		int b = ((Person)obj).age;
		
		if(name.equals(a) && age == b ) { //비교구문 작성
			return true;
		}else {
			return false;
		}
	}
}

public class exercise230101 {
	public static void main(String[] args) {
		HashSet<Person> set = new HashSet<>();
		set.add(new Person("james", 20));
		set.add(new Person("james", 20));
		set.add(new Person("tomholland", 19));
		set.add(new Person("tomholland", 19));
		set.add(new Person("tomholland", 30));
		set.add(new Person("spiderman", 34));
		
		for(Person p : set)
			System.out.println(p.toString());
	}
}
