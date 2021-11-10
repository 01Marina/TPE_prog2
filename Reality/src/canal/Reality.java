package canal;
import java.util.ArrayList;

import actores.Coach_Jurado;
import actores.Equipo;
import criterios.Criterio;
public class Reality {

	private ArrayList<Equipo> participantes;
	private ArrayList<Coach_Jurado> coaches;
	private ArrayList<Tema> temas;

	public Reality(){
		participantes = new ArrayList<>();
		coaches = new ArrayList<Coach_Jurado>();
		temas = new ArrayList<Tema>();
	}
	
	public int batalla(Equipo p1, Equipo p2) {
		return 1;
	}
	
	public void addParticipante(Equipo participante){
		this.participantes.add(participante);
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
}
