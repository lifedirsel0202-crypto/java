package chapter12;

public class mainThreadExample {

	public static void main(String[] args) {
		 Calcurator calcurator = new Calcurator();
		 
		 User01 user01 = new User01();
		 user01.setCalcurator(calcurator);
		 user01.start();
		 
		 User02 user02 = new User02();
		 user02.setCalcurator(calcurator);
		 user02.start();
	}

}
