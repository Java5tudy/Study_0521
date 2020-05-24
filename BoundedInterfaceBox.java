package study0521;

interface Eatable{
	public String eat();
}
class Apple2 implements Eatable{
	public String toString() {
		return "I am an apple";
	}
	@Override
	public String eat() {
		return "It taste so good!";
	}
}

class Box4<T extends Eatable>{
	T ob;
	public void set(T o) {
		ob = o;
	}
	public T get() {
		System.out.println(ob.eat());
		return ob;
	}
}

public class BoundedInterfaceBox {
	public static void main(String[] args) {
		Box4<Apple2> b = new Box4<>();
		b.set(new Apple2());
		
		Apple2 ap = b.get();
		System.out.println(ap);
		}

}
