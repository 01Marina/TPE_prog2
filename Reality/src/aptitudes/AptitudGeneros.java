package aptitudes;
import java.util.ArrayList;
import actores.Equipo;

public class AptitudGeneros extends Aptitud{
	public ArrayList<String> getAptitud(Equipo participante){
		return participante.getGenerosMusicales();
	}
}
