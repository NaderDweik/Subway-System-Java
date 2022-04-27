package lab6;

public class Main {

	public static void main(String[] args) {
		Car car1 = new Car();
		
		Car car2 = new Car("black",13907);
		
		Car car3 = new Car(12232,"red");
		
		System.out.println(car1.getColor());
		System.out.println(car2.getColor());
		
		System.out.println(car1.plateNumber);
		System.out.println(car2.plateNumber);
		
		System.out.println(car3.getColor());
		System.out.println(car3.plateNumber);

	}

}
