package InterfaceEx;

public class FirstPlant implements NewCarModel {
	
	 
    Car car = new Car("BMW", true, "X5.0", 5.1f, "White", "Petrol", "260bhp", 5);
    
    public void CarFeatures()
    {
        System.out.println("Brand Name : "+ car.getCompany());
        System.out.println("Color of Car : "+ car.getColor());
        System.out.println("Power : "+ car.getPower());
        System.out.println("Fuel type : "+ car.getFuelType());
        System.out.println("No of Gears: " + car.getNumberOfGear());
    }
    
    @Override
    public void isAutomatic() 
    {
        System.out.println("Is this Car automatic : " + car.isAutomatic());
    }
    @Override
    public void modelName() 
    {
        System.out.println("Model name : " + car.getModelName());
    }
    @Override
    public void highTechAC() 
    {
        System.out.println("Model name : " + car.getHighTechAC());
    }

}
