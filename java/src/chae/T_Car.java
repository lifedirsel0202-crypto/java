package chae;

public class T_Car {

	Tier FrontRight = new Tier("앞 오른쪽" , 6);
	Tier FrontLeft = new Tier("앞 왼쪽" , 5);
	Tier BackRight = new Tier("뒤 오른쪽" , 4);
	Tier BackLeft = new Tier("뒤 왼쪽" , 6);
	
	
	int run() {
		System.out.println("자동차가 달립니다.");
		if (FrontRight.roll()==false) {stop(); return 1;}
		
		if (FrontLeft.roll()==false) {stop(); return 2;}
			
		if (BackLeft.roll()==false) {stop(); return 3;}
			
		if (BackRight.roll()==false) { stop(); return 4;}
			return 0;
		}
	
	void stop() {
		System.out.println("[자동차가 멈춥니다]");
	}
}
	


