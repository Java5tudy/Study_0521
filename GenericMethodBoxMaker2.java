package study0521;

class Box6<T>{
	private T w;
	
	public void set(T o) {
		w = o;
	}
	public T get() {
		return w;
	}
}
class Unboxer{
	public static <T> T openBox(Box6<T> box) {
		return box.get();
	}
}
public class GenericMethodBoxMaker2 {
	public static void main(String[] args) {
		Box6<String> box = new Box6<>();
		box.set("My Generic Method");
		
		String s = Unboxer.<String>openBox(box);
		System.out.println(s);
	}

}
