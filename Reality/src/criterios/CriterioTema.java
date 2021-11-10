package criterios;

import actores.Equipo;
import canal.Tema;

public class CriterioTema extends Criterio{
	private Tema t;
	
	public CriterioTema(Tema t) {
		this.t = t;
		
	}

	@Override
	public boolean cumple(Equipo p) {
		return this.t.aceptaInterprete(p);
	}
}
