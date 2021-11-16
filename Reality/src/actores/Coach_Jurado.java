package actores;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import criterios.Criterio;

public class Coach_Jurado{
	
	protected ArrayList<Equipo> equipo;

	public Coach_Jurado(){
		equipo = new ArrayList<Equipo>();
	}

	public void addEquipo(Equipo participante) {
		this.equipo.add(participante);
	}

	public ArrayList<String> getIdiomas(){
		ArrayList<String> lista = new ArrayList<String>();
		for(Equipo participante: equipo){
			for(String apt: participante.getIdiomas()){
				if(!lista.contains(apt)){
					lista.add(apt);
				}
			}
		}
		return lista;
	}

	public ArrayList<String> getInstrumentos(){
		ArrayList<String> lista = new ArrayList<String>();
		for(Equipo participante: equipo){
			for(String apt: participante.getInstrumentos()){
				if(!lista.contains(apt)){
					lista.add(apt);
				}
			}
		}
		return lista;
	}

	public ArrayList<String> getGeneros(){
		ArrayList<String> lista = new ArrayList<String>();
		for(Equipo participante: equipo){
			for(String apt: participante.getGenerosMusicales()){
				if(!lista.contains(apt)){
					lista.add(apt);
				}
			}
		}
		return lista;
	}

	public ArrayList<String> getGenerosOrdenada(){
		ArrayList<String> lista = this.getGeneros();
		Collections.sort(lista);
		return lista;
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


	//COSAS DE JURADO------------------------------------------

	public ArrayList<Equipo> getParticipantesAptos(Criterio criterio){
		ArrayList<Equipo> participantesABatallar = new ArrayList<>();
		for(Equipo participante: this.equipo){
			ArrayList<Equipo> elegidos = participante.getEquipos(criterio);
			participantesABatallar.addAll(elegidos);
		}
		return participantesABatallar;
	}

	public ArrayList<Equipo> rankingEquipo(Comparator<Equipo> orden, Criterio criterio){
		ArrayList<Equipo> ranking = getParticipantesAptos(criterio);
		Collections.sort(ranking, orden);
		return ranking;
	}
}
