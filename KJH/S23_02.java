package may0525;

import java.util.Comparator;
import java.util.TreeSet;


class Compare implements Comparator<Integer> {

	public int compare(Integer o1, Integer o2) { //int로 받지 말고 integer로 받을 것.
		return o2-o1;
	}
}


public class S23_02 {
	public static void main(String[] args) {
		TreeSet<Integer> tr = new TreeSet<>(new Compare());
		tr.add(30);
		tr.add(20);
		tr.add(10);
		System.out.println(tr);
	}
}
