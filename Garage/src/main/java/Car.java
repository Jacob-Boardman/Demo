
public class Car extends Vehicle 
{
	
	private int numOfSeatbelts;

	public Car(int weight, int CO2Emmision, String colour, String license, int ID, int numOfSeatbelts) 
	{
		super(weight, CO2Emmision, colour, license, ID);
		this.numOfSeatbelts = numOfSeatbelts;
		
	}
	
	public void calcBill()
	{
		int bill;
		bill = 100 + getWieght() - getCO2Emmision() + getNumOfSeabelts()*5;
		System.out.println("Your " + getClass().getSimpleName()+ " ID is "  + getID() + " and your bill comes to £" + bill);
	}

	public int getNumOfSeabelts() {
		return numOfSeatbelts;
	}

	public void setNumOfSeabelts(int numOfSeatbelts) {
		this.numOfSeatbelts = numOfSeatbelts;
	}

	@Override
	public String toString() {
		return "Vehicle ID=" + getID() + ", Wieght=" + getWieght() + ", CO2Emmision=" + getCO2Emmision() + ", Colour=" + getColour()
				+ ", License=" + getLicense() + ", Number of Seatbelts=" + numOfSeatbelts;
	}

}
