package canal;
import java.util.ArrayList;

import actores.Coach_Jurado;
import actores.Equipo;
import criterios.Criterio;
public class Reality {

	private ArrayList<Equipo> participantes;
	private ArrayList<Coach_Jurado> coaches;
	private ArrayList<Tema> temas;
	private ArrayList<Batalla> batallas;

	public Reality(){
		participantes = new ArrayList<>();
		coaches = new ArrayList<Coach_Jurado>();
		temas = new ArrayList<Tema>();
		batallas = new ArrayList<Batalla>();
	}

	public Equipo getParticipante(Coach_Jurado c,Criterio criterio) {
		return c.participanteElejido(criterio);
	}
	
	
	/* SE PUEDE RESOLVER DESDE EL MAIN (NO?)
	
	//organizo batalla con una cancion un criterio y eligiendo un integrante x equipo de cada coach
	public Batalla organizarBatalla(Tema tema, Criterio criterioParticipante, Equipo p1, Equipo p2, Criterio criterioBatalla){
		Equipo participanteCoach1 = getParticipante(c1, criterioParticipante);
		Equipo participanteCoach2 = getParticipante(c2, criterioParticipante); 
		//SI COACH NO ENCUENTRA PARTICIPANTE APTO, LO BUSCO EN OTRO COACH?
		return new Batalla(tema, participanteCoach1, participanteCoach2, criterioBatalla);
		//retorno un abatalla con cancion y lista de participantes
	}
	//getter & setter para temas batalla ...
*/


	//getters & setters --- reality/prod
	public void addParticipante(Equipo participante){
		this.participantes.add(participante);
	}
	public void addBatalla(Batalla b){
		this.batallas.add(b);
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
