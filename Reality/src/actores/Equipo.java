package actores;

import java.util.ArrayList;

public abstract class Equipo {
	protected String nombre;
	
	public Equipo(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}
	
	public abstract double getEdad();
	public abstract ArrayList<String> getGenerosMusicales();
///////////FALTAN RESOLVER EN CLASE GRUPO///////////////
	public abstract ArrayList<String> getIdiomas();
	public abstract ArrayList<String> getInstrumentos();
	
}
