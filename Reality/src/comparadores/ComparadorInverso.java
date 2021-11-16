package comparadores;

import java.util.Comparator;

import actores.Equipo;

public class ComparadorInverso implements Comparator<Equipo>{
	
	private Comparator<Equipo> c;
	
	public ComparadorInverso(Comparator<Equipo> comparador) {
		this.c = comparador;
	}

	public int compare(Equipo p1, Equipo p2) {
		return c.compare(p2, p1);
	}
}
