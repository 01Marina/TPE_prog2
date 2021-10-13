package comportamientoJurado;
import requisitos.*;
import actores.Participante;
import canal.*;
public class JuradoEstricto extends Jurado{
	private Requisito requisitos;
	
	public JuradoEstricto(Requisito requisitos) {
		this.requisitos = requisitos;
	}
	
	public boolean cumpleRequisito(Participante participante) {
		return requisitos.cumple(participante);
	}
	
	
	
	
	
}
