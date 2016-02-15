public class TestPad{


	public static void main(String[] args){

		UtilClass util = new UtilClass();
		int year = Integer.parseInt(args[0]);
		System.out.println("The ans is " + util.isLeapYear(year));

		System.out.println("Checking to see the month code....");

		int letMonthInt = Integer.parseInt(args[1]);
		String monthCodeValue = util.monthCode(letMonthInt);
		System.out.println("The month code for the value " + args[1] + " is " + monthCodeValue);


	}



}


class UtilClass{


	public boolean isLeapYear(int year){

		if (year % 400 == 0){
			return true;
		}
		else if ((year % 4 == 0) && (year % 100 != 0)) {
			return true;
		}
		else{
			return false;
		}
	}

	public String monthCode(int monthCode){
		String name = "";

		if (monthCode == 1){

			name = "January";
		}else if (monthCode == 2){
			name = "February";
		}else if (monthCode == 3){
			name = "March";
		}else if (monthCode == 4){
			name = "April";
		}else if (monthCode == 5){
			name = "May";
		}else if (monthCode == 6){
			name = "June";
		}else if (monthCode == 7){
			name = "July";
		}else if (monthCode == 8){
			name = "August";
		}else if (monthCode == 9){
			name = "September";
		}else if (monthCode == 10){
			name = "October";
		}else if (monthCode == 11){
			name = "November";
		}else if (monthCode == 12){
			name = "December";
		} else{
			name = "NOT FOUND"; /// WRONG INPUT
		}

		return name;


	}
} 

