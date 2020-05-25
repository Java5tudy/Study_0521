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
		
		Iterator<String> itr = list.iterator(); //반복자 획득, itr이 지창이 참조
		
		while(itr.hasNext()) // itr이 반환할  대상이 있는지 확인해보자~  반복자를 이용한 순차적 참조
			System.out.print(itr.next()+'\t'); //있다면 출력~ 
		System.out.println();
		
		itr = list.iterator(); //반복자 다시 획득, 
		
		String str; 
		while(itr.hasNext()) {
			str = itr.next();
			if(str.equals("Box")) //str에 itr.next메서드 대입, "Box"와 같다면~
				itr.remove(); //위에서 next메서드가 반환한 인스턴스 "Box"를 모두삭제 
		}
		
		itr = list.iterator(); // 반복자 다시 획득
		
		while(itr.hasNext()) //삭제하고 난 후의 결과 확인 
			System.out.print(itr.next()+'\t');
		System.out.println();
			
	}

}
