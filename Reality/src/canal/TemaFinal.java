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
	
	public boolean aceptaInterprete(Equipo p) {
		boolean cumple = super.aceptaInterprete(p);
		if(this.cantInterpretes > 1) {
			return cumple && this.aceptaInterprete2(p);
		}
		return cumple && this.tocaAlmenosUnInstrumento(p);
	}
	
	public boolean aceptaInterprete2(Equipo p) {
		int contador = 0;
		for(String i: this.instrumentosNecesarios) {
			ArrayList<Equipo> e = p.getParticipantes(new CriterioInstrumento(i));
			contador += e.size();
			if(contador >= this.cantInterpretes) {
				return true;
			}
		}
		return false;
	}
	
	private boolean tocaAlmenosUnInstrumento(Equipo p) {
		boolean coicide = false;
		int i = 0;
		while(!coicide && i<this.instrumentosNecesarios.size()) {
			String instrumento = this.instrumentosNecesarios.get(i);
			coicide = p.getInstrumentos().contains(instrumento);
		}
		return coicide;
	}
}
