package pro01;

public class ChangeFromStaticToInstanceExample {

	public static void main(String[] args) {
		ChangeFromStaticToInstance c1
	  = new ChangeFromStaticToInstance();
		
		System.out.println(c1.nation);
		
		ChangeFromStaticToInstance c2 = new ChangeFromStaticToInstance("자메이카");
		System.out.println(c2.nation + c2.gdp);
		
		ChangeFromStaticToInstance c3 = new ChangeFromStaticToInstance("일본" , 20);
		System.out.println(c3.nation + c3.gdp);
	}

}