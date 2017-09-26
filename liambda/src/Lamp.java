
public class Lamp implements ElectricytiCostomer{
	
	
	void lampOn() {
		System.out.println("Lamp on!");
		
	}

	@Override
	public void electricytiOn() {
		lampOn();
		
	}
	
	
}
