package chapter7.test;

public abstract class Animal {
	
	public String kind;
	
	public void breathe() {  //추상 x
		System.out.println("숨을 쉽니다.");
		
	}
	public abstract void sound(); //뭘로 할지 모르니 추상 메소드로 남겨놓겠다.
	
		
	}


