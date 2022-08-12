package pro01;

public class IronMan {
	String name;
	int power;
	int speed;
	String powerup;
	
	IronMan(){
	
	}
	
	IronMan(String name, int power){
		this(name,power,250);
		
	}

	IronMan(String name, int power, int speed){
		this.name = name;
		this.power = power;
		this.speed = speed;
	}

	
	

}
