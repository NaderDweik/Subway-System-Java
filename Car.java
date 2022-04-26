package lab5;

public class Car {
 
	String brand;
	String color;
	boolean electrical;
	int plateNumber;
	
	
	
	void StartEngine ()
	{
		System.out.println("Start eng");
		
	}
	
	void tilt(String dir)
	{
		if(dir == "right")
		System.out.println("go right");
		
		else if(dir == "left")
			System.out.println("go left");
	}
	void StopEngine ()
	{
		System.out.println("Stop eng");
		
	}
}
