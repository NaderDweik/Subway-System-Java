package objectorinted;




class TitleWinner extends Driver {
	 
	 private int rank;
	 private String prize;
 	 
	public TitleWinner() {   //default constructor 

	}

	public TitleWinner(String FName, String SName, int rank, String prize) {
		super(FName, SName);
		this.rank = rank;
		this.prize = prize;
	}
	

	public int getRank() {                   //getters and sitters
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public String getPrize() {
		return prize;
	}

	public void setPrize(String prize) {
		this.prize = prize;
	}

	//author: NaderDweik
	
	
	
}



	
	 
	 
	 
	 