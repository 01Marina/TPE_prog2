package canal;
import java.util.ArrayList;
import java.util.Comparator;

import actores.Coach_Jurado;
import actores.Equipo;
import criterios.Criterio;
public class Reality {

	private ArrayList<Equipo> participantes;
	private ArrayList<Coach_Jurado> coaches;
	private ArrayList<Tema> temas;
	private Comparator<Equipo> requisitoBatalla;

	public Reality(Comparator<Equipo> reqBatalla){
		participantes = new ArrayList<>();
		coaches = new ArrayList<Coach_Jurado>();
		temas = new ArrayList<Tema>();
		requisitoBatalla = reqBatalla;
	}
	
	public int batallar(Equipo participante, Equipo contrincante) {
		return requisitoBatalla.compare(participante, contrincante);
	}
	
	public void addParticipante(Equipo participante){
		this.participantes.add(participante);
	}
	
	public void addTema(Tema tema){
		this.temas.add(tema);
	}
	
	public Equipo getParticipante(Coach_Jurado c,Criterio criterio) {
		return c.participanteElejido(criterio);
	}
	
	public void addCoach(Coach_Jurado coach){
		this.coaches.add(coach);
	}

	public ArrayList<Coach_Jurado> getCoaches(){
		return new ArrayList<Coach_Jurado>(coaches);
	}
	public ArrayList<Equipo> getParticipantes(){
		return new ArrayList<>(participantes);
	}
	
	public void setRequisitoBatalla(Comparator<Equipo> requisitoBatalla) {
		this.requisitoBatalla = requisitoBatalla;
	}

	public Comparator<Equipo> getRequisitoBatalla() {
		return requisitoBatalla;
	}
	
	
}
