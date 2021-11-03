package actores;

import java.util.ArrayList;

public class Grupo extends Equipo{

	private ArrayList<Equipo> integrantes;
	
	public Grupo(String nombre) {
		super(nombre);
		integrantes = new ArrayList<Equipo>();
	}
	
	@Override
	public ArrayList<String> obtenerGenerosMusicales() {
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
			if(!integrantes.get(c).tengoGenero(g))
				coincide = false;
			c++;
		}
		return coincide;
	}
	
	
	
	//retorna promedio de edades
	@Override
	public double obtenerEdad() {
		double edades = 0;
		for(Equipo i: this.integrantes) {
			edades += i.calcularEdad();
		}
		return edades/integrantes.size();
	}
	
	public void addIntegrantes(Equipo e) {
		this.integrantes.add(e);
		setEdad();
	}
}
