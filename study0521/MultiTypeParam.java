package study0521;

class DBox<A, B>{
	private A left;
	private B right;
	
	public void set (A o, B r) {
		left = o;
		right = r;
	}
	
	@Override
	public String toString() {
		return left + "&" + right;
	}
}

public class MultiTypeParam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DBox<String, Integer> b = new DBox<>();
		b.set("Apple", 25);
		System.out.println(b);
	}
}
