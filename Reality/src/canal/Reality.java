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


	//organizo batalla con una cancion un criterio y eligiendo un integrante x equipo de cada coach
	public Batalla organizarBatalla(Tema tema, Criterio criterio, ArrayList<Coach_Jurado> coaches){

		ArrayList<Equipo> participantes = new ArrayList<>();//participantes de la batalla

		for(Coach_Jurado coach: coaches){//busco integrantes aptos en los equipos para la batalla
			Equipo participanteElegido = coach.participanteElejido(criterio, coach.getEquipo());//llamo a metodo de jurado q es comportamiento de coach y q devuelve un participante segun criterio 
			if(participanteElegido != null){
				participantes.add(participanteElegido);//agrego participante a batalla
			} 
		}
		return new Batalla(tema, participantes);//retorno un abatalla con cancion y lista de participantes
	}
	//getter & setter para temas batalla ...



	//getters & setters --- reality/prod
	public void addParticipante(Equipo participante){
		this.participantes.add(participante);
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
