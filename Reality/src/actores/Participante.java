package actores;
import java.util.ArrayList;
import criterios.Criterio;

public class Participante extends Equipo{
	private String apellido;
	private double edad;
	private ArrayList<String> generosMusicales, idiomas, instrumentos;
	


	public Participante(String nombre, String apellido, double edad) {
		super(nombre);
		this.apellido = apellido;
		this.edad = edad;
		this.generosMusicales = new ArrayList<String>();
		this.idiomas = new ArrayList<String>();
		this.instrumentos = new ArrayList<String>();
	}
	@Override
	public double getEdad() {
		return this.edad;
	}

	//getters y setters
	public void addGeneroMusical(String genero){
			generosMusicales.add(genero);
	}
	public void addIdioma(String idioma){
			this.idiomas.add(idioma);
	}

	public void addInstrumento(String instrumento){
			instrumentos.add(instrumento);
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
	
	@Override
	public String toString() {
		return "Participante " + this.nombre + ": " + System.lineSeparator() +
				"Edad: " + (int) this.getEdad() + System.lineSeparator() +
				"Generos Musicales: " + this.getGenerosMusicales() + System.lineSeparator() +
				"Idiomas: " + this.getIdiomas() + System.lineSeparator() +
				"Instrumentos: " + this.getInstrumentos();
	}
}
