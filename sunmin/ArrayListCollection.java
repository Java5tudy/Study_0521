package CollectionFrameWork;
import java.util.List;
import java.util.ArrayList;

public class ArrayListCollection {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>(); //Arraylist<E> �ν��Ͻ� ����, �׷��� �� Arraylist�� �ƴ� List<E>�� ����������  ������? 
		
		list.add("Toy"); //�ν��Ͻ��� ���� 
		list.add("Box");
		list.add("Robot");
		 
		for(int i = 0; i<list.size(); i++) // �ν��Ͻ��� ������ �������
			System.out.print(list.get(i) + '\t');
		System.out.println();
		
		list.remove(0); //�ν��Ͻ��� ���� 
		
		for(int i = 0; i<list.size(); i++)
			System.out.print(list.get(i) + '\t');
		System.out.println();
		
	}

}
