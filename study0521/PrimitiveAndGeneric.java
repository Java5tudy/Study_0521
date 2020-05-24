package study0521;

class Box1<T>{
	private T ob;
	
	public void set(T a) {
		ob = a;
	}
	public T get() {
		return ob;
	}
}

public class PrimitiveAndGeneric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Box1<Integer> iBox = new Box1<>();
		int num = iBox.get();
		System.out.println(num);

	}

}
