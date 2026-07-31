package chae.List;

import java.util.ArrayList;
import java.util.List;

public class LinkedListExample {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new ArrayList<>();
		
		long strarTime;
		long endTime;
		
		strarTime =  System.nanoTime();
		for(int i=0; i<10000; i++) {
			list1.add(0, String.valueOf(i));
		}
		
		endTime= System.nanoTime();		
		System.out.println("ArrayList걸린 시간 :"+ (endTime-strarTime)+"ns");
		
		strarTime= System.nanoTime();
		for(int i=0; i<10000; i++) {
			list2.add(0,String.valueOf(i));
		}
		
		endTime=System.nanoTime();
		System.out.println("LinkedList 걸린시간 :"+(endTime-strarTime) + "ns");
		
	}

}
