package stratgeyPattern;

import strategyClasses.SportsDriveStrategy;

public class OffRoadVehicle extends Vehicle {

	public OffRoadVehicle() {
		// TODO Auto-generated constructor stub
		super(new SportsDriveStrategy());
	}

}
