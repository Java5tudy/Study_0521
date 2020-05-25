package CollectionFrameWork;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Iterator;
import java.util.Arrays;

public class ConversionCollection {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Toy", "Box", "Robot", "Box");
		list = new ArrayList<>(list);
		
		//ArrayList<E> 인스턴스의 순환?
		for(Iterator<String> itr = list.iterator(); itr.hasNext();)
			System.out.print(itr.next() + '\t');
		System.out.println();
		
		//ArrayList<E> 인스턴스를 기반으로 LinkedList인스턴스 생성
		list = new LinkedList<>(list);
		
		//LinkedList<E> 인스턴스의 순환 
		for(Iterator<String> itr = list.iterator(); itr.hasNext();)
			System.out.print(itr.next()+'\t');
		System.out.println();

	}

}
