package CollectionFrameWork;
import java.util.List;
import java.util.ArrayList;

public class ArrayListCollection {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>(); //Arraylist<E> 인스턴스 생성, 그런데 왜 Arraylist가 아닌 List<E>형 참조변수를  썼을까? 
		
		list.add("Toy"); //인스턴스의 저장 
		list.add("Box");
		list.add("Robot");
		 
		for(int i = 0; i<list.size(); i++) // 인스턴스의 순차적 참조방식
			System.out.print(list.get(i) + '\t');
		System.out.println();
		
		list.remove(0); //인스턴스의 삭제 
		
		for(int i = 0; i<list.size(); i++)
			System.out.print(list.get(i) + '\t');
		System.out.println();
		
	}

}
