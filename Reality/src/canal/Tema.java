package canal;
import java.util.ArrayList;

import actores.Equipo;
import criterios.CriterioGenero;

public class Tema {
	
	private String titulo, idioma;
	private ArrayList<String> generosMusicales;
	protected ArrayList<String> instrumentosNecesarios; //puede ser null

	public Tema(String titulo,String idioma){
		this.titulo = titulo;
		this.idioma = idioma;
		this.generosMusicales = new ArrayList<>();
		this.instrumentosNecesarios = new ArrayList<>();
	}

	//Responsabilidad delegada de criterio tema
	public boolean aceptaInterprete(Equipo p) {
		return p.getIdiomas().contains(this.idioma) && this.coindideAlMenosUnGenero(p);
	}

	private boolean coindideAlMenosUnGenero(Equipo p) {
		for(String i: this.generosMusicales) {
			ArrayList<Equipo> e = p.getEquipos(new CriterioGenero(i));
			if(e.size() > 0) {
				return true;
			}
		}
		return false;
	}
	
	//ADD & GET
	
	public void addGenero(String g) {
		this.generosMusicales.add(g);
	}
	
	public void addInstrumento(String i) {
		this.instrumentosNecesarios.add(i);
	}

	public String getIdioma() {
		return this.idioma;
	}

	public String getTitulo() {
		return this.titulo;
	}

	public ArrayList<String> getGenerosMusicales() {
		return new ArrayList<>(generosMusicales);
	}

	public ArrayList<String> getInstrumentosNecesarios() {
		return new ArrayList<>(instrumentosNecesarios);
	}
	
}
