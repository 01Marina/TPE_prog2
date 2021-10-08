package aptitudes;
import java.util.ArrayList;
import home.*;

public class AptitudInstrumentos extends Aptitud{
	public ArrayList<String> getAptitud(Participante participante){
		return participante.getInstrumentos();
	}
}
