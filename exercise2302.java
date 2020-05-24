package study0521;

import java.util.Comparator;
import java.util.TreeSet;

class IntComparator implements Comparator<Integer> {
	public int compare(Integer i1, Integer i2) {
		return i2.intValue()-i1.intValue();
	}
}

public class exercise2302 {
	public static void main(String[] args) {
		TreeSet<Integer> tr = new TreeSet<>();
		tr.add(30);
		tr.add(10);
		tr.add(20);
		
		for(Integer i:tr) {
			System.out.println(i.intValue());
		}System.out.println();
	}
}
