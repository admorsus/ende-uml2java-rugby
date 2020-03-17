package rugby6naciones;

import java.util.List;
import java.util.ArrayList;

public class Equipo {
	
	private País nombre;
	
	public Entrenador entrenador;
	public List<Jugador> jugadores = new ArrayList<Jugador>();
	
	public Equipo(País nombre) {
		this.setNombre(nombre);
	}

	public País getNombre() {
		return nombre;
	}

	public void setNombre(País nombre) {
		this.nombre = nombre;
	}
	
}
