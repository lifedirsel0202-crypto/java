package chapter09;

public class Parent {
  //익명자식객체
	class Child extends Parent{
		
	}
	
	class Test {
		Parent f = new Child();
		
	}
}
