package rugby6naciones;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class Torneo {
	private Date año;
	
	public List<Jornada> jornadas = new ArrayList<Jornada>();

	public Torneo(Date año) {
		this.setAño(año);
	}
	
	public Equipo ganador () {
		return null;
	}
	
	public void clasificación () {
	}

	public Date getAño() {
		return año;
	}

	public void setAño(Date año) {
		this.año = año;
	}
}
