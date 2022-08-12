package sec01.exam01;

public class DmbCellPhone extends CellPhone {
	//필드
	int channel;
	
	//생성자
	DmbCellPhone(String model, String color, int channel){
		this.model =model;
		this.color = color;
		this.channel = channel;
		
	}
	
	//메서드
	void turnOnDmb() {
		System.out.println("채널 " + channel + "번 DMB 방송수신 시작");
	}
	void changeChanelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널 " + channel+ "번으로 바꿉니다.");
				
	}
	void tunrOffDmb() {
		System.out.println("DMB 방송 수신 안합니다.");
	}
}
