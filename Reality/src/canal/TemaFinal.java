package canal;

import java.util.ArrayList;

import actores.Equipo;
import criterios.CriterioInstrumento;

public class TemaFinal extends Tema{

	private int cantInterpretes;

	public TemaFinal(String titulo, String idioma, int cantInterpretes) {
		super(titulo, idioma);
		this.cantInterpretes = cantInterpretes;
	}

	@Override
	public boolean aceptaInterprete(Equipo p) {
		int contador = 0;
		if(super.aceptaInterprete(p)) {
			for(String i: this.instrumentosNecesarios) {
				ArrayList<Equipo> e = p.getParticipantes(new CriterioInstrumento(i));
				contador += e.size();
				if(contador >= this.cantInterpretes) {
					return true;
				}
			}
		}
		return false;
	}
}
