//LINKED와 ARRAY의 차이
//arraylist : 저장공간 늘리는데 시간걸림 / 인스턴스(원소) 삭제 과정에서 많은 연산 필요 - 저장된 인스턴스 참조가 빠르다(바로 접근 가능)
//linkedlist : 참조과정 복잡 - 저장공간 늘리는거 간단, 삭제과정 간단
//Iterator<T> iterator() : Collection<E>가 상속한다. 반복자 - E next() : 다음 인스턴스 참조값 반환 / boolean hasNext() : 참조값 반환 여부 확인 / void remove() : 반환했던 인스턴스 삭제
// - > while문을 통해서 반환 안되면 멈추도록 해야한다.

package may0525;

import java.util.HashSet;

class Person {
	private String name;
	private int age;
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return name + "{" + age + "세)";
	}
	@Override
	public int hashCode() {
		return (name.hashCode() + age) / 2;
	}
	@Override
	public boolean equals(Object o) {
		String n = ((Person)o).name;
		int a = ((Person)o).age;
		
		if (name.equals(n) && a == age) {
			return true;
		}
		else {
			return false;
		}
	}
}


public class S23_01_2 {
	public static void main(String[] args) {
		HashSet<Person> h = new HashSet<>();
		h.add(new Person("김진현",27));//
		h.add(new Person("김진현",26));
		h.add(new Person("김지냔",28));
		h.add(new Person("김진현",27));//
		h.add(new Person("김지년",27));
		for(Person p : h) {
			System.out.println(p.toString() + '\t');
		}
	}
}
