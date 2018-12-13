
public class Blimp extends Vehicle 
{
	private int numOfPropellers;
	private int numOfLadders;

	public Blimp(int weight, int CO2Emmision, String colour, String license, int ID, int numOfPropellers, int numOfLadders) 
	{
		super(weight, CO2Emmision, colour, license,ID);
		this.numOfPropellers = numOfPropellers;
		this.numOfLadders = numOfLadders;
	}
	
	public void calcBill()
	{
		int bill;
		bill = 500 + getWieght() - getCO2Emmision() + getNumOfLadders()*5 + getNumOfPropellers()*10;
		System.out.println("Your " + getClass().getSimpleName()+ " ID is "  + getID() + " and your bill comes to £" + bill);
	}

	public int getNumOfPropellers() {
		return numOfPropellers;
	}

	public void setNumOfPropellers(int numOfPropellers) {
		this.numOfPropellers = numOfPropellers;
	}

	public int getNumOfLadders() {
		return numOfLadders;
	}

	public void setNumOfLadders(int numOfLadders) {
		this.numOfLadders = numOfLadders;
	}
	
	@Override
	public String toString() {
		return "Vehicle ID=" + getID() + ", Wieght=" + getWieght() + ", CO2Emmision=" + getCO2Emmision() + ", Colour=" + getColour()
				+ ", License=" + getLicense() + ", Number of Propellers=" + numOfPropellers + ", Number of Ladders= " + numOfLadders;
	}

}
