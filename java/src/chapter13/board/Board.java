package chapter13.board;

public class Board {
	
	public static final int Content = 0;
	private String title;
	private String content;
	
	public Board(String title, String content) {
		this.title= title;
		this.content= content;
	}
	
	public String  getTitle() { return title;}
	public String getContent() { return content;}
	
	}

