package chapter12;

public class User02 extends Thread{
	
	private Calcurator calcurator;
	
	
	public void setCalcurator(Calcurator calcurator) {
		this.setName("User02");
		this.calcurator=calcurator;
	}
	
	public void run() {
		calcurator.setMemory(50);
	}
}
