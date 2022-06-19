package procedural;


public class Procedural {
    static void CalculateYourAge(int PresentDate, int PresentMonth,
                    int PresentYear, int BirthdayDate,
                    int BirthdayMonth, int BirthdayYear)
    {
        int month[] = { 31, 28, 31, 30, 31, 30, 31, //arrays that contain all months days in order.
                             31, 30, 31, 30, 31 };
 
        
      
      
        while (BirthdayDate > PresentDate) {  //if birth date is bigger than present date, do not count this month
            PresentMonth = PresentMonth - 1;
            PresentDate = PresentDate + month[BirthdayMonth - 1];   // add 30 to the date so as to subtract the date and get the remaining days
           
        }
 
      
        while (BirthdayMonth > PresentMonth) {  // if birth month greater than current month, do not count this year
            PresentYear = PresentYear - 1;
            PresentMonth = PresentMonth + 12;  //add 12 to the month so that we can subtract and find out the difference

        }
 
        // calculate date, month, year
        int CalculatedDay = PresentDate - BirthdayDate;
        int CalculatedMonth = PresentMonth - BirthdayMonth;
        int CalculatedYear = PresentYear - BirthdayYear;
        
        int RequiredDays = month[BirthdayMonth - 1]- CalculatedDay;
        int RequiredMonths = 12 -CalculatedMonth;
        int RequiredYears = 18-CalculatedYear;
        
 
        // print the present age
        System.out.println("Present Age");
        System.out.println(CalculatedYear +" Years, " +
              CalculatedMonth+ " Months and "+ CalculatedDay + " Days. ");
        
        if (CalculatedYear >= 18) {     //License should be for people who are 18 years old or more.
        System.out.println("You can get driver licence");
        }else {
        	
        	System.out.println("You can't get driver licence");
        	
        	System.out.println(" You need to wait another: "+ RequiredYears +" years " +RequiredMonths + " months and "+ RequiredDays+ " Days" );
        }
        
    }
    public static void main(String[] args)
    {
     //enter present information:
        int PresentDate = 17;
        int PresentMonth = 6;
        int PresentYear = 2022;
 
       //enter your birthday information
        int BirthdayDate = 19;
        int BirthdayMonth = 8;
        int BirthdayYear = 2004;
         
        // function call to print age
        CalculateYourAge(PresentDate, PresentMonth, PresentYear,
                BirthdayDate, BirthdayMonth, BirthdayYear);
 
       //author: NaderDweik
     
    }
}