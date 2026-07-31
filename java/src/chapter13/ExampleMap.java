package chapter13;

import java.security.KeyStore.Entry;
import java.util.*;

public class ExampleMap {
	
	public static void main(String[] args) {
		//Map<k(k(이름 붙일 자료형, V>
		
		Map<String, ExampleMember> testMap =  new HashMap<>();
		testMap.put("홍길동객체", new ExampleMember("홍길동", 30));
		testMap.put("김영희객체", new ExampleMember("김영희", 25));
		testMap.put("박철수객체", new ExampleMember("박철수", 35));
		testMap.put("박채윤객체", new ExampleMember("박철수", 39));  //객체 사용

		
		testMap.put("홍길동객체2", new ExampleMember("홍길동", 30));
		            //키값.                       의 필요값.
		System.out.println(testMap.get("박채윤객체").age);
		
		  //클래스   클래스
		Map<String, Integer> memberList = new HashMap<>();
		
		memberList.put("홍길동", 30);
		memberList.put("김영희", 25);
		memberList.put("박철수", 35);  //내용 저장
		
		
		System.out.println("memberList크기: " +memberList.size()); //같은 키로 입력하게 되면 업데이트. 중복 허용x
		System.out.println(memberList.get("박철수"));
		
		memberList.put("박철수", 45);  //내용 수정응로 출력
		
		System.out.println(memberList.get("박철수"));
		
//		Iterator<Entry> ir = memberList.entryset().iterator();
//		while(ir.hasNext()) {
//			Entry<String, integer>> temp = ir.next();
			
			memberList.remove("박채윤");
			System.out.println("memberList크기: " +memberList.size());
			
		}

	}
	


