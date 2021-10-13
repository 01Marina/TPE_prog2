package comportamientoJurado;
import java.util.ArrayList;

import actores.Participante;
import canal.*;
import criterios.*;
public class Jurado {
	//elige 1 de los integrantes aptos a batallar
	public Participante participanteElejido(Criterio criterio, ArrayList<Participante> participantes){
		if(getParticipanteSegunCriterio(criterio, participantes).size()>0) 
			return getParticipanteSegunCriterio(criterio, participantes).get(0);
		else return null;
	}
	
	public ArrayList<Participante> getParticipanteSegunCriterio(Criterio criterio, ArrayList<Participante> participantes){
		ArrayList<Participante> participantesABatallar = new ArrayList<Participante>();
		for(Participante participante: participantes){
			if(criterio.cumpleCriterio(participante)){
				participantesABatallar.add(participante);
			}
		}
		return participantesABatallar;
	}
	
	public boolean cumpleRequisitos(Participante participante) {
		return true;
	}
}