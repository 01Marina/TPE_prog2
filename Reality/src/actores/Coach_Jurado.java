package actores;
import java.util.ArrayList;
import java.util.Collections;
import aptitudes.*;
import criterios.Criterio;

public class Coach_Jurado{
	//exigente pide a cada personita o a cada elementoEquipo
	//SE REPITE EN CLASE GRUPO
	protected ArrayList<Equipo> equipo;
	
	//PRIMERA PARTE------------------
	public Coach_Jurado(){
		equipo = new ArrayList<Equipo>();
	}
	//SE REPITE EN CLASE GRUPO
	public void addIntegrante(Equipo participante) {
		this.equipo.add(participante);
	}
	
	//SE REPITE EN CLASE GRUPO
	//retorna lista de todos los instrumentos/idioma q el equipo domina
	public ArrayList<String> getAptitudes(Aptitud aptitud){
		//recorro equipo-si instrum no está en la lista lo add
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
	//PREGUNTAR
	//hacerlo dinámico o hacer que solo los generos sean los ordenados?
	public ArrayList<String> getAptitudOrdenada(Aptitud aptitud){
		ArrayList<String> lista = getAptitudes(aptitud);
		Collections.sort(lista);
		return lista;
	}
	//SE REPITE EN CLASE GRUPO
	public ArrayList<Equipo> getEquipo(){
		return new ArrayList<Equipo>(equipo);
	}

	public double promedioEdad(){
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
	//PREGUNTAR
	//esta funsión deberia recibir cuantos participantes son requeridos para el tema
	public Equipo participanteElejido(Criterio criterio){
		ArrayList<Equipo> participantes = getParticipantes2(criterio);
		if(participantes.size()>0) 
			return participantes.get(0);
		else return null;
	}
		
	public ArrayList<Equipo> getParticipantes2(Criterio criterio){
		ArrayList<Equipo> participantesABatallar = new ArrayList<>();
		for(Equipo participante: this.equipo){
			ArrayList<Equipo> ee = participante.getParticipantes(criterio);
			participantesABatallar.addAll(ee);
		}
		return participantesABatallar;
	}
		
}
