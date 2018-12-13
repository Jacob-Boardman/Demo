
public abstract class Vehicle 
{
	private int ID;
	private int wieght;
	private int CO2Emmision;
	private String colour;
	private String license;
	
	Vehicle (int weight, int CO2Emmision, String colour, String license, int ID)
	{
		this.wieght = weight;
		this.CO2Emmision = CO2Emmision;
		this.colour = colour;
		this.license = license;
		this.ID = ID;
	}
	
	public int getWieght() {
		return wieght;
	}

	public void setWieght(int wieght) {
		this.wieght = wieght;
	}

	public int getCO2Emmision() {
		return CO2Emmision;
	}

	public void setCO2Emmision(int cO2Emmision) {
		CO2Emmision = cO2Emmision;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getLicense() {
		return license;
	}

	public void setLicense(String license) {
		this.license = license;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}
	
	
}
