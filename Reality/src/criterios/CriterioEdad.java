package criterios;
import actores.Equipo;

public class CriterioEdad extends Criterio{
	
	private int edadMinima;

	public CriterioEdad(int edad){
		this.edadMinima = edad;
	}
	
	@Override
	public boolean cumple(Equipo p) {
		return p.getEdad() > this.edadMinima;
	}
	
}

