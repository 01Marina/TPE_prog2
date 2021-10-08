package criterios;
import home.*;

import java.util.ArrayList;
public class CriterioGenero extends Criterio{
	private ArrayList<String> generos;

	public CriterioGenero(ArrayList<String> gen){
		this.generos = gen;
	}
	public Boolean cumpleCriterio(Participante participante){
		if(participante.getGenerosMusicales().containsAll(generos)){
			if(getSiguienteCriterio()!=null){
				getSiguienteCriterio().cumpleCriterio(participante);
			}
			return true;
		}
		return false;
	}

}
