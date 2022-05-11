package package1;

public class Student {

	private int id;
	String name;
	
	Student (){
			
	}
	Student (int id ){
	
		this.setID(id);
	}
	Student (String name ){
		
		this.name = name;
	}
	
	Student (int id , String name ){
		
		this.setID(id) ;
		this.name = name;
	}
	
	void register(String course) {
		System.out.println(this.name + " register succesfully " + course );
		
	}
	public int getID() {
		return id;
	}
	void setID(int id) {
		this.id = id;
	
	}
	public String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	
	
}
