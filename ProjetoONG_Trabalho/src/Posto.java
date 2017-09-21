public class Posto {

	private ONG ongs;
	private int codigo;
	private double capacidade;
	private boolean vegetariano;
	private boolean semLuten;
	private boolean semLactose;

	@Override
	public String toString() {
		return "Posto [ongs=" + ongs + ", codigo=" + codigo + ", capacidade=" + capacidade + ", vegetariano="
				+ vegetariano + ", semLuten=" + semLuten + ", semLactose=" + semLactose + "]";
	}

	public Posto(ONG ongs, int codigo, double capacidade, boolean vegetariano, boolean semLuten, boolean semLactose) {
		super();
		this.ongs = ongs;
		this.codigo = codigo;
		this.capacidade = capacidade;
		this.vegetariano = vegetariano;
		this.semLuten = semLuten;
		this.semLactose = semLactose;
	}

	public ONG getOngs() {
		return ongs;
	}

	public void setOngs(ONG ongs) {
		this.ongs = ongs;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public double getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(double capacidade) {
		this.capacidade = capacidade;
	}

	public boolean isVegetariano() {
		return vegetariano;
	}

	public void setVegetariano(boolean vegetariano) {
		this.vegetariano = vegetariano;
	}

	public boolean isSemLuten() {
		return semLuten;
	}

	public void setSemLuten(boolean semLuten) {
		this.semLuten = semLuten;
	}

	public boolean isSemLactose() {
		return semLactose;
	}

	public void setSemLactose(boolean semLactose) {
		this.semLactose = semLactose;
	}

}
