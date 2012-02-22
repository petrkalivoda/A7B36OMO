class ExampleTest {

	public static void main(String[] args) {
		int n = 1;
		n = Example.zvetsOJednicku(n);
		if(n == 2) {
			System.out.println("Zvýšení o jedna probìhlo správnì (oèekáváno 2, vráceno "+n+").");
		}else {
			System.out.println("Zvýšení o jedna neprobìhlo správnì (oèekáváno 2, vráceno "+n+").");
		}
		
		Example.zvysPocetPrubehu();
		n = Example.zvysPocetPrubehu();
		if(n == 2) {
			System.out.println("Poèet prùbìhù souhlasí (oèekáváno 2, vráceno "+n+").");
		}else {
			System.out.println("Poèet prùbìhù nesouhlasí (oèekáváno 2, vráceno "+n+").");
		}
		
	}
}