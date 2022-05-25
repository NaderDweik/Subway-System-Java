package HtuSubway;

public class Train {
	
   private int id ;
   private String movingState;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getMovingState() {
	return movingState;
}
public void setMovingState(String movingState) {
	this.movingState = movingState;
}
   
   public void setMovingState(boolean movingState) {
	   
	   
	   if (movingState) {
		   
		   transport();
	   }
	   else {
		   
		   rigidTrain();
	   }
	   
   }
private void transport() {
	System.out.println("the train"+ id +"is moving ..");
	
}

private void rigidTrain() {
	System.out.println("the train"+ id +"is rigid ..");
	
}


   
   

}
