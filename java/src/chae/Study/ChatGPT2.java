package chae.Study;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Spliterators;
public class ChatGPT2 {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	ArrayList<Integer> list = new ArrayList<>();
	int select;
	while(true) { 
		System.out.println("=========");
		System.out.println("1. 숫자추가");
		System.out.println("2. 전체 숫자 보기");
		System.out.println("3. 짝수의 합");
		System.out.println("4. 10보다 큰 숫자의 개수");
		System.out.println("5. 가장 작은 숫자");
		System.out.println("6. 종료");
		System.out.println("=========");
		System.out.print("메뉴선택 :");
		select=sc.nextInt();
		if (select==1) { 
			System.out.print("숫자입력:");
			list.add(sc.nextInt());
		}else if (select==2) {
			for (int i =0; i<list.size();i++) {
				System.out.println("전체 입력된 숫자는:"+list.get(i));
			}
		}else if(select==3) {	
		int result= evevCal(list);
		System.out.println("짝수의 합은 "+ result);
		
		}else if(select==4) {
			int cal= maxNum(list);
			System.out.println("10보다 큰 숫자의 개수는 "+cal);
			
		}else if (select==5) {
			int min= minNum(list);
			System.out.println(min);
		}else if (select==6) {
			System.out.println("프로그램 종료합니다.");
		}

		break;
	}
	
}//3번 메서드 
 static  int evevCal(ArrayList<Integer>arr) {
	 int sum=0;
	 for (int i=0; i<arr.size();i++) {
		 int num=arr.get(i);
		 if (num%2==0) { sum+=num;}
	 }return sum;
 }
 // 4번 10보다 큰 숫자의 개수
 static int maxNum(ArrayList<Integer>arr) {
	 int count = 0;
	 for (int i=0; i<arr.size();i++) {
		 int num=arr.get(i);
		 if (num>10) { count++;}
	 }return count;
 }// 5번 가장 작은 숫자
 static int minNum(ArrayList<Integer>arr) {
	 int min=arr.get(0);
	 for (int i=0; i<arr.size();i++) {
		 int num=arr.get(i);
		 if(min>num) {min=num;}
	 }return min;
 }
	
}

	






