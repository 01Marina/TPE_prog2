package criterios;

import actores.Equipo;
public class CriterioInstrumento extends Criterio{
	private String instrumento;
	//constructores
	public CriterioInstrumento(String instrumento){
		this.instrumento = instrumento;
	}
	@Override
	public boolean cumple(Equipo p) {
		return p.getInstrumentos().contains(this.instrumento);
	}

}
