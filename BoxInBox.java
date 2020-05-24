package study0521;

class Box2<T>{
	private T b;
	
	public void set(T o) {
		b = o;
	}
	public T get() {
		return b;
	}
}
public class BoxInBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box2<String> sB = new Box2<>();
		sB.set("I am so happy");
		
		Box2<Box2<String>> wB = new Box2<>();
		wB.set(sB);
		
		Box2<Box2<Box2<String>>> zB = new Box2<>();
		zB.set(wB);
		
		System.out.println(zB.get().get().get());

	}

}
