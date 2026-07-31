package chapter14;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

public class ReadLineExample {  //use system 인코딩 첫번째 설정.

	public static void main(String[] args) throws Exception{

		
		Reader reder =  new FileReader("C:/Users/kj/OneDrive/바탕 화면/박채윤/myReadLineTest.txt");
		
		BufferedReader br = new BufferedReader(reder);
		
		
		String[][] userList = new String[2][3];
		int i=0;
		while(true) {
		String data =  br.readLine(); //엔터보이면 반환하고 하나씩 받아오는것보다 속도가 빠름.
			if (data == null) break;
			System.out.println(data);
			userList[i][0] = data.split(",")[0];
			userList[i][1] = data.split(",")[1];
			userList[i][2] = data.split(",")[2];
			i++;
		}
		System.out.println("----------------------");
		for (String[] user : userList) {
			System.out.println(user[0]+"");
			System.out.println(user[1]+"");
			System.out.println(user[2]);
		}
		br.close();
	}

}
