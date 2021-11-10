package comparadores;

import java.util.Comparator;

import actores.Equipo;

public class ComparadorCompuesto implements Comparator<Equipo>{
	private Comparator<Equipo> c1;
	private Comparator<Equipo> c2;
	
	public ComparadorCompuesto(Comparator<Equipo> c1, Comparator<Equipo> c2) {
		this.c1 = c1;
		this.c2 = c2;
	}

	public int compare(Equipo p1, Equipo p2) {
		int primeraComparacion;
		primeraComparacion = c1.compare(p1, p2);
		if(primeraComparacion == 0)
			return c2.compare(p1, p2);
		return primeraComparacion;
	}
}
