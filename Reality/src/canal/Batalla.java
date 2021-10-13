package canal;
import java.util.ArrayList;

import actores.Participante;
public class Batalla {
	private ArrayList<Participante> participantes;
	private Tema tema;

	public Batalla(Tema tema, ArrayList<Participante> participantes){//agergar criterio?
		this.tema = tema;
		this.participantes = participantes;
	}

}
