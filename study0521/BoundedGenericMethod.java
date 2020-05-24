package study0521;

class Box7<T>{
	private T e;
	
	public void set(T a) {
		e = a;
	}
	public T get() {
		return e;
	}
}

class BoxFactory2{
	public static <T extends Number> Box7<T> makeBox(T a) {
		Box7<T> bb = new Box7<>();
		bb.get();
		
		System.out.println("Boxed data : " + a.intValue());
		return bb;
	}
}

class Unboxer2{
	public static <T extends Number> T openBox(Box7<T> b) {
		System.out.println("Unboxed data: " + b.get().intValue());
		return b.get();
	}
}
public class BoundedGenericMethod {
	public static void main(String[] args) {
		Box7<Integer> sb = BoxFactory2.makeBox(new Integer(1000));
		int n = Unboxer2.openBox(sb);
		System.out.println("returned data: " + n);
	}
	

}
