package canal;
import java.util.ArrayList;
import actores.Equipo;
public class Batalla {
	private ArrayList<Equipo> participantes;
	private Tema tema;

	public Batalla(Tema tema, ArrayList<Equipo> participantes){//agergar criterio?
		this.tema = tema;
		this.participantes = participantes;
	}

}
