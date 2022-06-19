package objectorinted;



public class Main {

	public static void main(String[] args) {
		//create objects for each driver, set some of the information from the constructor 
		TitleWinner Drv1 = new TitleWinner ("Ahmad" , "Ahmad", 2, "25k");
		TitleWinner Drv2 = new TitleWinner("Mo", "salah", 3, "15k");
		TitleWinner Drv3= new TitleWinner("Ali", "mousa", 1, "50k");
		//set some information by getters
		Drv1.setAge(23);
		Drv2.setAge(33);
		Drv3.setAge(26);
		
		Drv1.setCountry("Sweden");
		Drv2.setCountry("Germany");
		Drv3.setCountry("Us");
		
		//print each driver information, using the getters and print statements
		System.out.println("Driver 1 Info:\n" + "Full Name: "+ Drv1.getFname()+ " " + Drv1.getSname()+ "\nAge: "+ Drv1.getAge()+ "\nNation:" +Drv1.getCountry() + "\nRank: "+ Drv1.getRank()+ "\nPrize:"+ Drv1.getPrize());
		
		System.out.println("\n\n"); //Organize purpose
		
		System.out.println("Driver 2 Info:\n" + "Full Name: "+ Drv2.getFname()+ " " + Drv2.getSname()+ "\nAge: "+ Drv2.getAge()+ "\nNation:" +Drv2.getCountry() + "\nRank: "+ Drv2.getRank()+ "\nPrize: "+ Drv2.getPrize());
		
		System.out.println("\n\n");//Organize purpose
		
		System.out.println("Driver 3 Info:\n" + "Full Name: "+ Drv3.getFname()+ " " + Drv3.getSname()+ "\nAge: "+ Drv3.getAge()+ "\nNation:" +Drv3.getCountry() + "\nRank: "+ Drv3.getRank()+ "\nPrize:"+ Drv3.getPrize());
		
		
		
		
		
		
		
	
	
		//author: NaderDweik
	
		
		
	
	}

}