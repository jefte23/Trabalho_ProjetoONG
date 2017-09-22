import java.util.ArrayList;

public class BDSimulado {

	// Atributos
	private ArrayList<ONG> ongs;
	private ArrayList<Posto> postos;

	public BDSimulado() {

		// Instanciar atributo ONG
		this.ongs = new ArrayList<ONG>();

		// Instanciar objetos
		ONG ongs1 = new ONG("fomeZero", "Claudio", "Pernambuco", postos);
		ONG ongs2 = new ONG("ComerDeNovo", "Mauro", "São Paulo", postos);
		ONG ongs3 = new ONG("MataFome", "Rodrigo", "Recife", postos);
		ONG ongs4 = new ONG("Refeicao", "Carlos", "Ceara", postos);
		ONG ongs5 = new ONG("SemFome", "Leandro", "Parana", postos);
		ONG ongs6 = new ONG("QueroComer", "Pedro", "Minas Gerais", postos);

		// colocando ONGs na Lista
		this.ongs.add(ongs1);
		this.ongs.add(ongs2);
		this.ongs.add(ongs3);
		this.ongs.add(ongs4);
		this.ongs.add(ongs5);
		this.ongs.add(ongs6);
	}

	// Metodos Get e Sets
	public ArrayList<ONG> getOngs() {
		return ongs;
	}

	public void setOngs(ArrayList<ONG> ongs) {
		this.ongs = ongs;
	}

	public ArrayList<Posto> getPostos() {
		return postos;
	}

	public void setPostos(ArrayList<Posto> postos) {
		this.postos = postos;
	}
	// ---------------------

	// Questão 2: Retorna Todas as informações de uma ONG apartir do nome
	public ONG getInfoONG(String nomeONG) {
		ONG resultado = null;

		// Percorrer Lista de ONGs
		for (int i = 0; i < this.ongs.size(); i++) {
			if (this.ongs.get(i).getNome().equals(nomeONG)) {
				resultado = this.ongs.get(i);
			}
		}
		return resultado;
	}

	// Questão 3: Retorna o numero de ONG's que existe em determinado
	public int getNumONGPorEstado(String estado) {
		int resultado = 0;
		for (int i = 0; i < this.ongs.size(); i++) {
			if (this.ongs.get(i).getEstado().equals(estado)) {
				resultado += 1;
			}
		}
		return resultado;
	}

	// Metodo para adicionar Postos as ONGS
	public void addPostosONG(String nomeONG, int codigo, double capacidade, boolean vegetariano, boolean semGluten,
			boolean semLactose) {

		// Declara um objeto de Posto
		Posto postos = new Posto(codigo, capacidade, vegetariano, semGluten, semLactose);

		// Percorre a lista de ONG's para prourar o nome
		for (int i = 0; i < this.ongs.size(); i++) {
			if (this.ongs.get(i).getNome().equals(nomeONG)) {
				this.ongs.get(i).getPostos().add(postos);
			}
		}
	}

	// Questão 4: capacidade de armazenamento de alimentos acima de 'x'
	public ArrayList<ONG> getPostosPorCapacidade(int x) {

		ArrayList<ONG> resultado = new ArrayList<>();
		for (int i = 0; i < this.ongs.size(); i++) {
			for (int j = 0; j < ongs.get(i).getPostos().size(); j++) {
				if (this.ongs.get(i).getPostos().get(j).getCapacidade() > x) {
					resultado.add(this.ongs.get(i));
				}
			}
		}
		return resultado;
	}

	// Questão 5: retorna o código dos postos que atendem vegetarianos
	public ArrayList<ONG> getPostosVegetarianos() {

		ArrayList<ONG> resultado = new ArrayList<>();

		for (int i = 0; i < this.ongs.size(); i++) {
			for (int j = 0; j < ongs.get(i).getPostos().size(); j++) {
				if (this.ongs.get(i).getPostos().get(j).isVegetariano() == true) {
					resultado.add(this.ongs.get(i));
				}
			}
		}
		return resultado;
	}

	// Retorna ONG pelo nome
	public ONG getONGporNome(String nome) {
		ONG resultado = null;

		for (int i = 0; i < this.ongs.size(); i++) {
			if (this.ongs.get(i).getNome().equals(nome)) {
				resultado = this.ongs.get(i);
			}
		}
		return resultado;
	}

	// Calcula Quantidade de Comida para postos
	public int QtdComida(int QtdHomem, int QtdMulher, int QtdCrianca) {
		int QtdComida = 0;

		if (QtdMulher == 0 && QtdCrianca == 0) {
			QtdComida = QtdHomem * 500;
		} else {
			// um homem = 500g | mulher = 300 g | criança 150 g
			QtdComida = QtdHomem * 500 + QtdMulher * 300 + QtdCrianca * 150;
		}
		return QtdComida;
	}

	public ArrayList<ONG> getBuscaPosto(int QtdHomem, int QtdMulher, int QtdCrianca) {

		int QtdComida = QtdComida(QtdHomem, QtdMulher, QtdCrianca);

		ArrayList<ONG> resultado = new ArrayList<>();
		for (int i = 0; i < this.ongs.size(); i++) {
			for (int j = 0; j < ongs.get(i).getPostos().size(); j++) {
				if (this.ongs.get(i).getPostos().get(j).getCapacidade() >= QtdComida) {
					resultado.add(this.ongs.get(i));
				}
			}
		}
		return resultado;
	}

	// retorne se ela fornece (ou não) comida para vegetarianos.
	public boolean testeVegetariano(String nomeONG) {
		boolean resultado = false;

		for (int i = 0; i < this.ongs.size(); i++) {
			if (this.ongs.get(i).equals(nomeONG)) {
				for (int j = 0; j < ongs.get(i).getPostos().size(); j++) {
					if (this.ongs.get(i).getPostos().get(j).isVegetariano() == true) {
						resultado = true;
					}
				}
			}
		}
		return resultado;
	}

	// Qtd de postos que fornecem comida sem glúten ou sem Lactose
	public int QtdPostosEspecil(String nomeONG) {
		int resultado = 0;

		for (int i = 0; i < this.ongs.size(); i++) {
			for (int j = 0; j < ongs.get(i).getPostos().size(); j++) {
				if (this.ongs.get(i).getPostos().get(j).isSemLactose() == true
						|| this.ongs.get(i).getPostos().get(j).isSemGluten() == true) {
					resultado += 1;
				}
			}
		}
		return resultado;
	}

}