package lab5;

public class MainStudent {

	public static void main(String[] args) {
		
		Car car1= new Car ();
		Car car2 = new Car ();
		
		//Car1 attributes
		
		
		car1.brand = "Ford";
		car1.color = "black";
		car1.electrical = false;
		car1.plateNumber = 12121;
		
		//Car2 attributes
		car1.brand = "Bmw";
		car1.color = "Red";
		car1.electrical = true;
		car1.plateNumber = 343525;
		
		
		
		
         car1.StartEngine();
         car1.tilt("right");
         car1.tilt("left");
         car1.StopEngine();
     	
         
         car2.StartEngine();
         car2.tilt("right");
         car2.tilt("left");
         car2.StopEngine();
		
		
		Student std1 = new Student ();
		Student std2 = new Student ();
		
		
		std1.id = 21120060;
		std1.gender = "female";
		std1.name = "Zain";
		std1.scholar = true;
		
		
		
		std1.id = 21110034;
		std1.gender = "male";
		std1.name = "Zack";
		std1.scholar = false;
		
		
		if (std2.register("programming"))
			
		{
			System.out.println("registered successfully");
		}
		
		if (std1.register("Profissionaal practice"))
		{
			System.out.println("registered successfully");
			
		}
		
		if (std1.register("Networking"))
		{
			System.out.println("registered successfully");
			
		}
		
		else {
			
			System.out.println("rejected");
		}
		
		

}
}
