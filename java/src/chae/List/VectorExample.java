package chae.List;

import java.util.*;

public class VectorExample {

	public static void main(String[] args) {
		List<BoardExample> list = new Vector<>();  //여러명 동시 건드릴때 안전하게처리
		//자동으로 잠금장치 걸려 있어서 안전하게 사용 arrayList보다. 하지만 속도는 좀 느리기때문에 특별한 경우 아니면 거의 사용 x
		list.add(new BoardExample("제목1", "내용1", "글쓴이1"));//0
		list.add(new BoardExample("제목2", "내용2", "글쓴이2"));//1
		list.add(new BoardExample("제목3", "내용3", "글쓴이3"));//2
		list.add(new BoardExample("제목4", "내용4", "글쓴이4"));//3
		list.add(new BoardExample("제목5", "내용5", "글쓴이5"));//4   객체 생성
		
		list.remove(2);					// 2번 인덱스 remove 뒤에 (뒤에 목록 1씩 앞당겨지고)
		list.remove(3);					// 3번 인덱스가 된 4번이 지워짐.
		
		for(int i=0; i<list.size(); i++) {
			BoardExample boardExample = list.get(i);
			System.out.println(boardExample.subject + "\t" + boardExample.content + "\t" + boardExample.writer);
		}
	}

}
