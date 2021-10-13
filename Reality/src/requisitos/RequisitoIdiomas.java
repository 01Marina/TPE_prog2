package requisitos;
import java.util.ArrayList;

import actores.Participante;
public class RequisitoIdiomas extends Requisito{
	
	//constructor
	public RequisitoIdiomas(ArrayList<String> idiomas) {
		this(idiomas, null);
	}
	public RequisitoIdiomas(ArrayList<String> idiomas, Requisito sigReq) {
		super(sigReq);
		requerimientos = idiomas;
	}
	public boolean cumple(Participante participante) {
		return participante.getIdiomas().containsAll(requerimientos);
	}
}
