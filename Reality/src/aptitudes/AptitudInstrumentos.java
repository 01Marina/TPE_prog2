package aptitudes;
import java.util.ArrayList;
import actores.*;

public class AptitudInstrumentos extends Aptitud{
	public ArrayList<String> getAptitud(Equipo participante){
		return participante.getInstrumentos();
	}
}
