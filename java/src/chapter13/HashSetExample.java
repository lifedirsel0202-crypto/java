package chapter13;

import java.util.*;

public class HashSetExample {

	public static void main(String[] args) {
		Set<ExampleMember> set = new HashSet<ExampleMember>();
		
		set.add(new ExampleMember ("홍길동",30));
		set.add(new ExampleMember ("홍길동",30));
		
		System.out.println(" 총 객체수는 " + set.size());
		
	}

}
