
public class TowerBuildingBuilder implements BuildingBuilder {
	private Building building;
	
	public TowerBuildingBuilder()
	{
		building=new Building();
	}
	
	@Override
	public void buildBuildingType()
	{
		building.setType("Tower");
	}
	
	@Override
	public void buildFloors()
	{
		building.setFloors(12);
	}
	
	@Override
	public Building getBuilding()
	{
		return building;
	}

}
