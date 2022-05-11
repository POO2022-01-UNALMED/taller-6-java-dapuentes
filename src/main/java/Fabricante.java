package vehiculos;

import java.util.ArrayList;

public class Fabricante {
	private String nombre;
	private Pais pais;
	private static ArrayList<Fabricante> contF = new ArrayList<>();
	private static int size = contF.size();
	private int mayor = 0;
	
	
	public Fabricante(String nombre, Pais pais) {
		this.setNombre(nombre);
		this.pais = pais;
		contF.add(this);
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Pais getPais() {
			return pais;
	}
	
	public void setPais(Pais pais) {
			this.pais = pais;
	}
	
	public ArrayList<Fabricante> getContP() {
		return contF;
	}

	public void setContP(ArrayList<Fabricante> contF) {
		Fabricante.contF = contF;
	}
	
	public int getMayor() {
		return mayor;
	}

	public void setMayor(int mayor) {
		this.mayor = mayor;
	}
	
	public static Fabricante fabricaMayorVentas() {
		Fabricante a = new Fabricante("cba", new Pais("abc"));
		for(int i = 0; i < size; i++) {
			Fabricante b = contF.get(i);
			if(b.getMayor() > a.getMayor()) {
				a = b;
			}
		}
		return a;
	}
		
}
