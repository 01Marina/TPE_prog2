package actores;
import java.util.ArrayList;
public class Participante extends Equipo{
	private String apellido;
	
	public Participante(String nombre, String apellido, double edad, ArrayList<String> generosMusicales, ArrayList<String> idiomas, ArrayList<String> instrumentos){
		super(nombre, edad, generosMusicales, idiomas,instrumentos);
		this.apellido = apellido;
	}


	@Override
	public double obtenerEdad() {
		return this.getEdad();
	}
	@Override
	public ArrayList<String> obtenerGenerosMusicales(){
		return new ArrayList<String>(generosMusicales);
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
