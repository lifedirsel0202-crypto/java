package chapter14;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamExample {
				//Stream == 이동경로?
	public static void main  (String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("C:/Users/kj/OneDrive/바탕 화면/박채윤/printStreamTest.txt");
		PrintStream ps = new PrintStream(fos);  //파일로 출력해주는 기능
		
		ps.println("[프린터 보조 스트림]");
		ps.print("[마치");
		ps.println("프린터가 출력하는 것처럼");  //bufferdread시 유용하게 쓰일수 있다.
		ps.println("데이터를 출력합니다.");
		
		ps.flush();  //버퍼에 잔류하는 문자열을 모두 보내고 출력스트림 닫음.
		ps.close();
	}

}
