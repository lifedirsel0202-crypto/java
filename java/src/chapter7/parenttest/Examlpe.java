package chapter7.parenttest;

public class Examlpe {

	public static void main(String[] args) {
		
		Parent p1 = new Parent();
		Parent p2 = new Parent();
		
		
		Child c = new Child();
		Parent p = c;
		
		
		
		p.test1();
		p.test2();
		//p.test3  오류 
	}
}
