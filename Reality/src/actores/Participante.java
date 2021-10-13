package actores;
import java.util.ArrayList;
public class Participante extends Persona{
	private ArrayList<String> generosMusicales;
	private ArrayList<String> idiomas;
	private ArrayList<String> instrumentos;
	//2 constructores para poder dejar null instrumentos
	public Participante(String nombre, String apellido, int edad){
		this(nombre, apellido, edad, new ArrayList<String>(), new ArrayList<String>(), new ArrayList<String>());
	}

	public Participante(String nombre, String apellido, int edad, ArrayList<String> generosMusicales, ArrayList<String> idiomas, ArrayList<String> instrumentos){
		super(nombre, apellido,edad);
		this.generosMusicales = generosMusicales;
		this.idiomas = idiomas;
		this.instrumentos = instrumentos;
	}



	//getters y setters
	public void addGenerosMusicales(ArrayList<String> generos){
		for(String genero: generos){
			generosMusicales.add(genero);
		}
	}
	public void addIdiomas(ArrayList<String> idiomas){
		for(String idioma: idiomas){
			this.idiomas.add(idioma);
		}
	}

	public void addInstrumentos(ArrayList<String> instrumentos){
		for(String instrumento: instrumentos){
			generosMusicales.add(instrumento);
		}
	}
	public ArrayList<String> getIdiomas(){
		return new ArrayList<String>(idiomas);
	}
	public ArrayList<String> getGenerosMusicales(){
		return new ArrayList<String>(generosMusicales);
	}
	public ArrayList<String> getInstrumentos(){
		return new ArrayList<String>(instrumentos);
	}
}
