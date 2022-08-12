package pro01;

public class ChangeFromStaticToInstance {
	 String nation = "코리아";
	 int gdp;
	 
	 ChangeFromStaticToInstance(){
		 this("한국",30);
	 }
	 ChangeFromStaticToInstance(String nation){
		 this(nation,50);
	 }
	 
	 ChangeFromStaticToInstance(String nation, int gdp){
		 this.nation = nation;
		 this.gdp = gdp;
	 }
	
	int plus(int x , int y) {
		return x + y;
	}

	int minus(int x , int y) {
		return x - y;
	}
	
}
