package actores;

import java.util.ArrayList;

import criterios.Criterio;

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
	public abstract ArrayList<String> getIdiomas();
	public abstract ArrayList<String> getInstrumentos();
	public abstract ArrayList<Equipo> getParticipantes(Criterio criterio);
	
}
