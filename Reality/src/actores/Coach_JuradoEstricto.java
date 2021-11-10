package actores;

import criterios.Criterio;
public class Coach_JuradoEstricto extends Coach_Jurado{
	private Criterio requisitos;
	
	public Coach_JuradoEstricto(Criterio requisitos) {
		this.requisitos = requisitos;
	}
	
	@Override
	public void addIntegrante(Equipo participante) {
		if(requisitos.cumple(participante))
			super.addIntegrante(participante);
	}
	
	public Criterio getRequisitos() {
		return requisitos;
	}

	public void setRequisitos(Criterio requisitos) {
		this.requisitos = requisitos;
	}
	
}
