package requisitos;

import java.util.ArrayList;

import actores.Participante;

public class RequisitoGenero extends Requisito{
		//constructor
		public RequisitoGenero(ArrayList<String> gen) {
			this(gen, null);
		}
		public RequisitoGenero(ArrayList<String> req, Requisito sigReq) {
			super(sigReq);
			this.requerimientos = req;
		}
		public RequisitoGenero(String req, Requisito sigReq) {
			super(sigReq);
			this.requerimientos.add(req);
		}
		public RequisitoGenero(String req) {
			this(req, null);
		}
		public boolean cumple(Participante participante) {
			return participante.getGenerosMusicales().containsAll(requerimientos);
		}
}
