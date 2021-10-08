package home;
import java.util.ArrayList;
public class Reality {

	private Produccion produccion;//esta bien q prod sea atrib de reality? no es mas realista al revez
	private ArrayList<Participante> participantes;
	private ArrayList<Coach> coaches;

	public Reality(){
		participantes = new ArrayList<Participante>();
		coaches = new ArrayList<Coach>();
		//produccion = new Produccion();
	}


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
