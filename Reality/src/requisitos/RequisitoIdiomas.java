package requisitos;
import java.util.ArrayList;

import actores.Equipo;
public class RequisitoIdiomas extends Requisito{
	
	//constructor
	public RequisitoIdiomas(ArrayList<String> idiomas) {
		this(idiomas, null);
	}
	public RequisitoIdiomas(ArrayList<String> idiomas, Requisito sigReq) {
		super(sigReq);
		requerimientos = idiomas;
	}
	public boolean cumple(Equipo participante) {
		return participante.getIdiomas().containsAll(requerimientos);
	}
}
