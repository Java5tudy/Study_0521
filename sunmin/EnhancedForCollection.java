package CollectionFrameWork;
import java.util.List;
import java.util.LinkedList;


public class EnhancedForCollection {

	public static void main(String[] args) {
		List<String> list = new LinkedList<>();
		
		list.add("Toy");
		list.add("Box");
		list.add("Robot");
		
		for(String s : list)
			System.out.print(s + '\t');
		System.out.println();
		
		list.remove(0);
		
		for(String s : list)
			System.out.print(s +'\t');
		System.out.println();

	}

}
