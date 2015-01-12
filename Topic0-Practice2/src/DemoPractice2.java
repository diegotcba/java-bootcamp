
public class DemoPractice2 {
	
	public static void main(String[] args)
	{
		BuildingBuilder buildingBuilder=new HouseBuildingBuilder();
		BuildingDirector buildingDirector=new BuildingDirector(buildingBuilder);
		buildingDirector.constructBuilding();
		System.out.println("building is: " + buildingDirector.getBuilding());
		
		buildingBuilder=new TowerBuildingBuilder();
		buildingDirector=new BuildingDirector(buildingBuilder);
		buildingDirector.constructBuilding();
		System.out.println("building is: " + buildingDirector.getBuilding());
		
	}

}
