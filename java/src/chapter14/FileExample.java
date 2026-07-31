package chapter14;

import java.io.File;

public class FileExample {

	public static void main(String[] args) throws Exception{
//		File file = new File("C:/Users/kj/OneDrive/바탕 화면/박채윤/test/java/javapratice"); //확장자 안적으면 폴더
//		boolean isExist = file.exists();
//		System.out.println(isExist);  //파일(폴더)이 존재하는지 확인하기=메서드
//		
//		file.mkdirs();  //파일안에 파일 안에 파일 생성.{여려가지 한거번에 생성}
//		file.mkdir(); //폴더 한개 생성.
//		
//		
//		isExist = file.exists();
//		System.out.println(isExist);   
		
		String folderPath = "C:/Users/kj/OneDrive/바탕 화면/박채윤/test/java/javapratice/";
		String filePath = folderPath + "text.tet";
		File file = new File(filePath);
		
		boolean isExist = file.exists();
		System.out.println(isExist);
		
		file.createNewFile();  //새로운 파일을 만든다.
		
		
//		file.delete();   //만들논 파일 삭제
	
//		isExist = file.exists();
//		System.out.println(isExist);
//		
//		
//		boolean canRead = file.canRead(); //읽을수 있는 파일인가. 확인하는것 
//		System.out.println(canRead);
//		
		String getFileName = file.getName();
		System.out.println(getFileName);  // 파일 이름
		
		String parentFolder =  file.getParent();
		System.out.println(parentFolder);   //내 파일의 상위 폴더
		
		String pate =  file.getPath();
		System.out.println(pate);   //실제 파일의 경로
		
		System.out.println(file.isDirectory());   
		System.out.println(file.isFile());   //파일인지 폴더인지 확인하는 메서드
		System.out.println(file.length());
		
	}

}
