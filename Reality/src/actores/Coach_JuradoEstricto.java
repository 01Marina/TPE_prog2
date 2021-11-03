package actores;
import requisitos.*;
import canal.*;
public class Coach_JuradoEstricto extends Coach_Jurado{
	private Requisito requisitos;
	
	public Coach_JuradoEstricto(Requisito requisitos) {
		this.requisitos = requisitos;
	}
	
	
	//inutil creo
	/*public boolean cumpleRequisito(Participante participante) {
		return requisitos.cumple(participante);
	}*/
	
	
	@Override
	public void addIntegrante(Equipo participante) {
		if(requisitos.cumple(participante))
			super.addIntegrante(participante);
	}

	
	public Requisito getRequisitos() {
		return requisitos;
	}

	public void setRequisitos(Requisito requisitos) {
		this.requisitos = requisitos;
	}
	
	
	
	
}
