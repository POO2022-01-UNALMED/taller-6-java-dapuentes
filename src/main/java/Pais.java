package vehiculos;
import java.util.ArrayList;

public class Pais {
	private String nombre;
	private static ArrayList<Pais> contP = new ArrayList<>();
	private static int size = contP.size();
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

	public ArrayList<Pais> getContP() {
		return contP;
	}

	public void setContP(ArrayList<Pais> contP) {
		Pais.contP = contP;
	}
	
	public int getMayor() {
		return mayor;
	}

	public void setMayor(int mayor) {
		this.mayor = mayor;
	}
	
	public static Pais paisMasVendedor() {
		Pais a = new Pais("abc");
		for(int i = 0; i < size; i++) {
			Pais b = contP.get(i);
			if(b.getMayor() > a.getMayor()) {
				a = b;
			}
		}
		return a;
	}

}
