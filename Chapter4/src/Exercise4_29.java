import java.util.Scanner;

public class Exercise4_29 {

	public static void main(String[] args) {
		
		// **START** Determine first day of year
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter year: (e.g., 2008): ");
		int year = input.nextInt();
		
		int month = 1;
		
		if (month == 1) {
			month = 13;
			year--;
		}
					
		int dayOfMonth = 1;
		
		int q = dayOfMonth;
		
		int m = month;
		
		int j = year / 100;
		
		int k = year % 100;
		
		int h = (q + ((26 * (m + 1)) / 10) + k + (k / 4) + (j / 4) + (5 * j)) % 7;
		
		String currentDay = "";
		
		switch (h) {
		case 0: 
			currentDay = "Saturday";
			break;
		case 1:
			currentDay = "Sunday";
			break;
		case 2:
			currentDay = "Monday";
			break;
		case 3:
			currentDay = "Tuesday";
			break;
		case 4:
			currentDay = "Wednesday";
			break;
		case 5:
			currentDay = "Thursday";
			break;
		case 6: 
			currentDay = "Friday";
		}
			
		//System.out.println("First day of year is " + currentDay);
		// **END** Determine first day of year
		
		// **START** Constructing Calendar		
		//Increment variable year for calendar printing
		year++;
		
		int newDay = 0;
		
		switch (currentDay) {
		case "Sunday":
			newDay = 0;
			break;
		case "Monday":
			newDay = 1;
			break;
		case "Tuesday":
			newDay = 2;
			break;
		case "Wednesday":
			newDay = 3;
			break;
		case "Thursday":
			newDay = 4;
			break;
		case "Friday":
			newDay = 5;
			break;
		case "Saturday":
			newDay = 6;
			break;
		}
		
		//System.out.print("...Which is equal to " + newDay);
		
		String newMonth = "";
		int numberOfDays = 0;
		
		for (int i = 1; i <= 12; i++) {
			switch (i) {
			case 1:
				newMonth = "January";
				numberOfDays = 31;
				break;
			case 2:
				newMonth = "Febuary";
				if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
					numberOfDays = 29;
				}
				else { 
					numberOfDays = 28;
				}
				break;
			case 3:
				newMonth = "March";
				numberOfDays = 31;
				break;
			case 4:
				newMonth = "April";
				numberOfDays = 30;
				break;
			case 5:
				newMonth = "May";
				numberOfDays = 31;
				break;
			case 6:
				newMonth = "June";
				numberOfDays = 30;
				break;
			case 7:
				newMonth = "July";
				numberOfDays = 31;
				break;
			case 8:
				newMonth = "August";
				numberOfDays = 31;
				break;
			case 9:
				newMonth = "September";
				numberOfDays = 30;
				break;
			case 10:
				newMonth = "October";
				numberOfDays = 31;
				break;
			case 11:
				newMonth = "November";
				numberOfDays = 30;
				break;
			case 12:
				newMonth = "December";
				numberOfDays = 31;
				break;
				
			}
			
		System.out.print("             " + newMonth + " " + year + "\n" +
			"-------------------------------------" + "\n" +
			"  " + "Sun" + "  " + "Mon" + "  " + "Tue" + "  " + "Wed" + "  " +
			"Thu" + "  " + "Fri" + "  " + "Sat" + "\n");
		
		int y = 0;
		
		for (y = 0; y < newDay; y++) {
			System.out.print("     ");
		}
		
		for (y = 1; y <= numberOfDays; y++) {
			if (y < 10) {
				System.out.print("    " + y);
			}
			else {
				System.out.print("   " + y);
			}
			
			if ((y + newDay) % 7 == 0) {
				System.out.println();
			}
				
		}
		
		System.out.println();
		System.out.println();
		
		newDay = (newDay + numberOfDays) % 7;
		}		
		// **END** Constructing Calendar			
	}
		
}
