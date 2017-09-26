import java.util.ArrayList;;

public class Switcher {
	
	
	private ArrayList<ElectricytiCostomer> costomer = new ArrayList<>();
	
	void addElectricytiCostomer(ElectricytiCostomer cos) {
		
		costomer.add(cos);
	}
	
	void rmElectricytiCostomer(ElectricytiCostomer cos) {
		
		costomer.remove(cos);
	}
	
	
	void switcherOn() {
		
		System.out.println("Switcher on!");
		
		if (costomer != null) {
			
			for (ElectricytiCostomer cos :costomer ) {
				
				cos.electricytiOn();
			}
		}
		
	}
	
}