package home;
import java.util.ArrayList;
import java.util.Collections;
import aptitudes.*;

public class Coach extends Persona{
	private Jurado comportamientoJurado;
	private ArrayList<Participante> equipo;

	public Coach(String nombre, String apellido, int edad){
		super(nombre, apellido, edad);
		comportamientoJurado = new Jurado();
		equipo = new ArrayList<Participante>();
	}
	public Jurado getComportamientoJurado(){
		return comportamientoJurado;
	}
	//retorna lista de todos los instrumentos/idioma q el equipo domina
	public ArrayList<String> getListaAptitudes(Aptitud aptitud){
		//recorro equipo-si instrum on esta en nueva lista add
		ArrayList<String> lista = new ArrayList<String>();
		for(Participante participante: equipo){
			for(String apt: aptitud.getAptitud(participante)){
				if(!lista.contains(apt)){
					lista.add(apt);
				}
			}
		}
		return lista;
	}

	public void ordenarLista(ArrayList<String> lista){
		Collections.sort(lista);
	}

	public ArrayList<String> getAptitudGeneros(){
		ArrayList<String> lista = getListaAptitudes(new AptitudGeneros());
		ordenarLista(lista);
		return lista;
	}
	public ArrayList<Participante> getEquipo(){

		return new ArrayList<Participante>(equipo);
	}


	public double promedioEdadEqupo(){
		int sumaEdades = 0;
		double promedio;
		for(Participante participante: equipo){
			sumaEdades += participante.getEdad();
		}
		promedio = sumaEdades/equipo.size();
		return promedio;
	}



}
