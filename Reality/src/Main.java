import java.util.ArrayList;
import java.util.Comparator;

import canal.*;
import actores.*;
import comparadores.*;
import criterios.*;

public class Main {
	
	public static void main(String[] args) {
		
		//TEMAS
		
		Tema do_i_wanna_know = new Tema("Do I Wanna Know", "Ingles");
		Tema bajan = new Tema("Bajan", "Espaniol");
		Tema despacito = new Tema("Despacito", "Espaniol");
		
		do_i_wanna_know.addGenero("Rock");
		do_i_wanna_know.addGenero("Indie");
		bajan.addGenero("Rock");
		despacito.addGenero("Pop");
		
				//CRITERIOS
		
		Criterio mayor_18 = new CriterioEdad(18);
		Criterio gen_rock = new CriterioGenero("Rock");
		Criterio idioma_ingles = new CriterioIdioma("Ingles");
		Criterio instr_guitarra = new CriterioInstrumento("Guitarra");
		Criterio tema_despacito = new CriterioTema(despacito);
		Criterio tema_do_i_wanna_know = new CriterioTema(do_i_wanna_know);
		
		
				//PARTICIPANTES
		
		//g1
		Participante p3 = new Participante("Lara", "Giarocco", 27);
		//sub_grupo
		Participante p1 = new Participante("Pepe", "Gimenez", 1);
		Participante p2 = new Participante("Franco", "Girolami", 21);
		
		//g2
		//sub_grupo
		Participante p4 = new Participante("Marina", "Caseres", 24);
		Participante p5 = new Participante("Mar", "Casco", 22);
		
		//g3
		Participante p6 = new Participante("Ariel", "Lopez", 12);
		Participante p7 = new Participante("Gonzalo", "Bebe", 73);
		
		
		
		p1.addGeneroMusical("Rock");
		p1.addGeneroMusical("Jazz");
		p2.addGeneroMusical("Folklore");
		p2.addGeneroMusical("Jazz");
		p3.addGeneroMusical("Pop");
		p3.addGeneroMusical("Jazz");
		p4.addGeneroMusical("Indie");
		p4.addGeneroMusical("Rock");
		p5.addGeneroMusical("Rock");
		p6.addGeneroMusical("Pop");
		p6.addGeneroMusical("Indie");
		p7.addGeneroMusical("Electro");
		p7.addGeneroMusical("Indie");
		
		p1.addIdioma("Espaniol");
		p1.addIdioma("Ingles");
		p2.addIdioma("Ingles");
		p3.addIdioma("Italiano");
		p3.addIdioma("Ingles");
		p3.addIdioma("Frances");
		p4.addIdioma("Ingles");
		p4.addIdioma("Portuges");
		p5.addIdioma("Chino");
		p6.addIdioma("Japones");
		p6.addIdioma("Persa");
		p7.addIdioma("Espaniol");
		
		p1.addInstrumento("Viola");
		p1.addInstrumento("Guitarra");
		p2.addInstrumento("Bajo");
		p2.addInstrumento("Guitarra");
		p3.addInstrumento("Piano");
		p3.addInstrumento("Saxo");
		p4.addInstrumento("Clarinete");
		p5.addInstrumento("Trompeta");
		p6.addInstrumento("Bateria");
		p6.addInstrumento("Guitarra");
		p7.addInstrumento("Guitarra");
		p7.addInstrumento("Piano");
		
				//GRUPOS
		
		Grupo g1 = new Grupo("Pitusas");
		Grupo g1_sub1 = new Grupo("grupito de pitusas");
		Grupo g2 = new Grupo("Pepa Pig");
		
		//coach1
		g1_sub1.addIntegrante(p1);
		g1_sub1.addIntegrante(p2);
		
		g1.addIntegrante(g1_sub1);
		g1.addIntegrante(p3);
		
		//coach2
		g2.addIntegrante(p4);
		g2.addIntegrante(p5);
		
				//COACHES
		
		Coach_Jurado c1 = new Coach_Jurado();
		Coach_Jurado c2 = new Coach_Jurado();
		Coach_JuradoEstricto c3 = new Coach_JuradoEstricto(mayor_18);
		
		
		
				//COMPARADORES
		
		Comparator<Equipo> comp_edad = new ComparadorEdades();
		Comparator<Equipo> comp_generos = new ComparadorGeneros();
		Comparator<Equipo> comp_instr = new ComparadorInstrumentos();
		Comparator<Equipo> comp_instr_edad = new ComparadorCompuesto(comp_instr, comp_edad);
		
		
		
		
		
		
				//REALITY
		
		Reality LaVozArgentina = new Reality(comp_instr_edad);
		//addCoach
		LaVozArgentina.addCoach(c1);
		LaVozArgentina.addCoach(c2);
		LaVozArgentina.addCoach(c3);
		
		LaVozArgentina.addParticipante(g1);
		LaVozArgentina.addParticipante(g2);
		LaVozArgentina.addParticipante(p6);
		LaVozArgentina.addParticipante(p7);
		
		c1.addEquipo(LaVozArgentina.getParticipantes().get(0));
		c2.addEquipo(LaVozArgentina.getParticipantes().get(1));
		c3.addEquipo(LaVozArgentina.getParticipantes().get(2));
		c3.addEquipo(LaVozArgentina.getParticipantes().get(3));
		
		
		//addTema
		LaVozArgentina.addTema(do_i_wanna_know);
		LaVozArgentina.addTema(bajan);
		LaVozArgentina.addTema(despacito);
		
		//necesario?
		LaVozArgentina.addParticipante(p1);
		LaVozArgentina.addParticipante(p2);
		LaVozArgentina.addParticipante(p3);
		LaVozArgentina.addParticipante(p4);
		LaVozArgentina.addParticipante(p5);
		LaVozArgentina.addParticipante(p6);
		LaVozArgentina.addParticipante(p7);
		
		
		ArrayList<Equipo> participantes_a_batallar = c1.getParticipantes2(mayor_18);
		if(participantes_a_batallar.size() > 1)	{
			System.out.println(LaVozArgentina.batallar(participantes_a_batallar.get(0), participantes_a_batallar.get(1)));
		}else {
			System.out.println("No se encontro a mas de un equipo apto");
		}

		System.out.println(g1);
		
	}
}
