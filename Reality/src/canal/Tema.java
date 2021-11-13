package canal;
import java.util.ArrayList;

import actores.Equipo;
import criterios.CriterioGenero;

public class Tema {
	private String titulo, idioma;
	private ArrayList<String> generosMusicales;
	protected ArrayList<String> instrumentosNecesarios; //null

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

	public boolean aceptaInterprete(Equipo p) {
		return p.getIdiomas().contains(this.idioma) && this.coindideAlmenosUnGenero(p);
	}

	private boolean coindideAlmenosUnGenero(Equipo p) {
		int contador = 0;
		for(String i: this.instrumentosNecesarios) {
			ArrayList<Equipo> e = p.getParticipantes(new CriterioGenero(i));
			contador += e.size();
			if(contador > 1) {
				return true;
			}
		}
		return false;
	}
	
	
}
