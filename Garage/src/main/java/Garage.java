import java.util.ArrayList;

public class Garage 
{
	ArrayList<Vehicle> garage = new ArrayList<>();
	
	public void addVehicle(Vehicle vehicle)
	{
		garage.add(vehicle);
	}
	
	public void removeVehicle(int ID)
	{
		garage.removeIf(g -> ID == g.getID());
	}
	
	public void emptyGarage()
	{
		garage.clear();
	}
	
	public void calcBill()
	{
		for (Vehicle v : garage)
		{
			if(v instanceof Car)
			{
				((Car)v).calcBill();
			}
			if(v instanceof Boat)
			{
				((Boat)v).calcBill();
			}
			if(v instanceof Blimp)
			{
				((Blimp)v).calcBill();
			}
		}			
	}

	@Override
	public String toString() {
		return "Garage=" + garage;
	}
	
	public ArrayList<Vehicle> getGarage() {
		return garage;
	}	
}
