
public class Boat extends Vehicle 
{
	private boolean hasAnchor;	
	private int weightOfAnchor;

	public Boat(int weight, int CO2Emmision, String colour, String license, int ID, boolean hasAnchor, int weightOfAnchor) 
	{
		super(weight, CO2Emmision, colour, license, ID);
		this.hasAnchor = hasAnchor;
		this.weightOfAnchor = weightOfAnchor;
	}
	
	public void calcBill()
	{
		int bill;
		bill = 200 + getWieght() - getCO2Emmision() + getWeightOfAnchor()*2;
		System.out.println("Your " + getClass().getSimpleName()+ " ID is "  + getID() + " and your bill comes to £" + bill);
	}

	public boolean isHasAnchor() {
		return hasAnchor;
	}

	public void setHasAnchor(boolean hasAnchor) {
		this.hasAnchor = hasAnchor;
	}

	public int getWeightOfAnchor() {
		return weightOfAnchor;
	}

	public void setWeightOfAnchor(int weightOfAnchor) {
		this.weightOfAnchor = weightOfAnchor;
	}
	
	@Override
	public String toString() {
		return "Vehicle ID=" + getID() + ", Wieght=" + getWieght() + ", CO2Emmision=" + getCO2Emmision() + ", Colour=" + getColour()
				+ ", License=" + getLicense() + ", Has an anchor=" + hasAnchor + ", weight of Anchor= " + weightOfAnchor;
	}

}
