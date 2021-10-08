package criterios;
import home.*;

public class CriterioEdad extends Criterio{
	private int edadMinima;
	public CriterioEdad(int edad){
		this.edadMinima = edad;
	}
	public Boolean cumpleCriterio(Participante participante){
		if(participante.getEdad() >= edadMinima){
			if(getSiguienteCriterio()!=null){
				getSiguienteCriterio().cumpleCriterio(participante);
			}
			return true;
		}
		return false;
	}
}

