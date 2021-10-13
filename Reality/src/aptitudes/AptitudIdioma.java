package aptitudes;
import java.util.ArrayList;
import actores.Participante;

public class AptitudIdioma extends Aptitud{
	public ArrayList<String> getAptitud(Participante participante){
		return participante.getIdiomas();
	}
}
