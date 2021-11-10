package comparadores;

import java.util.Comparator;

import actores.Equipo;

public class ComparadorEdades implements Comparator<Equipo>{

	public int compare(Equipo p1, Equipo p2) {
		int i = 0;
		if(p1.getEdad() > p2.getEdad()) 
			i = 1;			
		else if(p1.getEdad() < p2.getEdad()) 
			i = -1;
		return i;
	}
}
