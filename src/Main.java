
public class Main {

	public static void main(String[] args) {
		
		Auto auto1 = new Auto();
		auto1.merkki = "Lincoln";
		auto1.malli = "Town Car";
		auto1.bensanMaara = 60;
		auto1.naytaTiedot();
		auto1.kiihdyta();
		auto1.naytaTiedot();



	}

} // Main luokan lopetus

class Auto {
	
	public String merkki;
	public String malli;
	public int bensanMaara;
	
	public void jarruta() {
		
		System.out.println("Auto jarruttaa");
		
	}
	
	public void kiihdyta() {
		
		System.out.println("Auto kiihtyy");
		bensanMaara--;
		
	}
	public void naytaTiedot() {
		
		System.out.println("Merkki: " + merkki + "\n" + "Malli: " + malli + "\n" + "Polttoaineen määrä (bensa): " + bensanMaara + " litraa" + "\n");
		
		
		
	}
	
	

	
	
	
	
}
