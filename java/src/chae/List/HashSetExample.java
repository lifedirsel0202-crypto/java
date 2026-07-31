package chae.List;

import java.util.*;

public class HashSetExample {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<>();
		
		set.add("Java");
		set.add("JDBS");
		set.add("Servlet/JSP");
		set.add("Java");  //중복저장 x
		set.add("iBATIS");
		set.add("공주");
		
		int size = set.size();   //저장된 객체수 얻기...
		System.out.println("총 객체수 :" + size);   // 중복문자 1개도 단출 그래서 5개만 저장  "Java
		
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t" + element);
		}
	}

}
