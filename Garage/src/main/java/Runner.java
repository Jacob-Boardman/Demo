
public class Runner {

	public static void main(String[] args) {
		Garage garage = new Garage();

		Car audi = new Car(215, 55, "Grey", "2018 FGH", 0, 5);
		Car BMW = new Car(250, 70, "Blue", "2016 UAQ", 1, 4);

		Boat speedboat = new Boat(170, 40, "Red", "2015 UVE", 2, false, 0);
		Boat sailboat = new Boat(200, 0, "White", "1997 POP", 3, true, 60);

		Blimp blimp = new Blimp(450, 10, "Pink", "1936 IDE", 4, 1, 1);
		Blimp airship = new Blimp(555, 15, "Green", "1920 IUY", 5, 5, 4);

		garage.addVehicle(audi);
		garage.addVehicle(BMW);
		garage.addVehicle(speedboat);
		garage.addVehicle(sailboat);
		garage.addVehicle(blimp);
		garage.addVehicle(airship);

		garage.removeVehicle(2);

		garage.getGarage().stream().forEach(System.out::println);
		System.out.println();
		garage.calcBill();

		garage.emptyGarage();

	}

}
