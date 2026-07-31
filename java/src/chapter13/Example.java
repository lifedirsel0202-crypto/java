package chapter13;

import java.util.ArrayList;
import java.util.List;

import chapter11.Member;

public class Example {

	public static void main(String[] args) {

		
			
			// 몇개인지 알때 > 배열
			String[] strArray = new String[3];
			strArray[0] = "a";
			strArray[1] = "ab";
			strArray[2] = "abc";
			//strArray[3] = "abcd";
			
			//List : 인터페이스 > 구현 > ArrayList : 클래스
			//데이터의 개수가 일정하지 않을때 사용(몇개인지 정확히 모를때)
			ArrayList<String> strList = new ArrayList<String>();
//			System.out.println(strList.size());
//			strList.add("a");
//			System.out.println(strList.size());
//			strList.add("ab");
//			System.out.println(strList.size());
			
			//개수 정해짐 > 배열
//			Member[] mList = new Member[3];
//			mList[0].id = "red";
			
			//개수 정해지지 않았음 > List(ArrayList) (추가/삭제가 가능하다!)
			ArrayList<Member> memberList = new ArrayList<Member>();
			
			//리스트에 객체 추가
			memberList.add(new Member());
			
			// 해당 리스트 개수 (length와 같은 역할)
			System.out.println(memberList.size());
			
			//index 1번 객체를 삭제한다!
			memberList.remove(1);
			System.out.println(memberList.size());
			
			//리스트 내용 전체삭제
			//memberList.clear();
			
			//해당 인덱스 객체를 가지고 온다.
			memberList.get(0).id = "blue";
			System.out.println(memberList.get(0).id);
		}
	}
