package chapter14;

import java.io.BufferedReader;
import java.io.FileReader;

public class AddLineNumberExample {
	
	public static void main(String[] args) throws Exception {
		
		String filepath = "src/chapter14/AddLineNumberExample.java";  //파일을 읽어오고
		FileReader fr = new FileReader(filepath);  //  //파일리더늘 읽어서
		BufferedReader br = new BufferedReader(fr);  //보조스트림으로 단독 사용 안됨
		
		int i =1;
		
		while(true) {
			String data = br.readLine();
			if (data == null) {break;
			}
			System.out.println( i + ": " +data);
			i++;
			
			
		} br.close();
		
	}

}
