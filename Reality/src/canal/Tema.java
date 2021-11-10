package canal;
import java.util.ArrayList;
public class Tema {
	private String titulo;
	private String idioma;
	private ArrayList<String> generosMusicales;
	private ArrayList<String> instrumentosNecesarios; //null

	public Tema(String titulo,String idioma){
		this.titulo = titulo;
		this.idioma = idioma;
		this.generosMusicales = new ArrayList<>();
		this.instrumentosNecesarios = new ArrayList<>();
	}
	
	public void addGenero(String g) {
		this.generosMusicales.add(g);
	}
	
	public void addInstrumento(String i) {
		this.instrumentosNecesarios.add(i);
	}

	public Object getIdioma() {
		return this.idioma;
	}

	public String getTitulo() {
		return titulo;
	}

	public ArrayList<String> getGenerosMusicales() {
		return new ArrayList<>(generosMusicales);
	}

	public ArrayList<String> getInstrumentosNecesarios() {
		return new ArrayList<>(instrumentosNecesarios);
	}
	
	
}
