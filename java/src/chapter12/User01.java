package chapter12;

public class User01 extends Thread {

		private Calcurator calcurator;
		public void setCalcurator(Calcurator calcurator) {
			this.setName("User01");
			this.calcurator= calcurator;
		}
		public void run() {
			calcurator.setMemory(100);
		}
}
