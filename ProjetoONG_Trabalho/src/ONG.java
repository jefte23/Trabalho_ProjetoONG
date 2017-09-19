import java.util.ArrayList;

public class ONG {

	private String nome;
	private String responsavel;
	private String estado;
	ArrayList<Posto> postos;

	@Override
	public String toString() {
		return "ONG [nome=" + nome + ", responsavel=" + responsavel + ", estado=" + estado + ", postos=" + postos + "]";
	}

	// Metodo Construtor
	public ONG(String nome, String responsavel, String estado, ArrayList<Posto> postos) {
		super();
		this.nome = nome;
		this.responsavel = responsavel;
		this.estado = estado;
		this.postos = postos;
	}

	// Metodos Get e Set
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public ArrayList<Posto> getPostos() {
		return postos;
	}

	public void setPostos(ArrayList<Posto> postos) {
		this.postos = postos;
	}

}
