package HtuSubway;

public class Player extends Human {
	
	String place="";
	
	public String getPlace() {
		
		return place;
				
	}

	public void setPlace(String place) {
		
		
		this.place=place;
	}
	
	
	
	void moveRight() {
		
		place ="right";
		System.out.println("player is right");
		
	}
	
	
void moveLeft() {
		
		place ="left";
		
		System.out.println("player is left");
				
		
	}

void collectCoin() {
	if (Coin.coinsArray.get(0).getPlace()==place ) {
		System.out.println("You collected a coin " );
		Coin.coinsArray.remove(0);
		
	}else {
		
		
	}
}
	
	
	
	
	

}
