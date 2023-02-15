package stratgeyPattern;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vehicle vehicle = new OffRoadVehicle();
		vehicle.drive();

		vehicle = new GoodsVehicle();
		vehicle.drive();

		vehicle = new SportsVehicle();
		vehicle.drive();

	}

}
