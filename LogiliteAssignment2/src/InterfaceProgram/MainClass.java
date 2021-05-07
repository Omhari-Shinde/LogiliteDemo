package InterfaceProgram;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Car manufacture in first plants");
	      FirstPlant firstPlant = new FirstPlant();
	      firstPlant.CarFeatures();
	      firstPlant.isAutomatic();
	      firstPlant.highTechAC();
	      firstPlant.modelName();
	      
	      System.out.println("Car manufacture in Second plants");
	      SecondPlant secondPlant = new SecondPlant();
	      secondPlant.CarFeatures();
	      secondPlant.isAutomatic();
	      secondPlant.highTechAC();
	      secondPlant.modelName();
		

	}

}

