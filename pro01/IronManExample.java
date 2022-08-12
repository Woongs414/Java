package pro01;

public class IronManExample {

	public static void main(String[] args) {
		IronMan hero = new IronMan("아이언맨",40);
		System.out.println("hero의 이름은: " + hero.name);
		System.out.println(hero.name + "의 파워는 : "+ hero.power );
		System.out.print("속도는 : "+ hero.speed);
		
		System.out.println();
		
		IronMan enemy = new IronMan("헐크", 80, 300) ;
		System.out.println("enemy의 이름은: " + enemy.name);
		System.out.println(enemy.name + "의 파워는 : "+ enemy.power);
		System.out.print("속도는 : "+ enemy.speed);
		
		System.out.println();
		
		IronMan upgrade = new IronMan("가즈아",30);
		System.out.println(upgrade.name);
		System.out.print("파워" + upgrade.power + "증가");
		
		System.out.println();
		
		IronMan victory = new IronMan();
		System.out.println(victory.name = "아이언맨 \\파워업\\");
		System.out.print(victory.powerup = "아이언맨 \"승리\"");

	}

}
