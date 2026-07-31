package chapter14;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ObjectStreamExample {

	public static void main(String[] args) throws Exception {
		
		writeList();
		List<Board> list = readList();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		for(Board board : list) {
//			System.out.println(board.getBno()+"\t" + board.getTitle() + "\t"+
//		board.getContent()+ "\t" + board.getWriter() + "\t"+sdf.format(board.getDate())
//					);
			System.out.println(board.toString());
		}
		
		
}
	public static void writeList() throws Exception{
		List<Board> list = new ArrayList<>();
		
		list.add(new Board(1, "제목 1", "내용 1", "글쓴이1", new Date()));
		list.add(new Board(1, "제목 2", "내용 2", "글쓴이2", new Date()));
		list.add(new Board(1, "제목 3", "내용 3", "글쓴이3", new Date()));
		
		//위에 만든 리스트가 아래 주소로 들어간ㄷ.
		FileOutputStream fos = new FileOutputStream("C:/Users/kj/OneDrive/바탕 화면/박채윤/board.db");
		
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(list);
		oos.flush();
		oos.close();
	}
	public static List <Board> readList() throws Exception{
		FileInputStream fis = new FileInputStream("C:/Users/kj/OneDrive/바탕 화면/박채윤/board.db");
		ObjectInputStream ois = new ObjectInputStream(fis);
		List <Board> list = (List<Board>) ois.readObject();
		return list;
	}
} 