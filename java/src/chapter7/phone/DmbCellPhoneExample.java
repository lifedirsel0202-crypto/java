package chapter7.phone;

public class DmbCellPhoneExample {

	public static void main(String[] args) {

		
		DmbCellPhone dmbCellPhon = new DmbCellPhone("자바폰","검정",10);
	//	CellPhone cellphone = new CellPhone();
		
		
		System.out.println("모델" + dmbCellPhon.model);
		System.out.println("색상" + dmbCellPhon.color);
	
		System.out.println("채널"+ dmbCellPhon.channel);
		
		dmbCellPhon.powerOn();
		dmbCellPhon.bell();
		dmbCellPhon.sendvoice("여보세요");
		dmbCellPhon.reciveVoice("안녕하세요! 저는 홍길동인데요.");
		dmbCellPhon.sendvoice("아~예 반갑습니다.");
		dmbCellPhon.hangUp();
		
		
		dmbCellPhon.turnOnDmb();
		dmbCellPhon.changeChannelDmb(0);
		dmbCellPhon.turnOffDmb();

}
}