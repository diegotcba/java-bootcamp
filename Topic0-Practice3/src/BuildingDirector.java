
public class BuildingDirector {
	private BuildingBuilder buildingBuilder=null;
	
	public BuildingDirector(BuildingBuilder buildingBuilder)
	{
		this.buildingBuilder=buildingBuilder;
	}
	
	public void constructBuilding()
	{
		buildingBuilder.buildBuildingType();
		buildingBuilder.buildFloors();
	}
	
	public Building getBuilding()
	{
		return buildingBuilder.getBuilding();
	}
}
