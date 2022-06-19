package binarytodecimatodigital;


public class BinaryToDecimalToDigital {
	public static int findDecimal(int binary){  
	    int Decimal = 0;  //neutral value
	    int Power = 1;
	    int Reamainder; //remainder(temporary value)
	    while(true){  
	      if(binary == 0){  //break the statement when the binary =0, because it will give you an infinity loo[
	        break;  
	      }
	      else {  
	          Reamainder = binary%10;  //get the remainder by divide the binary by 10
	          Decimal += Reamainder*Power;  //multiply the remainder by the power 
	          binary = binary/10;   //Divide the binary by 10
	          Power=Power*2;  //multiply the power by 2
	       }  
	   
	    }
	    return Decimal;
	}
	public static void main(String[] args) {
		
		int TheWantedNumber=11111111;// the number that we want to convert from binary to decimal and from decimal to digital
		System.out.println("The decimal form: "); 
		
		System.out.println(findDecimal(TheWantedNumber));  
		
		int	Number1=findDecimal(TheWantedNumber);  //Number1 is as same as the decimal number and as same as Number 2
		
		int degt;
		int Number2=Number1;
		int Counter=0;
		for(int i=1;i<=Number1;i=i*10) //we multiply by ten as the process of counting the digit of a decimal number
		{                                  // Example : 100 -> 1<100 check , 1*10 = 10 check - first digit 
			                               // -> 10<100 check , 10*1 <= 10 check -- second digits
			Counter++;                     //-> 100<=100 check,  100*10 = 1000 ------third digit
		}
		int Counter2=Counter;
		int[] arr=new int[Counter];
		//System.out.println(Counter); //how many digits in my decimal number 
		
		for(int i=1;i<=Number1;i=i*10)    
		{
			Counter--;
			degt=Number2%10;
			arr[Counter]=degt; //arrays that contain the digits.
			
		Number2=Number2/10;
				
		}
		System.out.println("\nThe degital form: "); 
		for(int i=0;i<Counter2;i++) {
			
			switch (arr[Counter]) { //switch and cases 
			
			case 0:                                                 //each case has her own print statement. 
				System.out.print(" __\n|  |\n|__|\n\n");
			break;
			case 1:
				System.out.print("|\n|\n\n");
			break;
			case 2:
				System.out.print(" __\n __|\n|__\n\n");
			break;
			case 3:
				System.out.print("__\n__|\n__|\n\n");
			break;
			case 4:
				System.out.print("|__|\n   |\n\n");
			break;
			case 5:
				System.out.print(" __\n|__\n __|\n\n"); 
			break;
			case 6:
				System.out.print(" __\n|__\n|__|\n\n");
			break;
			case 7:
				System.out.print("__\n  |\n  |\n\n");
			break;
			case 8:
				System.out.print(" __\n|__|\n|__|\n\n");
			break;
			case 9:
				System.out.print(" __\n|__|\n __|\n\n");
			break;
			}	
			Counter++;
		}
			
		
	//author: NaderDweik
	
	}

}
