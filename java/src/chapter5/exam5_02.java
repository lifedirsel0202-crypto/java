package chapter5;

import java.util.Scanner;

public class exam5_02 {

	public static void main(String[] args) {
//		String str1 =" ";
//		String str2 =null;
//	  //int i = null; ->기본타입은 실제로 값이 담겨야하므로 null(값이 없다의미) 값이 될수없음.
//		System.out.println("str1 :"+str1);  //메모리를 가리키고있고,
//		System.out.println("str2 : "+str2);  //가리키고있는 참조 자체가 없는것.
//		
//		int []num = {0,1,2,3};
//		System.out.println(num.length);
//		
		/* " " /null의 비교
		 *  화장실에 휴지 심은 있고 휴지없는 상태 > " "(가리키는곳에 내용이 없는것)
		 * 휴지심조차 없을때 > null (애초에 아무것도 없는상태)
		*/
		
//	int[] num = new int[5];
//	for (int i=0; i<=5;i++) {num[i]=i; 
	//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
//	at chapter5.exam5_02.main(exam5_02.java:18) 

//	int[] num = null; // 공간자체가 만들어지지 않아 저장이 안됨.
//	num[0] = 3;
	//Exception in thread "main" java.lang.NullPointerException: Cannot store to int array because "num" is null
	// at chapter5.exam5_02.main(exam5_02.java:23)
		int [][] array = new int [5][5];
//		System.out.println(array.length);
//		System.out.println(array[0].length);
//		System.out.println(array[1].length);
//		System.out.println(array[2].length);  //한줄씩 따로 저장되고 있다는 뜻. =주소가 다 다름
		/*    1  2   3  4  5 
		 *    6  7  8  9  10
		 *    11 12 13 14 15
		 *    16 17 18 19 20
		 *    21 22 23 24 25
//		 */
//		int n =1;
//		
//		for (int i=0; i<5; i++) {
//			for (int j=0; j<5; j++) {array [i][j] = n;   
//			n++;
//				System.out.printf("%2d",array[i][j]);}  //	array [i][j] = 5*i+(j+1);
//					System.out.println();}
//	
	//	System.out.println("--------------------------");
		
	
		
	//1번쨰 과제
//		int s=25;
//		
//		for (int i=0; i<5; i++) {
//			for (int j=0; j<5; j++) {array[i][j] =s;
//			s--; System.out.printf("%2d" , array[i][j]);}
//			System.out.println();}
//		
	//2번쨰 과제
		
//		int b= 1;
		
//		for (int i=0; i<5; i++) {
//			for (int j=0; j<5; j++) {array[i][j]=b;
//			b+=2; System.out.printf("%2d" , array[i][j]);}
//			System.out.println();}
		
	//3번과제
//		int b= 25; 
		
//		for (int i=0; i<5; i++) { 
//			for (int j=0; j<5; j++) {int num =25-i-j*5 ;
//			array[i][j]=num;}}
//			for (int i=0; i<5; i++) { 
//				for (int j=0; j<5; j++) {
//				System.out.printf("%2d" , array[i][j]);}
//			System.out.println();}
	//4번과제
		int n=1;
		
		for (int i=0; i<5; i++) {
			for (int j=0; j<5; j++) {int num= i+1+j*5;
			array[i][j]=num;}}
		for (int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.printf( "%2d", array[i][j]);}
			System.out.println();}
	}
}
	// 5번과제

		
		
		
			
	


	

