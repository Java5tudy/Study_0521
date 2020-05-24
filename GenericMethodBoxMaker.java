package study0521;

class Box5<T>{
	private T ob;
	
	public void set (T q) {
		ob = q;
	}
	public T get() {
		return ob;
	}
}

class BoxFactory{
	public static <T> Box5<T> makeBox(T o){
		Box5<T> bb = new Box5<T>();
		bb.set(o);
		return bb;
	}
}

public class GenericMethodBoxMaker {
	public static void main(String[] args) {
		Box5<String> sBo = BoxFactory.makeBox("sweet");
		System.out.println(sBo.get());
		
		Box5<Double> dBo = BoxFactory.makeBox(7.5959);
		System.out.println(dBo.get());
	}
}
