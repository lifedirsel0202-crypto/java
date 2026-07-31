package chae.List;

import java.util.*;

public class ArrayListExample {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		
		list.add("java");    // String 객체 저장 
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2,"Database");
		list.add("iBATIS");
		
		int size = list.size();
		System.out.println("총 객체수 :"+size);   // 객체수 5
		System.out.println();
		
		String skill = list.get(2);
		System.out.println("2:"+skill);  // 2번 인덱스의 객체 얻기
		System.out.println();
		
		for(int i=0; i<list.size(); i++) {
			String str = list.get(i);
			System.out.println(i+":"+str);   // 저장된 객체 만큼 이름 읽어서 출력
		}
		System.out.println();
		
		list.remove(2);   		//저장된 2번 객체 Database지워지고
		list.remove(2);			// 앞으로 넘어온 servlet/JSP도 지워지고
		list.remove("iBATIS");  // 그위 iBATIS도 지워짐
		
		
		for (int i = 0; i<list.size(); i++) {
			String str = list.get(i);
			System.out.println(i+":"+str);  //저장된 객체 수만큼 루핑
		}
		
		
		
		
	}

}
