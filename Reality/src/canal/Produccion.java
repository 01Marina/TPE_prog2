package canal;
import java.util.ArrayList;

import actores.Coach;
import actores.Participante;
import criterios.*;

public class Produccion {

	//arreglos canciones y batallas
	private ArrayList<Tema> temas;
	private ArrayList<Batalla> batallas;

	public Produccion(){
		temas = new ArrayList<Tema>();
		batallas = new ArrayList<Batalla>();

	}


	//organizo batalla con una cancion un criterio y eligiendo un integrante x equipo de cada coach
	public Batalla organizarBatalla(Tema tema, Criterio criterio, ArrayList<Coach> coaches){

		ArrayList<Participante> participantes = new ArrayList<Participante>();//participantes de la batalla

		for(Coach coach: coaches){//busco integrantes aptos en los equipos para la batalla
			Participante participanteElegido = coach.getComportamientoJurado().participanteElejido(criterio, coach.getEquipo());//llamo a metodo de jurado q es comportamiento de coach y q devuelve un participante segun criterio 
			if(participanteElegido != null){
				participantes.add(participanteElegido);//agrego participante a batalla
			} 
		}
		return new Batalla(tema, participantes);//retorno un abatalla con cancion y lista de participantes
	}


	//getter & setter para temas batalla ...

}
