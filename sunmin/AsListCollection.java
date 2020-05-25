package CollectionFrameWork;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Arrays;

public class AsListCollection {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Toy", "Robot", "Box"); //list ��  Arrays.asList("Toy", "Robot", "Box") ����
		list = new ArrayList<>(list); // �� �ν��Ͻ� ����. 
		
		//for�� ����� �ݺ��� ȹ��� ������ ����
		for(Iterator<String> itr = list.iterator(); itr.hasNext();)// �ݺ��� ������ itr�� list�ݺ��� ����. 
			System.out.print(itr.next() + '\t');
		System.out.println();
		
		//"Box"�� ��� �����ϱ� ���� �ݺ���
		for(Iterator<String> itr = list.iterator(); itr.hasNext();) {
			if(itr.next().equals("Box"))
				itr.remove();
		}
		
		for(Iterator<String> itr = list.iterator(); itr.hasNext();)
			System.out.print(itr.next()+'\t');
		System.out.println();
	}
	

}
