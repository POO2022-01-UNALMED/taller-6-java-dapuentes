package vehiculos;
import java.util.ArrayList;

public class Pais {
	private String nombre;
	private static ArrayList<Pais> contP = new ArrayList<>();
	/*private int size = contP.size();*/
	private int mayor = 0;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Pais(String nombre) {
		this.nombre = nombre;
		contP.add(this);
	}
	
	public int getMayor() {
		return mayor;
	}

	public void setMayor(int mayor) {
		this.mayor = mayor;
	}
	
	public static Pais paisMasVendedor() {
		
		for(int i = 0; i < contP.size(); i++) {
			Pais a = contP.get(i);
			Pais b = contP.get(i);
			if(b.getMayor() > a.getMayor()) {
				a = b;
			}
		}
		return a;
	}

}
