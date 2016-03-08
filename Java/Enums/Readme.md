##Enums


Used for the predefined values

```````
public class TestPad {

	public static void main(String[] args) {

		DaysOfWeek myDay = DaysOfWeek.MONDAY;
		System.out.println("The enum value is " + myDay);

	} 
}


enum DaysOfWeek {
	MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
}



```````


###We cannot extend an Enum

1. The constructor for the enum cannot be public, it has to be **Private**



``````
public class TestPad {

	public static void main(String[] args) {

		DaysOfWeek myDay = DaysOfWeek.MONDAY;
		System.out.println("The enum value is " + myDay);
		System.out.println("The shortName for the same is " + DaysOfWeek.MONDAY.getShortName());
		System.out.println("The shortname for the same is " + myDay.getShortName());

	} 
}


enum DaysOfWeek {
	MONDAY("MON"), TUESDAY("TUE"), WEDNESDAY("WED"), THURSDAY("THU"), FRIDAY("FRI"), SATURDAY("SAT"), SUNDAY("SUN");

	private String shortName;

	private DaysOfWeek(String shortName){
		this.shortName = shortName;
	}

	public String getShortName(){
		return this.shortName;
	}
}




``````


###values

will give all the values in the enum


``````
		DaysOfWeek[] myValues = DaysOfWeek.values();
		System.out.println(myValues);

		for (DaysOfWeek x : myValues) {
			System.out.println("The values is " + x.getShortName());
		}


``````