public class Posto {

	private int codigo;
	private double capacidade;
	private boolean vegetariano;
	private boolean semLactose;

	// Metodo toString
	@Override
	public String toString() {
		return "Posto [codigo=" + codigo + ", capacidade=" + capacidade + ", vegetariano=" + vegetariano
				+ ", semLactose=" + semLactose + "]";
	}

	// metodo construtor
	public Posto(int codigo, double capacidade, boolean vegetariano, boolean semLactose) {
		super();
		this.codigo = codigo;
		this.capacidade = capacidade;
		this.vegetariano = vegetariano;
		this.semLactose = semLactose;
	}

	// Metodo Get e Set
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

	public boolean isSemLactose() {
		return semLactose;
	}

	public void setSemLactose(boolean semLactose) {
		this.semLactose = semLactose;
	}

}