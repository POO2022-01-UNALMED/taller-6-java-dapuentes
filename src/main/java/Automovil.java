package vehiculos;

public class Automovil extends Vehiculo{
	private int puestos;
	private static int contA = 0;
	
	public Automovil() {
		super();
	}
	
	public Automovil(String placa, String nombre, int precio, int peso, Fabricante fabricante, int puestos) {
		super(placa, 4, 100, nombre, precio, peso, "FWD", fabricante);
		this.puestos = puestos;
		setContA(getContA() + 1);
	}

	public int getPuestos() {
		return puestos;
	}

	public void setPuestos(int puestos) {
		this.puestos = puestos;
	}

	public static int getContA() {
		return contA;
	}

	public void setContA(int contA) {
		Automovil.contA = contA;
	}
}
