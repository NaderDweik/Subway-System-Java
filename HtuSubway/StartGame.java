package HtuSubway;

public class StartGame {
	
	public void StartTheGame() {
		System.out.println("the game started ...");
		Player.run();
		Gaurd.run();
		
		Train train1=new Train();
		train1.setId(1);
		train1.setMovingState(false);
		
		Train train2=new Train();
		train1.setId(2);
		train1.setMovingState(true);
		
		
		Coin coin1=new Coin();
		coin1.setPlace("right");
		Coin.addCoinToArrayz(coin1);
		
		
		Coin coin2=new Coin();
		coin1.setPlace("right");
		Coin.addCoinToArrayz(coin2);
		
		
		Coin coin3=new Coin();
		coin1.setPlace("right");
		Coin.addCoinToArrayz(coin3);
		
		
		
		
	}

}
