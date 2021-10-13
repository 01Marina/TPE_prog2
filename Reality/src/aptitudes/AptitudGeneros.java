package aptitudes;
import java.util.ArrayList;
import actores.Participante;

public class AptitudGeneros extends Aptitud{
	public ArrayList<String> getAptitud(Participante participante){
		return participante.getGenerosMusicales();
	}
}
