class Homework1Test {
	public static void main(String[] args) {
		Homework1 hw = new Homework1();
		int passCount = 0;
		
		if(hw.f()) {
			System.out.println("F() passed ("+ ++passCount  +"/3).");
		}
		
		if(hw.g() == -1) {
			System.out.println("G() passed ("+ ++passCount  +"/3).");
		}
		
		hw.h();
		hw.h();
		if(hw.h() == 2) {
			System.out.println("H() passed ("+ ++passCount  +"/3).");
		}
	}
}