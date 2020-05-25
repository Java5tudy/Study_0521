package CollectionFrameWork;
import java.util.List;
import java.util.Iterator;
import java.util.LinkedList;

public class IteratorCollection {
	public static void main(String[] args) {
		List<String> list = new LinkedList<>();
		list.add("Toy");
		list.add("Box");
		list.add("Robot");
		list.add("Box");
		
		Iterator<String> itr = list.iterator(); //�ݺ��� ȹ��, itr�� ��â�� ����
		
		while(itr.hasNext()) // itr�� ��ȯ��  ����� �ִ��� Ȯ���غ���~  �ݺ��ڸ� �̿��� ������ ����
			System.out.print(itr.next()+'\t'); //�ִٸ� ���~ 
		System.out.println();
		
		itr = list.iterator(); //�ݺ��� �ٽ� ȹ��, 
		
		String str; 
		while(itr.hasNext()) {
			str = itr.next();
			if(str.equals("Box")) //str�� itr.next�޼��� ����, "Box"�� ���ٸ�~
				itr.remove(); //������ next�޼��尡 ��ȯ�� �ν��Ͻ� "Box"�� ��λ��� 
		}
		
		itr = list.iterator(); // �ݺ��� �ٽ� ȹ��
		
		while(itr.hasNext()) //�����ϰ� �� ���� ��� Ȯ�� 
			System.out.print(itr.next()+'\t');
		System.out.println();
			
	}

}
