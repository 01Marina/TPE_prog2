package actores;
import java.util.ArrayList;
import java.util.Collections;
import aptitudes.*;
import criterios.Criterio;

public class Coach_Jurado{
	
	protected ArrayList<Participante> equipo;

	public Coach_Jurado(){
		equipo = new ArrayList<Participante>();
	}
	
	//retorna lista de todos los instrumentos/idioma q el equipo domina
	public ArrayList<String> getListaAptitudes(Aptitud aptitud){
		//recorro equipo-si instrum on esta en nueva lista add
		ArrayList<String> lista = new ArrayList<String>();
		for(Participante participante: equipo){
			for(String apt: aptitud.getAptitud(participante)){
				if(!lista.contains(apt)){
					lista.add(apt);
				}
			}
		}
		return lista;
	}
	
	public void addIntegrante(Participante participante) {
		this.equipo.add(participante);
	}

	public void ordenarLista(ArrayList<String> lista){
		Collections.sort(lista);
	}

	public ArrayList<String> getAptitudGeneros(){
		ArrayList<String> lista = getListaAptitudes(new AptitudGeneros());
		ordenarLista(lista);
		return lista;
	}
	public ArrayList<Participante> getEquipo(){

		return new ArrayList<Participante>(equipo);
	}


	public double promedioEdadEqupo(){
		int sumaEdades = 0;
		double promedio;
		for(Participante participante: equipo){
			sumaEdades += participante.getEdad();
		}
		promedio = sumaEdades/equipo.size();
		return promedio;
	}


	//COSAS DE JURADO-----------------------------------------
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
