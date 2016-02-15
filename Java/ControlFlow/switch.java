public class TestPad{


	public static void main(String[] args){

		UtilClass util = new UtilClass();
		int year = Integer.parseInt(args[0]);
		System.out.println("The ans is " + util.isLeapYear(year));

		System.out.println("Checking to see the month code....");

		int letMonthInt = Integer.parseInt(args[1]);
		String monthCodeValue = util.monthCode(letMonthInt);

		if(monthCodeValue == null){
			System.out.println("The Error code is wrong");
		}else{
			System.out.println("The month code for the value " + args[1] + " is " + monthCodeValue);
		}
		


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

		String name = null;
		switch(monthCode) {

			case 1: name = "January";
					break;
			case 2: name = "February";
					break;
			case 3: name = "March";
					break;
			case 4: name = "April";
					break;
			case 5: name = "May";
					break;
			case 6: name = "June";
					break;
			case 7: name = "July";
					break;
			case 8: name = "August";
					break;
			case 9: name = "September";
					break;
			case 10: name = "October";
					break;
			case 11: name = "November";
					break;
			case 12: name = "December";
					break;
		}

		return name;


	}
} 

