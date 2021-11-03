package criterios;
import java.util.ArrayList;

import actores.Equipo;
import canal.*;
public class CriterioIdioma extends Criterio{
	private ArrayList<String> idiomas;
	//add
	public void addIdioma(String idioma) {
		this.idiomas.add(idioma);
	}
	//constructores
	public CriterioIdioma(ArrayList<String> idiomas){
		this(idiomas, null);
	}
	public CriterioIdioma(ArrayList<String> idiomas, Criterio sigCriterio){
		super(sigCriterio);
		this.idiomas = idiomas;
	}
	@Override
	public boolean loCumple(Equipo participante) {
		return participante.getIdiomas().containsAll(idiomas);
	}

}