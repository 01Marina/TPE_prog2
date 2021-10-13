package criterios;
import java.util.ArrayList;

import actores.Participante;
import canal.*;
public class CriterioGenero extends Criterio{
	private ArrayList<String> generos;
	//add
	public void addGenero(String genero) {
		this.generos.add(genero);
	}
	//constructores
	public CriterioGenero(ArrayList<String> gen){
		this(gen, null);
	}
	public CriterioGenero(ArrayList<String> gen, Criterio sigCriterio){
		super(sigCriterio);
		this.generos = gen;
	}

	@Override
	public boolean loCumple(Participante participante) {
		return participante.getGenerosMusicales().containsAll(generos);
	}

}
