package sec06.exam02.mycompany;

import sec06.exam02.hankook.*;
import sec06.exam02.kumho.*;
import sec06.exam02.hyndai.*;


public class Car {
	//필드
	Engine engine = new Engine();
	SnowTire tire1 = new SnowTire();
	BigWidthTire tire2 = new BigWidthTire();

	//import안할시 아래처럼 입력해서 만들어줘야함
sec06.exam02.hankook.Tire tire3 = new sec06.exam02.hankook.Tire();
sec06.exam02.kumho.Tire tire4 = new sec06.exam02.kumho.Tire();	

}
