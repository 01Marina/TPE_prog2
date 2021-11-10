package comparadores;

import java.util.Comparator;

import actores.Equipo;

public class ComparadorInverso implements Comparator<Equipo>{
	
	private Comparator<Equipo> c;
	
	public int compare(Equipo p1, Equipo p2) {
		return c.compare(p2, p1);
	}
}
