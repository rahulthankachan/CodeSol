public class TestPad{


	public static void main(String[] args){

		UtilClass util = new UtilClass();
		int year = Integer.parseInt(args[0]);
		System.out.println("The ans is " + util.isLeapYear(year));


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
} 

