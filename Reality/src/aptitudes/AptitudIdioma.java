package aptitudes;
import java.util.ArrayList;
import home.*;

public class AptitudIdioma extends Aptitud{
	public ArrayList<String> getAptitud(Participante participante){
		return participante.getIdiomas();
	}
}
