
public class Coche {
	
	private int numPuertas;
	
	public Coche() {
		numPuertas = 0;
	}
	
	public int getPuertas() {
		return numPuertas;
	}
	
	public void agregarPuerta() {
		numPuertas++;
	}
	
	public static void main(String[] args) {
		Coche miCoche = new Coche();
		miCoche.agregarPuerta();
		System.out.println(miCoche.getPuertas());
	}

}
