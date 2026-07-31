package chapter13;

import java.util.ArrayList;
import java.util.Scanner;

public class samStudent {
	static Scanner sc= new Scanner(System.in);
	
	public static void main(String[] args) {
		ArrayList<Student> std = new ArrayList<Student>();
}
		
	
		
	static Student inputInfo() {
		Student std = new Student();
		System.out.println("==========학생 정보 =========");
		System.out.print("이름 : ");
		std.setName(sc.nextLine());
		System.out.println("학년 / 반 / 번호 : ");
		try {
			
			String gcn= sc.nextLine();
			std.setGrade(Integer.parseInt(gcn.split("")[0].replace("학년","")));
			std.setClR(Integer.parseInt(gcn.split("")[1].replace("반","")));
			std.setClN(Integer.parseInt(gcn.split("")[2].replace("번", "")));
			std.setInfoId();
			 
		} catch (Exception e) {
			System.out.println("학생정보가 정상적으로 입력되지 않았습니다");
			std= null;
		}
		return std;

	}
}
