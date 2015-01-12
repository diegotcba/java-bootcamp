
public class DemoPractice3 {
	
	public static void main(String[] args)
	{		
		BuildingBuilder buildingBuilder=BuildingBuilderFactory.getInstance().getBuildingBuilder("House");
		BuildingDirector buildingDirector=new BuildingDirector(buildingBuilder);
		buildingDirector.constructBuilding();
		System.out.println("building is: " + buildingDirector.getBuilding());
		
		buildingBuilder=BuildingBuilderFactory.getInstance().getBuildingBuilder("Tower");
		buildingDirector=new BuildingDirector(buildingBuilder);
		buildingDirector.constructBuilding();
		System.out.println("building is: " + buildingDirector.getBuilding());	

		buildingBuilder=BuildingBuilderFactory.getInstance().getBuildingBuilder("Hospital");
		buildingDirector=new BuildingDirector(buildingBuilder);
		buildingDirector.constructBuilding();
		System.out.println("building is: " + buildingDirector.getBuilding());	
	}

}
