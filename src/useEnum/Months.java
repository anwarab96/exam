package useEnum;

public class Months {

			Month month ;
			//public Month( Month month) {
				// TODO Auto-generated constructor stub
			//}

			public Months (Month month)
			{
				this.month = month;
				
			}
			
			public void giveMeTheMonth(){
				
				switch (month){
				
				case JANUARY:
								System.out.println("JANUARY is the first mont of the year");
								break;
								
				case FEBRUARY:
								System.out.println("FEBRUAY is the second month of the year");
								break;
				case MARCH: 
								System.out.println("MARCH is the third month of the year");
								break;
								
				case APRIL:				
								System.out.println("APRIL is the fourth month of the year");
								break;
								
				case MAY:				
								System.out.println("MAY is the fifth month of the year");
								break;
								
								
				case JUNE:				
								System.out.println("JUNE is the sixth month of the year");
								break;
								
				case JULY:				
								System.out.println("JULY is the seventh month of the year");
								break;
								
				case AUGUST:				
								System.out.println("AUGUST is the eighth month of the year");
								break;
								
				case SEPTEMBER:				
								System.out.println("SEPTEMBER is the ninth month of the year");
								break;
								
				case OCTOBER:				
								System.out.println("OCTOBER is the tenth month of the year");
								
								break;
				case NOVEMBER:				
								System.out.println("NOVEMBER is the eleventh month of the year");
								break;
								
								
				case DECEMBER:				
								System.out.println("DECEMBER is the twelveth month of the year");
								
								break;
								
				default:				
								System.out.println("This is not  the name of the motnth");
								break;
				}
								
								
								
								
								
				}
			}

