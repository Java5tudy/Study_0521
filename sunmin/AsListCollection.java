package CollectionFrameWork;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Arrays;

public class AsListCollection {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Toy", "Robot", "Box"); //list 에  Arrays.asList("Toy", "Robot", "Box") 대입
		list = new ArrayList<>(list); // 새 인스턴스 생성. 
		
		//for문 기반의 반복자 획득과 순차적 참조
		for(Iterator<String> itr = list.iterator(); itr.hasNext();)// 반복자 지팡이 itr에 list반복자 대입. 
			System.out.print(itr.next() + '\t');
		System.out.println();
		
		//"Box"를 모두 삭제하기 위한 반복문
		for(Iterator<String> itr = list.iterator(); itr.hasNext();) {
			if(itr.next().equals("Box"))
				itr.remove();
		}
		
		for(Iterator<String> itr = list.iterator(); itr.hasNext();)
			System.out.print(itr.next()+'\t');
		System.out.println();
	}
	

}
