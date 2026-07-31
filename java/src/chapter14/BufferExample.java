package chapter14;

import java.io.*;

public class BufferExample {

	public static void main(String[] args) throws Exception{
		String originalFilePath1 = "C:/Users/kj/OneDrive/바탕 화면/박채윤/image/test.jpg";
									//buter클래스에 resource를 가지고 올거다
		String targetFilePath1 = "C:/Users/kj/OneDrive/바탕 화면/박채윤/image/tagetFile1.jpg";
		FileInputStream fis = new FileInputStream(originalFilePath1);
		FileOutputStream fos = new FileOutputStream(targetFilePath1);
		
		String originalFilePath2= "C:/Users/kj/OneDrive/바탕 화면/박채윤/image/test2.jpg";
		String targetFilePath2 = "C:/Users/kj/OneDrive/바탕 화면/박채윤/image/tagetFile2.jpg";
		FileInputStream fis2 = new FileInputStream(originalFilePath2);
		FileOutputStream for2 = new FileOutputStream(targetFilePath2);
		BufferedInputStream bis = new BufferedInputStream(fis2);
		BufferedOutputStream bos = new BufferedOutputStream(for2);
		
		long nonBufferTime = copy(fis, fos);
		System.out.println("버퍼를 사용하지 않았을 때 : \t" + nonBufferTime + "ns");
		
		long bufferTime = copy(bis, bos);
		System.out.println("버퍼를 사용했을 때 : \t" + bufferTime + "ns");
		
		fis.close();
		fos.close();
		bis.close();
		bos.close();
	}
	
	static int data = -1;
	public static long copy(InputStream is, OutputStream os) throws Exception {
		long start = System.nanoTime();
		while(true) {
			data = is.read();
			if(data == -1) break;
			os.write(data);
		}
		os.flush();
		long end = System.nanoTime();
		return (end - start);
	}
}