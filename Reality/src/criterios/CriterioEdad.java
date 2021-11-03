package criterios;
import actores.Equipo;
import canal.*;

public class CriterioEdad extends Criterio{
	private int edadMinima;
	//constructores
	public CriterioEdad(int edad){
		this(edad, null);
	}
	public CriterioEdad(int edad, Criterio sigCriterio){
		super(sigCriterio);
		this.edadMinima = edad;
	}
	
	//get y set
	public int getEdadMinima() {
		return edadMinima;
	}
	public void setEdadMinima(int edadMinima) {
		this.edadMinima = edadMinima;
	}
	
	@Override
	public boolean loCumple(Equipo participante) {
		return participante.getEdad() >= edadMinima;
	}
}

