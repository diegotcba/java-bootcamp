/**
 * @author DiegoT
 * 
 * This class is the combination of Singleton pattern and Factory pattern.
 * I applied the Factory pattern to encapsulate the creation of the many builder objects.
 * The Singleton is applied to get access to a single factory than create a object for every time i use it.
 * 
 *  
 */
public class BuildingBuilderFactory {
	private static BuildingBuilderFactory factory=null;
	
	private BuildingBuilderFactory()
	{
	
	}
	
	public static BuildingBuilderFactory getInstance()
	{
		if (factory==null)
		{
			factory=new BuildingBuilderFactory();
		}
		return factory;
	}
	
	public BuildingBuilder getBuildingBuilder(String buildingType)
	{
		if (buildingType.equals("House"))
		{
			return new HouseBuildingBuilder();
		}
		else if (buildingType.equals("Tower"))
		{
			return new TowerBuildingBuilder();
		}
		else
		{
			return new HospitalBuildingBuilder();
		}
	}
}
