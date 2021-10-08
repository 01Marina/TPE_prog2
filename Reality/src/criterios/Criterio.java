package criterios;
import home.*;

public abstract class Criterio {
	private Criterio siguienteCriterio;
	public abstract Boolean cumpleCriterio(Participante participante);
	public void setSiguienteCriterio(Criterio sig){
		this.siguienteCriterio = sig;
	}
	public Criterio getSiguienteCriterio(){
		return siguienteCriterio;
	}
	/* public Criterio(){
 	this.siguienteCriterio = null;
 	}

 	public Criterio(Criterio siguienteCriterio){
    	this.siguienteCriterio = siguienteCriterio;
  	}
	 */
}//crear siguiente en contructor
//podemos abstraer codigo de cumpleCriterio
