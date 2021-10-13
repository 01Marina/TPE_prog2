package canal;
import java.util.ArrayList;

import actores.Coach;
import actores.Participante;
public class Reality {

	private Produccion produccion;//esta bien q prod sea atrib de reality? no es mas realista al revez!!!!!!!!!!!!!!!!!!!
	private ArrayList<Participante> participantes;
	private ArrayList<Coach> coaches;

	public Reality(){
		participantes = new ArrayList<Participante>();
		coaches = new ArrayList<Coach>();
		produccion = new Produccion();
	}
/*

	public Produccion getProduccion() {
		return produccion;
	}


	public void setProduccion(Produccion produccion) {
		this.produccion = produccion;
	}
*/

	//getters & setters
	public void addParticipante(Participante participante){
		this.participantes.add(participante);
	}
	public void addCoach(Coach coach){
		this.coaches.add(coach);
	}

	public ArrayList<Coach> getCoaches(){
		return new ArrayList<Coach>(coaches);
	}
	public ArrayList<Participante> getParticipantes(){
		return new ArrayList<Participante>(participantes);
	}
}
