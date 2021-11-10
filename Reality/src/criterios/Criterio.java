package criterios;
import actores.Equipo;
import actores.Participante;
import canal.*;

public abstract class Criterio {
	public abstract boolean cumple(Equipo participante);
}
