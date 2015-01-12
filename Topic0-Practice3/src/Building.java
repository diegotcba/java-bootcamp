
public class Building {
	
	private String buildingType;
	private int floors;
	
	public void setType(String buildingType)
	{
		this.buildingType=buildingType;
	}
	
	public void setFloors(int floors)
	{
		this.floors=floors;
	}
	
	public String toString()
	{
		return "Type: " + buildingType + ", Floors: " + floors;
	}

}
