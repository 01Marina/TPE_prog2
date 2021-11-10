package comparadores;
import java.util.Comparator;

import actores.*;
public class ComparadorInstrumentos implements Comparator<Equipo>{
	
	public int compare(Equipo p1, Equipo p2) {
		return p1.getInstrumentos().size() - p2.getInstrumentos().size();
	}
	
}

