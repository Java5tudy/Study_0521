package study0521;

class Apple{
	public String toString() {
		return "I am an apple";
	}
}
class Orange{
	public String toString() {
		return "I am an orange";
	}
}
class Box<T>{
	private T a;
	
	public void set (T o) {
		a = o;
	}
	public T get() {
		return a;
	}
}
public class FruitAndBox2_Generic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box<Apple> aB = new Box<>();
		Box<Orange> oB = new Box<>();
		
		aB.set(new Apple());
		oB.set(new Orange());
		
		Apple ap = aB.get();
		Orange op = oB.get();
		
		System.out.println(ap);
		System.out.println(op);

	}

}
