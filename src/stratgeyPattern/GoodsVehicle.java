package stratgeyPattern;

import strategyClasses.NormalDriveStrategy;

public class GoodsVehicle extends Vehicle {

	public GoodsVehicle() {
		// TODO Auto-generated constructor stub
		super(new NormalDriveStrategy());
	}

}
