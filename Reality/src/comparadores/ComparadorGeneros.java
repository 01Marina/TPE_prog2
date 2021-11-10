package comparadores;

import java.util.Comparator;

import actores.Equipo;

public class ComparadorGeneros implements Comparator<Equipo>{
	
	public int compare(Equipo p1, Equipo p2) {
		return p1.getGenerosMusicales().size() - p2.getGenerosMusicales().size();
	}
	
}
