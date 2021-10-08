package aptitudes;
import java.util.ArrayList;
import home.*;

public class AptitudGeneros extends Aptitud{
	public ArrayList<String> getAptitud(Participante participante){
		return participante.getGenerosMusicales();
	}
}
