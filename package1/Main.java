package package1;

import package2.Employee;

public class Main {

	public static void main(String[] args) {
		Student std1 = new Student(11111 , "ahmad");
		
		std1.setID(3230);
		std1.setName("ali");
		
		System.out.println( " id :" + std1.getID() + "  name :"+ std1.getName());
		Employee emp1 = new Employee ();
		
		String sub = "sc";
		std1.register(sub);

		
	}

}
