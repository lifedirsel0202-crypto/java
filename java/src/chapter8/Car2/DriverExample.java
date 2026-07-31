package chapter8.Car2;

public class DriverExample {

	public static void main(String[] args) {
		// TODO run메소드 나중에 해야할일을 적어놓는것 
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(bus);
		driver.drive(taxi);
	}

}
