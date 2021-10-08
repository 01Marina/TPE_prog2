package criterios;
import home.*;

import java.util.ArrayList;
public class CriterioInstrumento extends Criterio{
	private ArrayList<String> instrumentos;

	public CriterioInstrumento(ArrayList<String> inst){
		this.instrumentos = inst;
	}
	public Boolean cumpleCriterio(Participante participante){
		if(participante.getInstrumentos().containsAll(instrumentos)){
			if(getSiguienteCriterio()!=null){
				getSiguienteCriterio().cumpleCriterio(participante);
			}
			return true;
		}
		return false;
	}

}
