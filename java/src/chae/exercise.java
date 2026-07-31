package chae;

import java.util.Scanner;

public class exercise {

	public static void main(String[] args) {
		int a=0;
		for (int i=0; i<=100; i++) {
			 a+=i;
		}System.out.println(a);  //sys out 위치가 for 안에 있으면 for가 돌때마다 값이 출력됨.
		                              //5050 출력.
		for (int i=2; i<=5; i++) { System.out.println("<"+i+">");   //
			for (int j=1; j<10; j++) {
				
				System.out.println(i+"x"+j+"="+i*j);
			}
}
		Scanner sc=new Scanner(System.in);
		int num = sc.nextInt();
		int num1 = num%2;
		if (num1==0) {
			System.out.println("짝");
		} else if (num1==1) {System.out.println("홀");
		
	}
	System.out.println("원하는 숫자 입력하세요.");
	int num2= sc.nextInt();
		if(num2%2==0) { System.out.println("짝");
					} else {System.out.println("홀");
					}
		
					}
}