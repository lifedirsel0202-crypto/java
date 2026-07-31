package chapter14;

import java.io.BufferedReader;  // 한번도 안쓰였다는 의미 지워도 됨
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class StreamExample {
//  보조스트림 
	public static  void main (String[] args) throws Exception {
			wrete("안녕하세요 지금은 11시 31분입니다");
			String data = read();
			System.out.println(data);
			
		/*
		 * InputStream is = new FileInputStream(""); 
		 * InputStreamReader reader = new
		 * InputStreamReader(is); BufferedReader br = new BufferedReader(reader);
		 */
			
	}
	public static void wrete(String str) throws Exception{
		FileOutputStream fos = new FileOutputStream("C:/Users/kj/OneDrive/바탕 화면/박채윤/teststream.txt");
		Writer writer = new OutputStreamWriter(fos);
		
		writer.write(str);
		writer.flush();
		writer.close();
		

	}
	
	public static String read() throws Exception{
		FileInputStream fis = new FileInputStream("C:/Users/kj/OneDrive/바탕 화면/박채윤/teststream.txt");
		Reader reader =  new InputStreamReader(fis);
		
		
		char[] buffer = new char[100];
		int readCharNum = reader.read(buffer);
		reader.close();
		
		String data = new String(buffer, 0 ,readCharNum);
		return data;
	}
	}

