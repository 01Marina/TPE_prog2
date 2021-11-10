package canal;
import java.util.ArrayList;
import java.util.Comparator;

import actores.Equipo;
import criterios.Criterio;
public class Batalla {
	private Equipo participante1;
	private Equipo participante2;
	private Tema tema;
	private Comparator<Equipo> criterio;

	public Batalla(Tema tema, Equipo participante1, Equipo participante2, Comparator<Equipo> c){//agergar criterio?
		this.tema = tema; 
		this.participante1 = participante1;
		this.participante2 = participante2;
		this.criterio = c;
	}

	public int ganoBatalla() {
		//ESTA BIEN ASI? xq no tenemos control de a q participante nos referimos. siemprecompara 1ro con 2do
		return criterio.compare(participante1, participante2);
	}
	
	public void setCriterio(Comparator<Equipo> criterio) {
		this.criterio = criterio;
	}
}
