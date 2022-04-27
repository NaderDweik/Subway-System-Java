package lab6;

public class Car {

	//1
	
	Car(){
		
		System.out.println("constructor");
	}
	//2
	Car( String co , int num){
		
		setColor(co);
		plateNumber = num;
	}
	//3
     Car(int num , String co ){
		
		setColor(co);
		
		plateNumber = num;
	}
     //4
     Car(String co){
 	}
     //5
     Car(int num){
  		
  	} 
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	private String color;
	public int plateNumber;
	public Object String () {
		
		return null;
	}
	
}
