
public class Main {

	public static void main(String[] args) {

		Auto auto1 = new Auto();
		auto1.merkki = "Lincoln";
		auto1.malli = "Town Car";
		auto1.bensanMaara = 60;
		auto1.naytaTiedot();
		auto1.kiihdyta();
		auto1.jarruta();
		auto1.naytaTiedot();
		auto1.tankkaa(10);

	}

} // Main luokan lopetus

class Auto {

	//Määritellään attribuutit
	public String merkki;
	public String malli;
	public int bensanMaara;

	//Määritellään metodit
	public void jarruta() {

		System.out.println("Auto jarruttaa\n");

	}

	public void kiihdyta() {

		if (bensanMaara <= 0) {

			System.out.println("Auto ei enää liiku. Polttoaineen määrä täytyy olla suurempi kuin 0 litraa");

		} else {

			System.out.println("Auto kiihtyy\n");
			bensanMaara--;
		}
	}

	public void naytaTiedot() {

		System.out.println("Merkki: " + merkki + "\n" + "Malli: " + malli + "\n" + "Polttoaineen määrä (bensa): " + bensanMaara + " litraa" + "\n");

	}
	
	public void tankkaa(int tankkaus) {
		
		
		System.out.println("Tankissa polttoainetta: " + bensanMaara + " litraa");
		System.out.println("Tankkaus: " + tankkaus + " litraa");
		System.out.println("Tankissa polttoainetta tankkauksen jälkeen: " + (bensanMaara + tankkaus) + " litraa");
	}

}
