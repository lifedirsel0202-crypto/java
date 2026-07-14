package chapter7;

public class CellPhone {


	String model;
	String color;
	
	void powerOn() {System.out.println("전원을켭니다");}
	void powerOff() {System.out.println("전원을끕니다");}
	void bell() {System.out.println("벨이울립니다");}
	void sendvoice(String message) {System.out.println("자기:" +message);}
	void reciveVoice(String message) {System.out.println("상대방 : "+ message);}
	void hangUp() {System.out.println("전화를 끊습니다.");}
	

	}


