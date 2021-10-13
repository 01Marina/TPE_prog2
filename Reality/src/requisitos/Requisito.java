package requisitos;
import java.util.ArrayList;

import actores.Participante;
import canal.*;

public abstract class Requisito {
	private Requisito siguienteRequisito;
	protected ArrayList<String> requerimientos;
	public abstract boolean cumple(Participante participante);

	//constructor
	public Requisito(Requisito req) {
		this.setSiguienteRequisito(req);
	}

	//get y set
	public Requisito getSiguienteRequisito() {
		return siguienteRequisito;
	}
	public void setSiguienteRequisito(Requisito siguienteRequisito) {
		this.siguienteRequisito = siguienteRequisito;
	}

	public boolean cumpleTodo(Participante participante) {
		if(this.cumple(participante)) {
			if(this.siguienteRequisito != null) {
				this.getSiguienteRequisito().cumpleTodo(participante);
			}
			return true;
		}
		return false;
	}

}
