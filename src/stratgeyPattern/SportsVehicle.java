package stratgeyPattern;

import strategyClasses.SportsDriveStrategy;

public class SportsVehicle extends Vehicle {

	public SportsVehicle() {
		// TODO Auto-generated constructor stub
		super(new SportsDriveStrategy());
	}

}
