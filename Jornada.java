package rugby6naciones;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Jornada {
	
	private Date fecha;
	
	List<Partido> partidos = new ArrayList<Partido>();
	
	public Jornada(Date fecha) {
		this.setFecha(fecha);
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
}
