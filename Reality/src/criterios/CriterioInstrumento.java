package criterios;
import java.util.ArrayList;

import actores.Participante;
import canal.*;
public class CriterioInstrumento extends Criterio{
	private ArrayList<String> instrumentos;
	//add
	public void addInstrumento(String instrumento) {
		this.instrumentos.add(instrumento);
	}
	//constructores
	public CriterioInstrumento(ArrayList<String> instrumentos){
		this(instrumentos, null);
	}
	public CriterioInstrumento(ArrayList<String> instrumentos, Criterio sigCriterio){
		super(sigCriterio);
		this.instrumentos = instrumentos;
	}

	@Override
	public boolean loCumple(Participante participante) {
		return participante.getInstrumentos().containsAll(instrumentos);
	}

}
