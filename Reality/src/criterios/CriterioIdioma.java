package criterios;
import home.*;

import java.util.ArrayList;
public class CriterioIdioma extends Criterio{
	private ArrayList<String> idiomas;

	public CriterioIdioma(ArrayList<String> idiomas){
		this.idiomas = idiomas;
	}
	public Boolean cumpleCriterio(Participante participante){
		if(participante.getIdiomas().containsAll(idiomas)){
			if(getSiguienteCriterio()!=null){
				getSiguienteCriterio().cumpleCriterio(participante);
			}
			return true;
		}
		return false;
	}

}