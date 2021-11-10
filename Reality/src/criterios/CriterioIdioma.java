package criterios;

import actores.Equipo;
public class CriterioIdioma extends Criterio{
	private String idioma;
	//constructores
	public CriterioIdioma(String idioma){
		this.idioma = idioma;
	}
	@Override
	public boolean cumple(Equipo p) {
		return p.getIdiomas().contains(this.idioma);
	}

}