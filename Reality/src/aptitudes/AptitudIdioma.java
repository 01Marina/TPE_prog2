package aptitudes;
import java.util.ArrayList;
import actores.*;

public class AptitudIdioma extends Aptitud{
	public ArrayList<String> getAptitud(Equipo participante){
		return participante.getIdiomas();
	}
}
