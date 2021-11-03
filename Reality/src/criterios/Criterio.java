package criterios;
import actores.Equipo;
import actores.Participante;
import canal.*;

public abstract class Criterio {
	private Criterio siguienteCriterio;
	
	//constructores
 	public Criterio(Criterio siguienteCriterio){
    	this.siguienteCriterio = siguienteCriterio;
  	}
 	
 	//get y set
	public void setSiguienteCriterio(Criterio sig){
		this.siguienteCriterio = sig;
	}
	
	public Criterio getSiguienteCriterio(){
		return siguienteCriterio;
	}
	
	//metodo template q usa loCumple
	public boolean cumpleCriterio(Equipo participante){
		if(loCumple(participante)){
			if(getSiguienteCriterio()!=null){
				getSiguienteCriterio().cumpleCriterio(participante);
			}
			return true;
		}
		return false;
	}
	
	public abstract boolean loCumple(Equipo participante);
	

	
}
