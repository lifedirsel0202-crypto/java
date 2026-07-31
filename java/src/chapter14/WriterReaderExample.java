package chapter14;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class WriterReaderExample {
											
	public static void main(String[] args) throws Exception {
		Writer wt = new FileWriter("C:/Users/kj/OneDrive/바탕 화면/박채윤/test.txt");
		
		/*
		 *한글자씩 입력하기.
		 * char a = 'A'; 
		 * char b = 'B'; 
		 * char c = 'C';
		 * wt.write(a); 
		 * wt.write(b); 
		 * wt.write(c);
		 */
		
		//배열로 적는것. 배열이용해 글자 넣기
		char [] charArray = { 'H','E','L','L','O'};
		
		//글씨 쓰는 작업
		wt.write(charArray);  //기존내용 무시하고  (지워버리고 )  새로 작성
		wt.write(charArray,1,2);   //입력된 글자의 부분을 넣을수 있음 출력 E,L
		
		// String 이용해 글자 넣기
		//버퍼에 잔류하는 데이터 집어넣는게 flush
//		String str = "HELLO JAVA!";
//		wt.write(str);  //String 형식 출력
//		wt.write(str,1,5);  // 글자 해당부분 출력
		
		wt.flush();
		wt.close();  //파일로 빼내는 작업. 
		
		
		//Reader=================================문자입력스트림========================================
		
		
		Reader rd = new FileReader("C:/Users/kj/OneDrive/바탕 화면/박채윤/test.txt");
//		// 한글자 가져오기  ********제일 많이 사용
//		while (true) {
//			int data  = rd.read();  //1개의 문자만
//			if (data ==-1) break;  //-1(아무것도 없다는 뜻)이 나온건 데이터가 더이상 없다는 뜻.
//			
//			System.out.println((char)data);
		
//		String str1 = "";
//		
//		while (true) {
//		int data  = rd.read();  //1개의 문자만
//		if (data ==-1) break;  //-1(아무것도 없다는 뜻)이 나온건 데이터가 더이상 없다는 뜻.
//		
//		str1+= String.valueOf((char)data);
//		System.out.println((char)data);
//		}
//		System.out.println(str1);
		
		//배열길이만큼 읽기.
		
		char[] buffer = new char[100];
		
/*		while(true) {
			int readCharNum = rd.read(buffer,0,100);  //한글자씩 퍼버에 넣는
			if (readCharNum == -1) break;
			for( int i=0; i<readCharNum; i++) {*/
				//System.out.println(buffer[i]);
				
	
		
		
//		for(char c : buffer) {
//			System.out.println(c);
		
		int readCharNum2 = rd.read(buffer);
		if (readCharNum2 != -1) {
			for (int i=0; i<readCharNum2; i++) {
				System.out.print(buffer[i]);
			}
		}
		rd.close();
		
	}
}
