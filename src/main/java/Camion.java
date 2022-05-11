package vehiculos;

public class Camion extends Vehiculo{
	private int ejes;
	private static int contC = 0;
	
	public Camion() {
		super();
	}
	
	public Camion(String placa, String nombre, int precio, int peso, Fabricante fabricante, int ejes) {
		super(placa, 2, 80, nombre, precio, peso, "4X2", fabricante);
		this.ejes = ejes;
		setContC(getContC() + 1);
	}

	public int getEjes() {
		return ejes;
	}

	public void setEjes(int ejes) {
		this.ejes = ejes;
	}

	public static int getContC() {
		return contC;
	}

	public void setContC(int contC) {
		Camion.contC = contC;
	}

}
