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
	 /*	
		Criterio mayor_18 = new CriterioEdad(18);
		Criterio gen_rock = new CriterioGenero("Rock");
		Criterio idioma_ingles = new CriterioIdioma("Ingles");
		Criterio instr_guitarra = new CriterioInstrumento("Guitarra");
		Criterio tema_despacito = new CriterioTema(despacito);
		Criterio tema_do_i_wanna_know = new CriterioTema(do_i_wanna_know);
	*/

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
		p2.addGeneroMusical("Rock");
		p2.addGeneroMusical("Jazz");
		p3.addGeneroMusical("Pop");
		p3.addGeneroMusical("Rock");
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
		p3.addInstrumento("Guitarra");
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
		Coach_JuradoEstricto c3 = new Coach_JuradoEstricto(new CriterioEdad(18));

		//REALITY
		///COMPARADOR CON EL CUAL SE DETERMINA COMO SE GANA LA BATALLA
		Comparator<Equipo> compuesto = new ComparadorCompuesto(new ComparadorInstrumentos(), new ComparadorEdades());

		Reality LaVozArgentina = new Reality(compuesto);

		//add coach, participantes, equipo y temas
		LaVozArgentina.addCoach(c1);
		LaVozArgentina.addCoach(c2);
		LaVozArgentina.addCoach(c3);

		LaVozArgentina.addParticipante(g1);
		LaVozArgentina.addParticipante(g2);
		LaVozArgentina.addParticipante(p6);
		LaVozArgentina.addParticipante(p7);
		//AGREGA EQUIPOS/SOLISTAS A COACHES
		c1.addEquipo(LaVozArgentina.getParticipantes().get(0));
		c2.addEquipo(LaVozArgentina.getParticipantes().get(1));
		c3.addEquipo(LaVozArgentina.getParticipantes().get(2));
		c3.addEquipo(LaVozArgentina.getParticipantes().get(3));

		LaVozArgentina.addTema(do_i_wanna_know);
		LaVozArgentina.addTema(bajan);
		LaVozArgentina.addTema(despacito);


		//BATALLA

		/*la producción del programa le pide a cada jurado que seleccione
		un participante de su equipo para cantar un determinado tema musical.*/ 
		ArrayList<Equipo> batalladores_mayores_c1 = c1.getParticipantesAptos(new CriterioEdad(18));
		ArrayList<Equipo> batalladores_mayores_c2 = c2.getParticipantesAptos(new CriterioEdad(18));

//		//BATALLA ENTRE DOS EQUIPOS DE MISMO COACH
//		if(batalladores_mayores_c1.size() > 1)
//			System.out.println(LaVozArgentina.batallar(batalladores_mayores_c1.get(0), batalladores_mayores_c1.get(1)));
//		else System.out.println("No se encontro a mas de un equipo apto");
//
//		System.out.println(LaVozArgentina.batallar(batalladores_mayores_c1.get(0), batalladores_mayores_c2.get(0)));
//
//		System.out.println(g1);
//		System.out.println(g1.getEdad());
//	
		
		TemaFinal t1 = new TemaFinal("pp", "Ingles", 3);
		t1.addGenero("Rock");
		t1.addInstrumento("Guitarra");
		//System.out.println(t1.aceptaInterprete(g1));
		//System.out.println(g1.getParticipantes(new CriterioInstrumento("Guitarra")));
	
	//los metodos overrided se ven reflejados cuando uso polimorfismo
		
		
		
		
////////COMPORTAMIENTO REALITY////////
		
	//BUSCO PARTICIPANTES PARA BATALLAR
		//USO CRITERIO POR GENERO
		CriterioGenero cg = new CriterioGenero("Rock");
		
		//encuentra dos posibles en c1 y c2 (coaches)
		Equipo pc1 = LaVozArgentina.getParticipante(c1, cg).get(0);
		Equipo pc2 = LaVozArgentina.getParticipante(c2, cg).get(0);
		
	//LOS HAGO BATALLAR
		///COMPARADOR CON EL CUAL SE DETERMINA COMO SE GANA LA BATALLA (COMPUESTO(INSTRUMENTO, EDADES))
		System.out.println(LaVozArgentina.batallar(pc1, pc2));
		
		//IMPRIMO EQUIPOS PARA CORROBORAR RESULTADO
		/*System.out.println(pc1);
		System.out.println("/////////////");
		System.out.println(pc2);*/
		
	//CAMBIO EN TIEMPO DE EJECUCIÓN COMPARADOR DE LA BATALLA
		Comparator<Equipo> lc = LaVozArgentina.getRequisitoBatalla();
		LaVozArgentina.setRequisitoBatalla(new ComparadorInverso(lc));
		
	//LOS HAGO BATALLAR
			System.out.println(LaVozArgentina.batallar(pc1, pc2));
		
			
			
			
///////COMPORTAMIENTO DE COACHES////////
			
			//Para una mejor organización, cada coach/jurado desea poder obtener:
			
				/* Un listado de todos los instrumentos que pueden tocar los participantes de su equipo (no
				debe haber repetidos)*/
				System.out.println("Instrumentos:   "+c1.getInstrumentos());
					
				/* Un listado de todos los idiomas que pueden cantar los participantes de su equipo (sin idiomas
				repetidos)*/
				
				System.out.println("Idiomas:   "+c1.getIdiomas());
				
				/* Un listado de géneros de preferencia de los participantes de su equipo (sin repetidos y
				ordenados alfabéticamente)*/
				System.out.println("Generos:   "+c1.getGenerosOrdenada());
				
				/* El promedio de edad de su equipo*/
				System.out.println("Promedio de edades:   "+c1.promedioEdad());
				
				/*Como los jurados no quieren perder una desean poder contar con un mecanismo que les permita
					dada la forma actual que se va a utilizar para determinar el ganador de una batalla, obtener un listado
					de sus participantes ordenado de forma tal que los primeros miembros del listado sean los que les
					ganen o empaten con los siguientes miembros (siempre dentro del mismo equipo del juez).
				 */
				System.out.println("////////////////////////77");
				//System.out.println(c1.rankingEquipo(LaVozArgentina.getRequisitoBatalla()));
				Comparator<Equipo> cE = new ComparadorEdades();
				Comparator<Equipo> cI = new ComparadorInverso(cE);
				//LE AGREGO UN SOLISTA PARA REFLEJAR QUE LOS ORDENA
				c1.addEquipo(p7);
				//Gonzalo, Grupo Pitusas
				System.out.println(c1.rankingEquipo(cI, cg));//criterio por genero Rock
	}
}
