package chapter13;

import java.util.*;

public class ExampleSet {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>(); //Set<String> set = new HashSet<String>같은의미
		
		set.add("안녕하세요");
		set.add("여기는");
		set.add("IT06실입니다.");
		
		set.remove("여기는");  //정확한 아이디값을 줘야,삭제가능.

		set.add("사과");
		set.add("바나나");
		set.add("포도");
		
		//순서상관없이 일열로 정렬해봐라...는 뜻
		Iterator<String> iterator =set.iterator();
		//list는 for문  iterator는 몇개인지 모르니 while
		
		     //다음을 가지고 있는지 묻는..있으면 true,없으면 false//
		    //결과는 boolean
		while (iterator.hasNext()) {
			String str = iterator.next();  //next로 확인하고 다음으로 넘어가서 값이 있으면 또 while에 담는다.
			//향상된 for문이없을때는 이걸로 돌리고,,, 향상된 for문으로 대체가능!!
			
			System.out.println("set에 들어있는 데이터 : " + str);  //순서 상관없이 정렬.. 여기는은 삭제.
		
			iterator = set.iterator();
			while(iterator.hasNext()) {
			if(str.equals("포도")) {
				
		 
			}
			}
	}System.out.println(set.contains("바나나"));
	}
}
