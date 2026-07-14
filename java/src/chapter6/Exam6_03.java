package chapter6;

import java.util.Scanner;

public class Exam6_03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("입력할 개수를 선택해주세요.");
		int input = 0;
		try {
		input = Integer.parseInt(sc.nextLine());
		}catch (Exception e) {System.out.println("숫자가 아닌것이 들어왔습니다.");
		}
		int[] numArray = new int[input];
		
	

		System.out.println(input + "개 숫자를 입력해주세요.");
		for (int i = 0; i < numArray.length; i++) {
			numArray[i] = Integer.parseInt(sc.nextLine());

		}

		System.out.println("입력한 숫자들의 합:" + sumArray(numArray));
	}

	// 배열에 있는 값을 모두 더하는 메소드!
	static int sumArray(int[] array) {
		int result = 0; // 합계담을 변수

//			for (int i : array) {
//				result += i;
//			}

		for (int i = 0; i < array.length; i++) {
			result += array[i];
		}

		return result;

	}
}
