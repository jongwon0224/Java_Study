package study.practice.test;

public class RoletteBranchMain {

	public static void main(String[] args) {
		
		Rolette r1 = new Rolette("R1", "Asan");

		RoletteMachine machineList = new RoletteMachine();
		
		machineList.addRolette(r1);
		
		machineList.startSales();
	}

}
