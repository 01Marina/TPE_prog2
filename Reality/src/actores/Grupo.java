package actores;

import java.util.ArrayList;

import criterios.Criterio;

public class Grupo extends Equipo{

	private ArrayList<Equipo> integrantes;
	
	public Grupo(String nombre) {
		super(nombre);
		integrantes = new ArrayList<Equipo>();
	}
	
	public void addIntegrantes(Equipo e) {
		this.integrantes.add(e);
	}

	//HACER PRUEBAS CON UN MAIN
	@Override
	public ArrayList<String> getGenerosMusicales() {
		ArrayList<String> generos = new ArrayList<String>();
		for(Equipo e: integrantes) {
			for(String g: e.getGenerosMusicales()) {
				if(this.coincideConTodo(g))
					generos.add(g);
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

	@Override
	public ArrayList<Equipo> getEquipo() {
		return this.integrantes;
	}
	
	public ArrayList<Equipo> getParticipantes(Criterio criterio){
		ArrayList<Equipo> participantesABatallar = new ArrayList<>();
		for(Equipo participante: this.integrantes){
			if(criterio.cumple(participante)){
				participantesABatallar.add(participante);
			}else {
				//ACÁ PUEDE LLEGAR A RECORRER UN ARRAY VACIO EN CASO DE QUE SEA UN PARTICIPANTE SIMPLE
				for(Equipo e: participante.getEquipo()) {
					ArrayList<Equipo> ee = e.getParticipantes(criterio);
					participantesABatallar.addAll(ee);
				}
			}
		}
		return participantesABatallar;
	}
}
