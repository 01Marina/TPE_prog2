package actores;
import java.util.ArrayList;
import criterios.Criterio;

public class Participante extends Equipo{
	private String apellido;
	private ArrayList<String> generosMusicales, idiomas, instrumentos;
	


	public Participante(String nombre, String apellido, ArrayList<String> generosMusicales, ArrayList<String> idiomas,
			ArrayList<String> instrumentos) {
		super(nombre);
		this.apellido = apellido;
		this.generosMusicales = new ArrayList<String>(generosMusicales);
		this.idiomas = new ArrayList<String>(idiomas);
		this.instrumentos = new ArrayList<String>(instrumentos);
	}
	@Override
	public double getEdad() {
		return this.getEdad();
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
	@Override
	public ArrayList<String> getGenerosMusicales(){
		return new ArrayList<String>(generosMusicales);
	}
	public ArrayList<String> getInstrumentos(){
		return new ArrayList<String>(instrumentos);
	}
	
	public ArrayList<Equipo> getParticipantes(Criterio criterio){
		if(criterio.cumple(this)) {
			ArrayList<Equipo> e = new ArrayList<>();
			e.add(this);
			return e;
		}
		return new ArrayList<>();
	}
}
