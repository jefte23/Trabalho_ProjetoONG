public class Posto {

	private int codigo;
	private double capacidade;
	private boolean vegetariano;
	private boolean semGluten;
	private boolean semLactose;

	@Override
	public String toString() {
		return "Posto [codigo=" + codigo + ", capacidade=" + capacidade + ", vegetariano=" + vegetariano + ", semLuten="
				+ semGluten + ", semLactose=" + semLactose + "]";
	}

	public Posto(int codigo, double capacidade, boolean vegetariano, boolean semGluten, boolean semLactose) {
		super();
		this.codigo = codigo;
		this.capacidade = capacidade;
		this.vegetariano = vegetariano;
		this.semGluten = semGluten;
		this.semLactose = semLactose;
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

	public boolean isSemGluten() {
		return semGluten;
	}

	public void setSemGluten(boolean semGluten) {
		this.semGluten = semGluten;
	}

	public boolean isSemLactose() {
		return semLactose;
	}

	public void setSemLactose(boolean semLactose) {
		this.semLactose = semLactose;
	}

}
