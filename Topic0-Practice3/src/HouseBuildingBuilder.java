
public class HouseBuildingBuilder implements BuildingBuilder {
	private Building building;
	
	public HouseBuildingBuilder()
	{
		building=new Building();
	}

	@Override
	public void buildBuildingType() 
	{
		building.setType("House");
	}
	
	@Override
	public void buildFloors()
	{
		building.setFloors(0);
	}
	
	@Override
	public Building getBuilding()
	{
		return building;
	}
}
