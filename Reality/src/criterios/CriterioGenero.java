package criterios;

import actores.Equipo;
public class CriterioGenero extends Criterio{
	
	private String genero;
	
	public CriterioGenero(String genero){
		this.genero = genero;
	}
	
	@Override
	public boolean cumple(Equipo p) {
		return p.getGenerosMusicales().contains(this.genero);
	}

}
