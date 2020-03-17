package rugby6naciones;

public class Partido {
	private int puntosLocal;
	private int puntosVisitantes;
	private int bonusLocal;
	private int bonusVisitante;
	
	public Equipo local;
	public Equipo visitante;
	public Arbitro arbitra;

	public Partido(int puntosLocal, int puntosVisitantes, int bonusLocal, int bonusVisitante) {
		this.puntosLocal = puntosLocal;
		this.puntosVisitantes = puntosVisitantes;
		this.bonusLocal = bonusLocal;
		this.bonusVisitante = bonusVisitante;
	}

	public int getPuntosLocal() {
		return puntosLocal;
	}

	public void setPuntosLocal(int puntosLocal) {
		this.puntosLocal = puntosLocal;
	}

	public int getPuntosVisitantes() {
		return puntosVisitantes;
	}

	public void setPuntosVisitantes(int puntosVisitantes) {
		this.puntosVisitantes = puntosVisitantes;
	}

	public int getBonusLocal() {
		return bonusLocal;
	}

	public void setBonusLocal(int bonusLocal) {
		this.bonusLocal = bonusLocal;
	}

	public int getBonusVisitante() {
		return bonusVisitante;
	}

	public void setBonusVisitante(int bonusVisitante) {
		this.bonusVisitante = bonusVisitante;
	}
	
	
}
