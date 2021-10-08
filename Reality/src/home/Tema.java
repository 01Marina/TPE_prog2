package home;
import java.util.ArrayList;
public class Tema {
	private String titulo;
	private String idioma;
	private ArrayList<String> generosMusicales;
	private ArrayList<String> instrumentosNecesarios; //null

	public Tema(String tit,String idioma,ArrayList<String> generosMusicales){
		this(tit, idioma, generosMusicales, new ArrayList<String>());
	}

	public Tema(String tit,String idioma,ArrayList<String> generosMusicales,ArrayList<String> instrumentos){
		this.titulo = tit;
		this.idioma = idioma;
		this.generosMusicales = generosMusicales;
		this.instrumentosNecesarios = instrumentos;
	}
}
