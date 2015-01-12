
public class HospitalBuildingBuilder implements BuildingBuilder {
	private Building building;
	
	public HospitalBuildingBuilder()
	{
		building=new Building();
	}

	@Override
	public void buildBuildingType() 
	{
		building.setType("Hospital");
	}
	
	@Override
	public void buildFloors() 
	{
		building.setFloors(2);
	}
	
	@Override
	public Building getBuilding() 
	{
		return building;
	}
}
