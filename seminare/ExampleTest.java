class ExampleTest {

	public static void main(String[] args) {
		int n = 1;
		n = Example.zvetsOJednicku(n);
		if(n == 2) {
			System.out.println("Zv��en� o jedna prob�hlo spr�vn� (o�ek�v�no 2, vr�ceno "+n+").");
		}else {
			System.out.println("Zv��en� o jedna neprob�hlo spr�vn� (o�ek�v�no 2, vr�ceno "+n+").");
		}
		
		Example.zvysPocetPrubehu();
		n = Example.zvysPocetPrubehu();
		if(n == 2) {
			System.out.println("Po�et pr�b�h� souhlas� (o�ek�v�no 2, vr�ceno "+n+").");
		}else {
			System.out.println("Po�et pr�b�h� nesouhlas� (o�ek�v�no 2, vr�ceno "+n+").");
		}
		
	}
}