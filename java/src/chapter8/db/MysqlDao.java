package chapter8.db;

public class MysqlDao implements DateAccessObject {

	@Override
	public void dbwork() { 
	}

	@Override
	public void select() {
		// TODO Auto-generated method stub
		System.out.println("Mysql DB검색");
		
	}

	@Override
	public void insert() {
		System.out.println("Mysql DB삽입");
		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("Mysql DB수정");
		
	}

	@Override
	public void delete() {
		System.out.println("Mysql DB삭제");
		// TODO Auto-generated method stub
		
	}

}
