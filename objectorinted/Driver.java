package objectorinted;



public class Driver {
	private String fname;
	private String sname;
	private int Age;
	private String Country;

	
       public Driver() {
	                                  //default constructor
		
	              }
	
public Driver(String fname, String sname) { //constructor
	this.fname = fname;
	this.sname = sname;
}



	public String getFname() {              //getters and sitters
		return fname;
	}
	public String getSname() {    
		return sname;
	}


	
	
	
	public int getAge() {         // getters and sitters
		return Age;
	}

	public void setAge(int Age) {
		this.Age = Age;
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String Country) {
		this.Country = Country;
	}
	
	//author: NaderDweik
	
}