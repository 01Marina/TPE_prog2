package criterios;
import actores.Equipo;
import canal.*;

public class CriterioEdad extends Criterio{
	private int edadMinima;
	//constructores
	public CriterioEdad(int edad){
		this.edadMinima = edad;
	}
	@Override
	public boolean cumple(Equipo p) {
		return p.getEdad() > this.edadMinima;
	}
	
}

