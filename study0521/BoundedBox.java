package study0521;

class Box3<T extends Number>{
	private T c;
	
	public void set(T o) {
		c = o;
	}
	public T get() {
		return c;
	}
}

public class BoundedBox {
	public static void main(String[] args) {
		Box3<Integer> iB = new Box3<>();
		iB.set(24);
		
		Box3<Double> dB = new Box3<>();
		dB.set(5.97);
		
		System.out.println(iB.get());
		System.out.println(dB.get());
	}

}
