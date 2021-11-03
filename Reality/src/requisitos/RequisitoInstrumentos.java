package requisitos;

import java.util.ArrayList;

import actores.Equipo;

public class RequisitoInstrumentos extends Requisito{
	
	//constructor .pasar arr req sin sig
	public RequisitoInstrumentos(ArrayList<String> idiomas) {
		this(idiomas, null);
	}
	//constructor .pasar arr req con sig
	public RequisitoInstrumentos(ArrayList<String> req, Requisito sigReq) {
		super(sigReq);
		this.requerimientos = req;
	}
	//constructor .pasar elem de arr  con sig
	public RequisitoInstrumentos(String req, Requisito sigReq) {
		super(sigReq);
		this.requerimientos.add(req);
	}
	//constructor .pasar elem de arr  sin sig

	public RequisitoInstrumentos(String req) {
		this(req, null);
	}
	public boolean cumple(Equipo participante) {
		return participante.getInstrumentos().containsAll(requerimientos);
	}
}
