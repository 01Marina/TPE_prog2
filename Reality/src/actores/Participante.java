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
	
	//ADD
	
	public void addGeneroMusical(String genero){
			this.generosMusicales.add(genero);
	}
	
	public void addIdioma(String idioma){
			this.idiomas.add(idioma);
	}
	
	public void addInstrumento(String instrumento){
			this.instrumentos.add(instrumento);
	}
	
	//OVERRIDE
	
	@Override
	public double getEdad() {
		return this.edad;
	}
	
	@Override
	public ArrayList<String> getIdiomas(){
		return new ArrayList<String>(idiomas);
	}
	
	@Override
	public ArrayList<String> getGenerosMusicales(){
		return new ArrayList<String>(generosMusicales);
	}
	
	@Override
	public ArrayList<String> getInstrumentos(){
		return new ArrayList<String>(instrumentos);
	}
	
	@Override
	public ArrayList<Equipo> getEquipos(Criterio criterio){
		if(criterio.cumple(this)) {
			ArrayList<Equipo> arr = new ArrayList<>();
			arr.add(this);
			return arr;
		}
		return new ArrayList<>();
	}

	@Override
	public ArrayList<Equipo> getParticipantes(Criterio criterio){
		return this.getEquipos(criterio);
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
