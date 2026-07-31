package chapter09;

public class ClasExample {
	// class exam{  classExample$1test.class 메서드 안에 클래스
	
	public static void main(String[] args) {
		Test test = new Test();
		Test.Apple apple = test.new Apple();  //n
		Test.Apple apple2 = test.new Apple();  //n
		
		//
		
		apple.appleCnt=10;
		apple.applePrint();
		apple2.appleCnt=20;
		apple.applePrint();
		apple2.applePrint();
		
		apple.appleTest();
		
	}

}