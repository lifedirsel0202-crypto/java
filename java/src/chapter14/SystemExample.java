package chapter14;

import java.io.*;  // input output

public class SystemExample {

	public static void main(String[] args) throws Exception{
		//Scanner scanner =  new Scanner(System.in); //스캐너 클래스로 system.in을 편하게 쓰자는 의미. read는 flush/close 다해줘야함.
	//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  //system.in에 인풋스트림 (보조 붙여서) 버퍼스트림붙인것을 br이라 부른다.
		
		InputStream is = System.in; //데이터 통신 프로그램- 입력받아서.
		Reader reader = new InputStreamReader(is);
		BufferedReader br= new BufferedReader(reader); //버퍼형식으로 읽어오겠다.
		
		while(true) {
			System.out.print("입력하세요");
			String lineStr = br.readLine();  //엔터전까지 읽어오는것.
			if (lineStr.equals("q") || lineStr.equals("quit")) break;
			System.out.println("입력된 내용 : "+lineStr);
			System.out.println();
			
		}
		
		br.close();
	}

}
