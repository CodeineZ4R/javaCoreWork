
public class Radio implements ElectricytiCostomer {

	void radioOn() {
		System.out.println("music on");
	}
	@Override
	public void electricytiOn() {
		radioOn();
		
	}

}
