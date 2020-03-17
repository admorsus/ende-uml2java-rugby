package rugby6naciones;

import java.util.Date;

public class Jugador extends Persona {
	
	public Jugador capitan;

	public Jugador(String nombre, Date fechaNacimiento) {
		super(nombre, fechaNacimiento);
	}

	public Jugador(String nombre, Date fechaNacimiento, Jugador capitan) {
		super(nombre, fechaNacimiento);
		this.capitan = capitan;
	}
}
