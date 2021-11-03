package actores;
import java.util.ArrayList;
import java.util.Collections;
import aptitudes.*;
import criterios.Criterio;

public class Coach_Jurado{
	//exigente pide a cada personita o a cada elementoEquipo
	protected ArrayList<Equipo> equipo;
	
	//PRIMERA PARTE------------------
	public Coach_Jurado(){
		equipo = new ArrayList<Equipo>();
	}
	
	//retorna lista de todos los instrumentos/idioma q el equipo domina
	public ArrayList<String> getListaAptitudes(Aptitud aptitud){
		//recorro equipo-si instrum on esta en nueva lista add
		ArrayList<String> lista = new ArrayList<String>();
		for(Equipo participante: equipo){
			for(String apt: aptitud.getAptitud(participante)){
				if(!lista.contains(apt)){
					lista.add(apt);
				}
			}
		}
		return lista;
	}
	
	public void addIntegrante(Equipo participante) {
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
	public ArrayList<Equipo> getEquipo(){

		return new ArrayList<Equipo>(equipo);
	}


	public double promedioEdadEqupo(){
		int sumaEdades = 0;
		double promedio;
		for(Equipo participante: equipo){
			sumaEdades += participante.getEdad();
		}
		promedio = sumaEdades/equipo.size();
		return promedio;
	}


	//COSAS DE JURADO-----------------------------------------
	//elige 1 de los integrantes aptos a batallar
	
	public Equipo participanteElejido(Criterio criterio){
		ArrayList<Equipo> participantes = getParticipantesSegunCriterio(criterio);
		if(participantes.size()>0) 
			return participantes.get(0);
		else return null;
	}
	
		/*////AS� ERA ANTES////
		 * public Equipo participanteElejido(Criterio criterio, ArrayList<Equipo> arrayList){
			if(getParticipanteSegunCriterio(criterio, arrayList).size()>0) 
				return getParticipanteSegunCriterio(criterio, arrayList).get(0);
			else return null;
		}*/
		
		public ArrayList<Equipo> getParticipantesSegunCriterio(Criterio criterio){
			ArrayList<Equipo> participantesABatallar = new ArrayList<>();
			for(Equipo participante: this.equipo){
				if(criterio.cumpleCriterio(participante)){
					participantesABatallar.add(participante);
				}
			}
			return participantesABatallar;
		}
		
		public boolean cumpleRequisitos(Equipo participante) {
			return true;
		}

}
