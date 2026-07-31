package chae;

public class Tier {
	//필드
	public int maxRocation;  //최대 회전수
	public int accmulatedRocation;  //누적회전수
	public String location;  //타어이의 위치
	
	
	
	//생성자
	public Tier (String location, int maxRocation) {
		this.location = location;  //객체생성 타이어위치
		this.maxRocation = maxRocation; //최대회전수
		}
	
	
	public boolean roll() {
		++accmulatedRocation;//누적횟수 1회증가
		//정상회전 (누적<최대) 일 경우 실행
		if (accmulatedRocation<maxRocation) {
			System.out.println(location + "Tier 수명 : "+ (maxRocation - accmulatedRocation)+"회");
			return true;
			//펑크 (누적=최대) 일경우 실행
		}else { 
			System.out.println("***"+location + "Tier 펑크***");
		return false;
	} 
	
	}
}
