package actores;

import java.util.ArrayList;

import criterios.Criterio;

public class Grupo extends Equipo{

	private ArrayList<Equipo> integrantes;
	
	public Grupo(String nombre) {
		super(nombre);
		integrantes = new ArrayList<Equipo>();
	}
	
	public void addIntegrante(Equipo e) {
		this.integrantes.add(e);
	}


	//para c/integrante, recorro sus generos. si uno en particular coincide con todos y no estaba en lista de retorno, lo agrego a esta
	@Override
	public ArrayList<String> getGenerosMusicales() {
		ArrayList<String> generos = new ArrayList<String>();
		if(integrantes.size() > 0) {
			for(String g: integrantes.get(0).getGenerosMusicales()) {
				if(this.coincideConTodo(g) && !generos.contains(g)) {
						generos.add(g);						
				}
			}
		}
		return generos;
	}
	
	public boolean coincideConTodo(String g) {
		boolean coincide = true;
		int c = 0;
		while(coincide && c<integrantes.size()) {
			if(!integrantes.get(c).getGenerosMusicales().contains(g))
				coincide = false;
			c++;
		}
		return coincide;
	}
	
	
	
	//retorna promedio de edades
	@Override
	public double getEdad() {
		double edades = 0;
		for(Equipo i: this.integrantes) {
			edades += i.getEdad();
		}
		return edades/integrantes.size();
	}
	
	
	@Override
	public ArrayList<String> getIdiomas() {
		ArrayList<String> idiomas = new ArrayList<>();
		for(Equipo e: this.integrantes) {
			for(String i: e.getIdiomas()) {
				if(!idiomas.contains(i)){
					idiomas.add(i);
				}
			}
		}
		return idiomas;
	}
	@Override
	public ArrayList<String> getInstrumentos() {
		ArrayList<String> instrumentos = new ArrayList<>();
		for(Equipo e: this.integrantes) {
			for(String i: e.getInstrumentos()) {
				if(!instrumentos.contains(i)){
					instrumentos.add(i);
				}
			}
		}
		return instrumentos;
	}
	//USADA POR EL REALITY
	//getParticipante(coach, criterio);
	@Override
	public ArrayList<Equipo> getEquipos(Criterio criterio){
		ArrayList<Equipo> participantesABatallar = new ArrayList<>();
			if(criterio.cumple(this)){
				participantesABatallar.add(this);
			}else {
				for(Equipo e: this.integrantes) {
					ArrayList<Equipo> ee = e.getEquipos(criterio);
					participantesABatallar.addAll(ee);
				}
			}
		return participantesABatallar;
	}
	//USADA EN CASO QUE REQUIERA HACERLO LA CLASE TemaFinal
	//aceptaInterprete(p);
	@Override
	public ArrayList<Equipo> getParticipantes(Criterio criterio){
		ArrayList<Equipo> participantesABatallar = new ArrayList<>();
		for(Equipo e: this.integrantes) {
			ArrayList<Equipo> ee = e.getParticipantes(criterio);
			participantesABatallar.addAll(ee);
		}
		return participantesABatallar;
	}
	
	@Override 
	public String toString() {
		String str = "Grupo " + this.nombre + ": " + System.lineSeparator() +
				"Edad: " + (int) this.getEdad() + System.lineSeparator() +
				"Generos Musicales: " + this.getGenerosMusicales() + System.lineSeparator() +
				"Idiomas: " + this.getIdiomas() + System.lineSeparator() +
				"Instrumentos: " + this.getInstrumentos() + System.lineSeparator() + System.lineSeparator();
		for(Equipo e: this.integrantes)
			str += e.toString() + System.lineSeparator();
		return str;
	}
}
