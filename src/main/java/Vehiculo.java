package vehiculos;
/*import java.util.ArrayList;*/

public class Vehiculo {
	protected String placa;
	protected int puertas;
	protected int velocidadMaxima;
	protected String nombre;
	protected int precio;
	protected int peso;
	protected String traccion;
	protected Fabricante fabricante;
	private static int cantidadVehiculos = 0;
	
	public Vehiculo() {
		super();
	}
	
	
	public Vehiculo(String placa, int puertas, int velocidadMaxima, String nombre, int precio, int peso, String traccion, Fabricante fabricante) {
		this.setPlaca(placa);
		this.puertas = puertas;
		this.velocidadMaxima = velocidadMaxima;
		this.setNombre(nombre);
		this.setPrecio(precio);
		this.setPeso(peso);
		this.traccion = traccion;
		this.setFabricante(fabricante);
		setCantidadVehiculos(getCantidadVehiculos() + 1);
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public Fabricante getFabricante() {
		return fabricante;
	}

	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}


	public static int getCantidadVehiculos() {
		return cantidadVehiculos;
	}


	public static void setCantidadVehiculos(int cantidadVehiculos) {
		Vehiculo.cantidadVehiculos = cantidadVehiculos;
	}
	
	public static String vehiculosPorTipo() {
		return "Automoviles: "+ Automovil.getContA() +"\n"
		+"Camionetas: "+ Camioneta.getContCa() +"\n"
		+"Camion: "+ Camion.getContC();
	}
	

}
