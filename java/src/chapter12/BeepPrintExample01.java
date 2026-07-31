package chapter12;

import java.awt.Toolkit;

public class BeepPrintExample01 {
	public static void main(String[] args) {
	Toolkit toolkit = Toolkit.getDefaultToolkit();
	for (int i=0; i<5; i++) {
		toolkit.beep();  //띵  비프임 발생 == 하고 띵문자 출력.
		try {Thread.sleep(500); 
			
		}catch (Exception e) {}
		
	}
	for( int i=0; i<5; i++) {
		System.out.println("띵");
		try { Thread.sleep(500); 
	}catch(Exception e) {}
}
}
}