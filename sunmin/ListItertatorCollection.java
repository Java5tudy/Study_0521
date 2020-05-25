package CollectionFrameWork;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Arrays;

public class ListItertatorCollection {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Toy", "Box", "Robot", "Box");
		list = new ArrayList<>(list);
		
		ListIterator<String> litr = list.listIterator();
		
		String str;
		while(litr.hasNext()) {
			str = litr.next();
			System.out.print(str+"\t"); //Toy	Box	Robot	Box
			if(str.equals("Toy"))
				litr.add("Toy2"); // "Toy"가 있으면 "Toy2"추가~ Toy	Toy2  Box	Robot	Box	
		}
		System.out.println();
		
		while(litr.hasPrevious()) {
			str = litr.previous(); // Toy	Box	Robot	Box,	previous메서드로 인해 방향 바뀜  Box	Robot	Box	Toy2	Toy	
			System.out.print(str +"\t"); //Box	Robot	Box	Toy2	Toy	
			if(str.equals("Robot"))
				litr.add("Robot2"); //"Robot"있으면 "Robot2"추가~ 
									//Box	Robot	 Robot2 Box	Toy2	Toy	
		}
		System.out.println();
		 
		for(Iterator<String> itr = list.iterator(); itr.hasNext();) // 방향 다시 또 바뀜 
			System.out.print(itr.next() + "\t"); //Toy	Toy2	Box	Robot2	Robot	Box
		System.out.println();				
	}
}
