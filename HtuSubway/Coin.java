package HtuSubway;

import java.util.ArrayList;

public class Coin extends Collectables {
	
	static ArrayList <Coin> coinsArray=new ArrayList <Coin>();
	private String place = "";
	public String getPlace() {
return place;

		
	}
	
	public void setPlace(String place ) {
		this.place = place;
		System.out.println("a coin is generated on "+ place);
	}
	
	
	static void addCoinToArrayz(Coin coin) {
		
		coinsArray.add(coin);
		
		
	}
	
	
	static void printCoin 

}
