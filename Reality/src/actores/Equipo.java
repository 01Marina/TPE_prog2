package actores;

import java.util.ArrayList;

public abstract class Equipo {
	protected String nombre;
	protected double edad;
	protected ArrayList<String> generosMusicales;
	protected ArrayList<String> idiomas;
	protected ArrayList<String> instrumentos;
	
	public Equipo(String nombre) {
		this.nombre = nombre;
		this.generosMusicales = new ArrayList<String>();
		this.idiomas = new ArrayList<String>();
		this.instrumentos = new ArrayList<String>();
	}
	//para participante
	public Equipo(String nombre, double edad, ArrayList<String> genMus, ArrayList<String> idiomas, ArrayList<String> instr) {
		this.instrumentos = new ArrayList<String>(instr);
		this.generosMusicales = new ArrayList<String>(genMus);
		this.idiomas = new ArrayList<String>(idiomas);
		this.nombre = nombre;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}
	
	public double getEdad() {
		return this.edad;
	}
	public void setEdad() {
		this.edad = obtenerEdad();
	}
	public void setGenerosMusicales() {
		this.generosMusicales = obtenerGenerosMusicales();
	}
	public abstract double obtenerEdad();//despue
	
	
	public abstract ArrayList<String> obtenerGenerosMusicales();
	
	
	public ArrayList<String> getGenerosMusicales() {
		return new ArrayList<String>(generosMusicales);
	}
	
	
	
	public boolean tengoGenero(String g) {
		return this.generosMusicales.contains(g);
	}
	/*



	public ArrayList<String> getIdiomas() {
		return new ArrayList<String>(idiomas);
	}

	public void setIdiomas(ArrayList<String> idiomas) {
		this.idiomas = idiomas;
	}

	public ArrayList<String> getInstrumentos() {
		return new ArrayList<String>(instrumentos);
	}

	public void setInstrumentos(ArrayList<String> instrumentos) {
		this.instrumentos = instrumentos;
	}
	
	*/
	
	
}
